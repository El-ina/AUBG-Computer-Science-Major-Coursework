#include <iostream>
using namespace std;

int factorial(int n)
{
    int factorial = 1;
    for (int i = 2; i <= n; i++)
    {
        factorial *= i;
    }

    return factorial;
}

int main()
{
    int num;
    cout << "Enter the number: ";
    cin >> num;
    cout << endl;

    cout << num << "! = " << factorial(num) << endl;

    return 0;
}