function processData(myArray) {
    myArray.sort(function(a, b){return b-a});
    var i=0;
    while(i<myArray.length)
        {
            if(myArray[i]!==myArray[i+1])
                {
                    console.log(myArray[i+1]);
                    break;
                }
            i++;
        }
}


// tail starts here
process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input.split('\n')[1].split(' ').map(Number));
});
