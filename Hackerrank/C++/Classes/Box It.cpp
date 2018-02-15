#include<bits/stdc++.h>

using namespace std;


//Implement the class Box  
//l,b,h are integers representing the dimensions of the box

// The class should have the following functions : 

// Constructors: 
// Box();
// Box(int,int,int);
// Box(Box);


// int getLength(); // Return box's length
// int getBreadth (); // Return box's breadth
// int getHeight ();  //Return box's height
// long long CalculateVolume(); // Return the volume of the box

//Overload operator < as specified
//bool operator<(Box& b)

//Overload operator << as specified
//ostream& operator<<(ostream& out, Box& B)

class Box {
    private:
        int l = 0;
        int b = 0;
        int h = 0;
    
    public:
    
        int getLength() const {
            return this->l;
        }
    
        int getBreadth() const {
            return this->b;
        }
    
        int getHeight() const {
            return this->h;
        }
    
        Box() {

        }
    
        Box(int l, int b, int h) {
            this->l = l;
            this->b = b;
            this->h = h;
        } 
    
        Box(const Box& box) {
            this->l = box.getLength();
            this->b = box.getBreadth();
            this->h = box.getHeight();
        }
    
        long long CalculateVolume() {
            long long vol = 1;
            vol *= l;
            vol *= b;
            vol *= h;
            return vol;
        }
    
        bool operator<(Box& box) {
            if (this->l < box.getLength()) return true;
            else if (this->l == box.getLength() && this->b < box.getBreadth()) return true;
            else {
                return (this->l == box.getLength()) && (this->b == box.getBreadth()) && (this->h < box.getHeight());
            }
        }
    
};

ostream& operator<<(ostream& out, Box B) {
    char c = ' ';
    out << B.getLength() << c << B.getBreadth() << c << B.getHeight();
    return out;
}

void check2()
{
	int n;
	cin>>n;
	Box temp;
	for(int i=0;i<n;i++)
	{
		int type;
		cin>>type;
		if(type ==1)
		{
			cout<<temp<<endl;
		}
		if(type == 2)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			temp=NewBox;
			cout<<temp<<endl;
		}
		if(type==3)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			if(NewBox<temp)
			{
				cout<<"Lesser\n";
			}
			else
			{
				cout<<"Greater\n";
			}
		}
		if(type==4)
		{
			cout<<temp.CalculateVolume()<<endl;
		}
		if(type==5)
		{
			Box NewBox(temp);
			cout<<NewBox<<endl;
		}

	}
}

int main()
{
	check2();
}
