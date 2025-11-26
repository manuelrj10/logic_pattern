#include<stdio.h>
int main(){
    int n=5;
    for(int row=n;row>=1;row--){
        for(int space=1;space<=n-row;space++){
            printf(" ");
        }
        for(int star=1;star<=row;star++){
            printf("*");
        }
printf("\n");
}


}