#include <iostream>
using namespace std;

void printArray(int* a, int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << *a << " ";
        a++;
    }
}


int main()
{

    int arr[] = {1, 2, 3, 4, 5};
    printArray(arr, 5);

    return 0;
}