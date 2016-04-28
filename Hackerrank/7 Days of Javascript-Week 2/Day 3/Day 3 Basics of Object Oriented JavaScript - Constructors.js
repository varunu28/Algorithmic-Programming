//Write your constructor below this line

var Car = function(name,mileage,max_speed)
{
    this.name=name;
    this.mileage=mileage;
    this.max_speed=max_speed;
};




//Don't edit anything below this line.
function processData(input) {
    var my_car = new Car(input[0], input[1], input[2]) 
    console.log(my_car.name);
    console.log(my_car.mileage);
    console.log(my_car.max_speed);
} 


process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input.split(" "));
});