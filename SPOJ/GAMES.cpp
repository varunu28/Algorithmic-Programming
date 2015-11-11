#include <bits/stdc++.h>
using namespace std ;

typedef long long ll ;

ll gcd ( ll a , ll b ){  return ( b == 0 ? a : gcd ( b , a%b )) ; }


int main(){

string c ;
int test ;

cin >> test ;

while ( test-- ){

     cin >> c ;
     ll a = 0 ;
     int len = 0 ;
     bool f = false ;
     for ( int i = 0 ; i < c.length() ; i++)
     if ( c[i] == '.' ){
        f  = true ; continue ;
     }
     else if (f){
        a  = a*10 +  ( c[i] - '0' ) ;
        len++ ;
     }

     if ( len > 0 ){
         ll den = 1 ;
        while (len--)
            den *= 10 ;
        cout << den/gcd(a,den) <<"\n" ;

     }else{
     cout<<"1\n";
     }


}



return 0 ;

}