//Multiples of 3 and 5

var n=1;
var sum=0;
while(n<1000)
{
    if(n%3===0 && n%5===0)
    {
        sum+=n;
    }
    else if(n%3!==0 && n%5===0)
    {
        sum+=n;
    }
    else if(n%3===0 && n%5!==0)
    {
        sum+=n;
    }
    n++;
}
console.log(sum);