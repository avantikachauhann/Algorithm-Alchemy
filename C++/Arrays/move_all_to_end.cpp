#include<bits/stdc++.h>
using namespace std;
int main(){
    int ar[]={12,30,0,1,0,2,0,0,5,11,0},size=11,index=0;
    for(int i=0; i<size; i++){
        if(ar[i]!=0){
            ar[index++]=ar[i];
        }
    }
    for(int i=index; i<size; i++)
    ar[i]=0;
    for(int i=0; i<size; i++)
    cout<<ar[i]<<" ";
return 0;
}
