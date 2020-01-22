enum Direction{
    NORTH,
    SOUTH,
    EAST=5,
    WEST
}

function getDirection( dirct:string):string {
    return Direction[1];
}
var out=getDirection(Direction[5]);
console.log(out);