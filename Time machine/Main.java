#include<iostream>
using namespace std;
int main()
{
  int h,m,s,h1,m1,s1,h2,m2,s2;
  cin>>h1>>m1>>s1>>h2>>m2>>s2;
  if (h1==1)
  {
    cout<<" ";
  }
  else
  {
    h=h1+h2;
    m=m1+m2;
    s=s1+s2;
    while(s>=60)
    {
      m=m+1;
      s=s-60;
    }
    while(m>=60)
    {
      h=h+1;
      m=m-60;
    }
    cout<<h<<":"<<m<<":"<<s;
  }
}