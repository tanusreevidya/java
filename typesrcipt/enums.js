var Direction;
(function (Direction) {
    Direction[Direction["NORTH"] = 0] = "NORTH";
    Direction[Direction["SOUTH"] = 1] = "SOUTH";
    Direction[Direction["EAST"] = 5] = "EAST";
    Direction[Direction["WEST"] = 6] = "WEST";
})(Direction || (Direction = {}));
function getDirection(dirct) {
    return Direction[1];
}
var out = getDirection(Direction[5]);
console.log(out);
