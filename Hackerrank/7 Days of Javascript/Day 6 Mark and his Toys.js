function processData(input) {
    var rows = input.split('\n');
    var tot_cash = rows[0].split(' ').map(Number)[1];
    var val_arr = rows[1].split(' ').map(Number);
    val_arr = val_arr.sort(function(a, b){return a-b}); 
    var numofToys = 0;
    while(tot_cash>=0) {
        tot_cash -= val_arr[numofToys];
        numofToys++;
    }
    
    console.log(numofToys-1);
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