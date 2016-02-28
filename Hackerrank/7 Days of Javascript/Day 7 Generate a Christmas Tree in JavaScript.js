function processData(input) {
   
var i = 0, j = 1, y = 8;
   
   console.log(" ".repeat(8)+"*");
    
   while(i < 9){
       
       console.log(" ".repeat(y) + "0".repeat(j));
       
       j+=2;
       y--;
       i++;
   }
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});