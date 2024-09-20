#include<iostream>
#include<stdlib.h>
using namespace std;
class Array
{
   int data[5];
   int max_size;
   int length;
   public:
       Array()
       {
           max_size = 5;
           length = 0;
       }
       void insert_at_end()
       {
           if(length < max_size)
           {
               int value;
               cout<<"\nEnter the value\n";
               cin>>value;
               data[length] = value;
               length++;
           }
           else
           {
               cout<<"\nArray is full\n";
           }
       }
       void traverse()
       {
           if(length > 0)
           {
                cout<<"\nValue of array are\n";
                for(int i = 0; i <= length - 1; i++)
                {
                    cout<<data[i]<<" ";
                }
                cout<<endl;
           }
           else
           {
               cout<<"\nNo value to traverse\n";
           }
       }
       void insertionsort()
       {
           if(length > 0)
           {
                for(int i = 1; i <= length - 1; i++)
                {
                    for(int j = 0; j <= i - 1; j++)
                    {
                        if(data[j] > data[i])
                        {
                            int t = data[i];
                            for(int k = i; k >= j + 1; k--)
                            {
                                data[k] = data[k - 1];
                            }
                            data[j] = t;
                        }
                    }
                }
           }
           else
           {
               cout<<"\nNo value to sort\n";
           }
       }
};
int main()
{
    Array a;
    int ch;
    do
    {
        cout<<"\nEnter 1 to add value at end of array\n";
        cout<<"Enter 2 to traverse values of array\n";
        cout<<"Enter 3 to sort values of array\n";
        cout<<"Enter 4 to exit from program\n";
        cout<<"\nEnter your choice\n";
        cin>>ch;
        switch(ch)
        {
        case 1:
            a.insert_at_end();
            break;
        case 2:
            a.traverse();
            break;
        case 3:
            a.insertionsort();
            break;
        case 4:
            exit(0);
        default:
            cout<<"\nWrong choice entered\n";
        }
    }while(true);
    return 0;
}
