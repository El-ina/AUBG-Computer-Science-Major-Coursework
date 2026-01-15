#include <iostream>
using namespace std;

int main()
{
    double a, b;
    cout << "Enter the first number: ";
    cin >> a;
    cout << "Enter the second number: ";
    cin >> b;
    double sum = a + b;
    double difference = a - b;
    double product = a * b;
    double quotient = a / b;

    cout
    << a << " + " << b << " = " << sum << endl
    << a << " - " << b << " = " << difference << endl
    << a << " * " << b << " = " << product << endl
    << a << " / " << b << " = " << quotient << endl;

    return 0;
}