#include<iostream>
using namespace std;

class Customer
{
    public:
	char name[50],address[50],contact[10];
    char email[50],type[50],id[12];
    void get(){
       cout<<"Registration\nEnter your name\nEnter your address\nContact Number\nE-Mail ID\nEnter proof type\nEnter proof id\nCustomer Details\n";
      cin>>name;
      cout<<name<<"\n";
      cin>>address;
      cout<<address<<"\n";
      cin>>contact;
      cout<<contact<<"\n";
      cin>>email;
      cout<<email<<"\n";
      cin>>type>>id;
      cout<<type<<"\n"<<id<<"\n";
      cout<<"Thank you for registering. Your id is 1...";
    }
};
int main()
{
    Customer c;
    c.get();
    return 0;
}