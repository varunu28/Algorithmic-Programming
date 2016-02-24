//Global variable index has been declared and initialized
//Edit the code below.
console.log("The global index (before for-loop) is : ", index);
let a = index;
for(var index = 0; index < N; index++){
    console.log("The local index is : ",index);
}

console.log("The global index (after for-loop) is : ",a);
