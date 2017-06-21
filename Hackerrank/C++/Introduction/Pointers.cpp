#include <stdio.h>
#include <cmath>

void update(int *a,int *b) {
    // Complete this function    
    int t1 = *a;
    int t2 = *b;
    *a = t1 + t2;
    *b = std::abs(t1-t2);
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
