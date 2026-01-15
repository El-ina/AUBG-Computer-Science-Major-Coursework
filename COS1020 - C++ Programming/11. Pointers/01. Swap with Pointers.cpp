#include <iostream>
using namespace std;

void change(int* a, int* b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main()
{
    int a = 5;
    int b = 6;

    int* ptrA = &a;
    int* ptrB = &b;

    change(ptrA, ptrB);

    cout << a << '\n' << b << endl;

    delete ptrA;
    delete ptrB;

    return 0;
}