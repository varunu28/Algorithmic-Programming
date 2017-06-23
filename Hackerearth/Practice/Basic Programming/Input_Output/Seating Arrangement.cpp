#include <iostream>
#include <cmath>

using namespace std;

int main() {
	int t;
	cin >> t;
	while(t--) {
	    int inp;
	    cin >> inp;
	    string ans;
	    int seat;
	    if (inp%6 == 0 || inp%6 == 1) {
	        ans = "WS";
	        if (inp%6 == 0) {
	            if ((inp/6)%2 == 0) {
	                seat = inp - 11;
	            }
	            else {
	                seat = inp+1;
	            }
	        }
	        else {
	            if ((inp/6)%2 == 0) {
	                seat = inp + 11;
	            }
	            else {
	                seat = inp-1;
	            }
	        }
	    }
	    else if (inp%6 == 5 || inp%6 == 2) {
	        ans = "MS";
	        if (inp%6 == 5) {
	            if ((inp/6)%2 == 0) {
	                 seat = inp + 3;
	            }
	            else {
	                seat = inp - 9;
	            }
	        }
	        else {
	            if ((inp/6)%2 == 0) {
	                seat = inp + 9;
	            }
	            else {
	                seat = inp - 3;
	            }
	        }
	    }
	    else if (inp%6 == 3 || inp%6 == 4) {
	        ans = "AS";
	        if (inp%6 == 4) {
	            if ((inp/6)%2 == 0) {
	                 seat = inp + 5;
	            }
	            else {
	                seat = inp - 7;
	            }
	        }
	        else {
	            if ((inp/6)%2 == 0) {
	                seat = inp + 7;
	            }
	            else {
	                seat = inp - 5;
	            }
	        }
	    }
	    cout << seat << " " << ans << endl;
	}
	return 0;
}