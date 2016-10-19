int isPowerOfFour(unsigned int n)
{
  // Your code goes here
  
  while(n%4==0)
  {
      n/= 4;
  }
  
  if(n==1)
  {
      return 1;
  }
  else
  {
      return 0;
  }
}