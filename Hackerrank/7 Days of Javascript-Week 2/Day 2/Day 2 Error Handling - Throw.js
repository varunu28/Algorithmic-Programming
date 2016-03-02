function processData(my_height) {
    //Enter your code here
    try
        {
            if(isNaN(my_height))
                {
                    throw new Error("notANumberError");
                }
            else if(my_height>10)
                {
                    throw new Error("hugeHeightError");
                }
            else if(my_height<4)
                {
                    throw new Error("tinyHeightError");
                }
            console.log(my_height);
        }
    catch (err) 
    {
	console.log(err.message);
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
