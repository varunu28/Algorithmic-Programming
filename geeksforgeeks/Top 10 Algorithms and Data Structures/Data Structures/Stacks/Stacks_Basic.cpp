#include <iostream>
using namespace std;
int top = -1; 

    void push (int stack[] , int x , int n)
    {
        if ( top == n-1 )       
        {
            cout << "Stack is full.Overflow condition!" ;
        }
        else
        {
            top = top +1 ;            
            stack[top] = x ;        
        }
    }
    bool isEmpty ( )
    {
        if ( top == -1 )  
            return true ; 
        else
            return false;
    }
    void pop (int stack[] ) 
    {

        if( isEmpty ( ) )
        {
            cout << "Stack is empty. Underflow condition!" << endl ;
        }
        else    
        {
             top = top - 1 ;  
        }
    }

    int size (int stack[])
    {
        return top + 1;
    }

    int topElement (int stack[])
    {
        return stack[top];
    } 

    int main( )
    {
        int stack[3];
        push(stack , 5 , 3 );

        cout << "Current size of stack is " << size(stack) << endl ;

        push(stack , 10 , 3);
        push (stack , 24 , 3) ;

        cout << "Current size of stack is "<< size(stack) << endl ;

        push(stack , 12 , 3) ;

        cout << "The current top element in stack is " << topElement(stack) << endl;

        for(int i = 0 ; i < 3;i++ )
            pop(stack);
        cout << "Current size of stack is  "<< size(stack) << endl ;

        pop (stack);  
    }