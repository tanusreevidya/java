// promise = new Promise(function (resolve, reject){
    
//     setTimeout(resolve, 5000)

// })
// promise.then(function(){
//     console.log('this is done');
// })

// var asyncronousFunction = function () {
//     return new Promise(function (resolve, reject) {
//         console.log('hello world');
//         setTimeout(resolve, 5000);
//     })
// }
// asyncronousFunction()
//                   .then(asyncronousFunction)
//                   .then(asyncronousFunction)


const myPromise = new Promise((resolve , reject) => {
              
          if(Math.random()*100 <= 90){
              resolve('hello, promise');
          }
          reject(new Error('In 10% of the cases I fail miserably.'));
});

const onResolved = (resolvedValue) => console.log(resolvedValue);
const onRejected = (error) => console.log(error);

myPromise.then(onResolved, onRejected)