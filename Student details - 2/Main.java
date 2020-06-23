#include <iostream>
#include <stdio.h>
#include <string.h>
using namespace std;

struct student
{
    int age;
    string fname;
    string lname;
    int stand;
};

int main() 
{
    student s;
    cin >> s.age;
    

	getchar();
	getline(cin,s.fname);
//	cout<<"FNAME :"<<s.fname<<"\n";
	getline(cin,s.lname);

//	cin.getline(s.fname,50);
//	cin.getline(s.lname,50);
	cin >> s.stand;
	
    if (s.age<6 || s.age>17 || s.stand <1 || s.stand>12)
    {
      cout<<"No Admission";
    }
	else
    {
      	cout<<s.age<<"\n";
      	cout<<s.lname<<", "<<s.fname<<"\n";
    	cout<<s.stand<<"\n"<<"\n";
      	cout << s.age <<","<<s.fname<<","<<s.lname<<","<<s.stand;
    }
      return 0;
}
