/*You are required to complete this function*/
void addFraction(int num1, int den1, int num2,int den2)
{
    int i;
    if(den1==den2)
    {
        i=den1;
    }
    else
    {
        i = max(den1,den2);
        while(true)
        {
            if(i%den1==0 && i%den2==0)
            {
                break;
            }
            i++;
        }
    }
    int new_num = num1*(i/den1) + num2*(i/den2);

    int j=2;
    int hcf = 1;
    while(j <= min(new_num, i))
    {
        if(new_num%j==0 && i%j==0)
        {
            hcf = j;
        }
        j++;
    }
    
    new_num /= hcf;
    i /= hcf;
    cout << new_num << "/" << i << endl;
}