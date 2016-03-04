function multiplier(x) {
    return function(y)
    { 
        return x*y; 
    }
}

function processData(input) {
    var waterWeight = multiplier(1);
    var mercuryWeight = multiplier(1.355);
    var oilWeight = multiplier(0.900);
    
    console.log("Weight of " + input + " metric cube of water = " + waterWeight(input) + " kg");
    console.log("Weight of " + input + " metric cube of mercury = " + mercuryWeight(input) + " kg");
    console.log("Weight of " + input + " metric cube of oil = " + oilWeight(input) + " kg");
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(Number(_input));
});
