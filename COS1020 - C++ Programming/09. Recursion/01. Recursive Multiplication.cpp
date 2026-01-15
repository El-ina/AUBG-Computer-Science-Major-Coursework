#include <iostream>
using namespace std;

int multiplyRecursively(int numA, int numB)
{
    if (numA == 0 || numB == 0)
    {
        return 0;
    }

    else
    {
        return numA + multiplyRecursively(numA, numB - 1);
    }
}

int main()
{
    int numA, numB;

    cout << "Enter Number A: ";
    cin >> numA;

    cout << "Enter Number B: ";
    cin >> numB;

    cout << "\nResult: " << multiplyRecursively(numA, numB) << endl;

    return 0;
}