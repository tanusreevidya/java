
var num = new Array(10)
for(var i=0;i<num.length; i++)
{
    num[i]=Math.floor(Math.random()*100);
 }
function div()
{
    for(var i=0;i<num.length; i++)
    {
     return (num[i]%2==0 && num[i]%5==0)
}
}
 var passed = num.filter(div);
 console.log(passed);
// let div = num.filter((x)=>x%2==0 && x%5==0);
//  console.log(div);
//  let inc = div.map((x)=>parseInt(x*1.1));
//  console.log(inc);