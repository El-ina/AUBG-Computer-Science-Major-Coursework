#include <iostream>
#include "Divider.h"
#include "Divider.cpp"
using namespace std;

int main()
{
    double enumerator, denominator;

    cout << "Enter the enumerator: ";
    cin >> enumerator;

    cout << "Enter the denominator: ";
    cin >> denominator;


    Divider divider = Divider(enumerator, denominator);
    cout << "Your fraction evaluates to: " << divider.result() << endl;

    return 0;
}