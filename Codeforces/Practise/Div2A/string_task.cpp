#include<string>
#include<iostream>
using namespace std;
int main()
{
    string str;
    string ans;
    char dot = '.';
    getline(cin,str);
    int len = str.size();
    int i,j=0;
    for(i=0;i<len;i++)
    {
    if(str[i]=='A' || str[i]=='a');
    else if(str[i]=='E' || str[i]=='e');
    else if(str[i]=='I' || str[i]=='i');
    else if(str[i]=='O' || str[i]=='o');
    else if(str[i]=='U' || str[i]=='u');
    else if(str[i]=='Y' || str[i]=='y');
    else if(str[i]>=65 && str[i]<=90)
    {
    str[i]=str[i]+32;
    ans=ans+dot+str[i];
    }
    else
    {
    ans=ans+dot+str[i];
    }
    
    }
    cout<<ans<<endl;
    return 0;
}