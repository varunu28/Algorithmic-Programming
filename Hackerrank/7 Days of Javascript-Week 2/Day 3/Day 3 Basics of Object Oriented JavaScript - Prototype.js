function Square(A, B, C, D){
    this.A = A;
    this.B = B;
    this.C = C;
    this.D = D;
}
//Write Your Code Below This Line
Square.prototype.isSquare=function()
{
    if(this.A==this.B && this.B==this.C && this.C==this.D)
        {
            console.log(true);
        }
    else
        {
            console.log(false);
        }
}


//Don't Edit Code Below This Line
function processData(input) {
    var sq1 = new Square(input[0], input[1], input[2], input[3]);
    sq1.isSquare();
    
    console.log(Object.getPrototypeOf(sq1));
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   _input = _input.split(' ').map(num => Number(num)); 
   processData(_input);
});
