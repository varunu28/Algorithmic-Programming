function findN(r, c, maxr, maxc, lelarray){

    if(r >= maxr) r = maxr-1;
    if(c >= maxc) c = maxc-1;
    if(r < 0) r = 0;
    if(c < 0) c = 0;

    count = 0;
    var val = lelarray[r][c];
    if(val == -69) return 0; 
    if(val == 0) return 0;
    if(val == 1){
        count++;
        lelarray[r][c] = -69; 

        count += findN(r+1, c, maxr, maxc, lelarray);
        count += findN(r-1, c, maxr, maxc, lelarray);
        count += findN(r, c+1, maxr, maxc, lelarray);
        count += findN(r, c-1, maxr, maxc, lelarray);
        count += findN(r+1, c+1, maxr, maxc, lelarray);
        count += findN(r-1, c-1, maxr, maxc, lelarray);
        count += findN(r-1, c+1, maxr, maxc, lelarray);
        count += findN(r+1, c-1, maxr, maxc, lelarray);
    }
    return count;
}

function processData(input) {

    var lines = input.split("\n");
    var r = Number(lines[0]);
    var c = Number(lines[1]);
    var arr = Array();
    var cur = 2;
    while(r - arr.push(lines[cur].split(" ").map(Number)) > 0) { cur++; }

    var counts = Array();
    for(var i = 0; i < r; i++){
        for(var j = 0; j < c; j++){
            if(arr[i][j] == 1){
                counts.push(findN(i, j, r, c, arr));
            }
        }
    }

    var result = 0;
    for(var i = 0; i < counts.length; i++){
        if(counts[i] >= result){
            result = counts[i];
        }
    }
    console.log(result);
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