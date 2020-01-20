// var func1 = function (){
//     var func2 = function(){
//         for(var x=0;x<5; x++)
//         {
//             console.log(x);
//         }
//     }();
// }
// func1();

function* ask()
{
    const name = yield " name";
    const sports = yield "sports";
    return `${name} ${sports}`;
}
var it = ask();
console.log(it.next());
console.log(it.next('divya'));
console.log(it.next('tanu'));
console.log(it.next('sree'));
