function processData(my_string) {
    try
        {
            my_string=my_string.split('').reverse().join('');
            console.log("Reversed string is : "+my_string);
        }
    catch (err) 
    {
    console.log("Error : "+ err.message);
    }
    finally
        {
            console.log("Type of my_string is : "+typeof(my_string));
        }
} 


process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(eval(_input));
});