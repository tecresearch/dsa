#include<iostream>
using namespace std;
struct Node
{
    int data;
    Node *next;
};
class SinglyCircularLinkedList
{
    Node *first;
    Node *last;
    int nodes_count;
public:
    SinglyCircularLinkedList()
    {
        first = NULL;
        last = NULL;
        nodes_count = 0;
    }
    void insert_at_end()
    {
        int value;
        Node *current = new Node;
        if(current != NULL)
        {
            cout<<"\nEnter the node value\n";
            cin>>value;
            current->data = value;
            if(first == NULL)
            {
                first = current;
            }
            else
            {
                last->next = current;
            }
            last = current;
            last->next = first;
            nodes_count++;
        }
        else
        {
            cout<<"\nMemory is not available\n";
        }
    }
    void traverse()
    {
        if(first != NULL)
        {
            Node *pos = first;
            cout<<"\nNode values of singly circular linked list are\n";
            while(pos->next != first)
            {
                cout<<pos->data<<" ";
                pos = pos->next;
            }
            cout<<pos->data<<endl;
        }
        else
        {
            cout<<"\nNo node value to traverse\n";
        }
    }
    void delete_from_end()
    {
        if(first != NULL)
        {
            int value;
            Node *pos,  *second_last;
            pos = last;
            if(first != last)
            {
                second_last = first;
                while(second_last->next != last)
                {
                    second_last = second_last->next;
                }
                last = second_last;
                last->next = first;
            }
            else
            {
                first =  NULL;
                last = NULL;
            }
            value = pos->data;
            delete pos;
            nodes_count--;
            cout<<"\nValue of node deleted from end: "<<value<<endl;
        }
        else
        {
            cout<<"\nSingly Circular Linked list is empty\n";
        }
    }
};
int main()
{
    int ch;
    SinglyCircularLinkedList scll;
    do
    {
        cout<<"\nEnter 1 to insert at end of singly circular linked list\n";
        cout<<"Enter 2 to traverse singly circular linked list\n";
        cout<<"Enter 3 to delete from end of singly circular linked list\n";
        cout<<"Enter 4 to exit from program\n";
        cout<<"\nEnter your choice\n";
        cin>>ch;
        switch(ch)
        {
        case 1:
            scll.insert_at_end();
            break;
        case 2:
            scll.traverse();
            break;
        case 3:
            scll.delete_from_end();
            break;
        case 4:
            exit(0);
        default:
            cout<<"\nWrong choice entered\n";
        }
    }while(true);
    return 0;
}
