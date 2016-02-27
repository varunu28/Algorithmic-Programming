function processData(input) {
var string=input.split('\n');
var t=parseInt(string[0]);
 for(var i=0;i<t;i++){
    var count=0;
    var current_string=input.split('\n')[i+1];
    var s=0;
    var l=current_string.length-1;
    while(s<=l){
        count+=Math.abs(current_string.charCodeAt(l)-current_string.charCodeAt(s));
        s++;
        l--;
    }
 console.log(count);

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
