function processData(input) {
    var items = input.split('');
    var itemOne = items[0];
    var itemTwo = items[1];
    
    for(var i = 0; i < 14; i++){
        console.log(decodeURI("\u2571\u2572").repeat(7));
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
