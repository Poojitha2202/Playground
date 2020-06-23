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
    
//	cout<<"AGE :"<<s.age<<"\n";
	getchar();
	getline(cin,s.fname);
//	cout<<"FNAME :"<<s.fname<<"\n";
	getline(cin,s.lname);
//	cout<<"LNAME :"<<s.lname<<"\n";
//	cin.getline(s.fname,50);
//	cin.getline(s.lname,50);
	cin >> s.stand;
//	cout<<"STAND :"<<s.stand<<";\n";

    cout << s.age <<" "<<s.fname<<" "<<s.lname<<" "<<s.stand;
    return 0;
}
