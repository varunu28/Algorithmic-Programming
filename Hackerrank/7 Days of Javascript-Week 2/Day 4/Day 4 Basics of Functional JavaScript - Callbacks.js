function myFilter(my_array, callback){
    //Enter your code here
    var arr = [];
	for(var index in my_array){
        if(callback(my_array[index])==0)
		  arr.push(my_array[index]);
	}
	return arr;
   
  
  
  
}

function processData(inputArray) {
    //In blank write anonymous function, which takes one parameter and returns true if its even or false if its odd.
    console.log(myFilter(inputArray, (x) => x%2 ));   
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input.split(' ').map(num => Number(num)));
});
