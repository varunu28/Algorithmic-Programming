    #include <iostream>
    using namespace std;
     
    int main()
    {
        int t;
        cin >> t;
        unsigned long long curr,prev;
        int n,id,play;
        char s;
        while(t--)
        {
        	cin >> n >> id;
        	
        	curr = id;
        	while(n--)
        	{
        		cin >> s;
        		if(s=='P')
        		{
        			cin >> play;
        			prev = curr;
        			curr = play;
        		}
        		else
        		{
        			curr = curr + prev;
        			prev = curr - prev;
        			curr = curr - prev;
        		}
        	}
        	cout << "Player " << curr << endl;
        }
        return 0;
    }