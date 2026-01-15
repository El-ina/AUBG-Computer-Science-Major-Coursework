#include <iostream>
using namespace std;

void change(int& a, int& b)
{
    int temp = a;
    a = b;
    b = temp;
}

int main()
{
    int a = 5;
    int b = 6;

    change(a, b);

    cout << a << '\n' << b << endl;

    return 0;
}