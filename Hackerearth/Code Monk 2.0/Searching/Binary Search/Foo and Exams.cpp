#include<iostream>
#include<cmath>
int main()
{
	unsigned long k,a,b,c,d,t,T;
	std::cin>>T;
	while(T--)
	{
		std::cin>>a>>b>>c>>d>>k;
		t=(int)floor(cbrt((float)((k)/a)))+1; 	
		while(t--)								
		if((d+(t)*(c+(t)*(b+a*(t))))<=k||t==0) 	
		{
 		std::cout<<t<<"\n";						
		break;									
		}
	}
    return 0;
}