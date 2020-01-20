// function test(a,b=2)
// {
//     return a+b;
// }
// console.log(test(4,6))

// var func = function(a , b){return a + b}
// console.log(func(2,3))

// var func = new Function("a" , "b" , "return a/b;");
// console.log(func(20,10)) 

function func(a){
    if(a <= 0) return 1;
return a*func(a-1)
}
console.log(func(3))

var foo = (x)=> 20+x
console.log(foo(2))
