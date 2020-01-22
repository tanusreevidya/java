function getArray(items) {
    return new Array().concat(items);
}
var myNumArr = getArray([100, 200, 300]);
var myStrArr = getArray(["Hello", "World"]);
myNumArr.push(400);
myStrArr.push("Hii");
console.log(myNumArr);
console.log(myStrArr);
myNumArr.pop();
myStrArr.pop();
console.log(myNumArr);
console.log(myStrArr);
