#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

class Person {
    public:
        int age;
        string name;
        virtual void getdata()
        {}
        virtual void putdata()
        {} 
};

class Professor:public Person
{
        public:  
            int publications,id1;
            static int cur_id1;
            virtual void getdata()
                {   
                    cur_id1++;
                    cin>>name;
                    cin>>age;
                    cin>>publications;
                    id1=cur_id1;
                }
            virtual void putdata()
                {
                    cout<<name<<" "<<age<<" "<<publications<<" "<<id1<<"\n";

                }

};int Professor::cur_id1=0;

class Student: public Person {
        public: 
        int marks[6];
        static int cur_id;
        int sum=0,id;
        virtual void getdata()
            {
                cur_id++;
                cin>>name>>age;
                for(int i=0;i<6;i++)
                    {
                        cin>>marks[i];
                         sum+=marks[i];
                         id=cur_id;
                    }     
        }
        virtual void putdata() {
            cout << name << " " << age << " " << sum << " " << id << endl;
        }
};int Student::cur_id=0;

int main(){

    int n, val;
    cin>>n; //The number of objects that is going to be created.
    Person *per[n];

    for(int i = 0;i < n;i++){

        cin>>val;
        if(val == 1){
            // If val is 1 current object is of type Professor
            per[i] = new Professor;

        }
        else per[i] = new Student; // Else the current object is of type Student

        per[i]->getdata(); // Get the data from the user.

    }

    for(int i=0;i<n;i++)
        per[i]->putdata(); // Print the required output for each object.

    return 0;

}
