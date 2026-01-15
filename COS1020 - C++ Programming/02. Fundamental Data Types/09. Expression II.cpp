#include <iostream>
using namespace std;

int main()
{
    double a, b, c;
    cout << "Enter a: ";
    cin >> a;
    cout << "Enter b: ";
    cin >> b;
    cout << "Enter c: ";
    cin >> c;

    double expressionOne = a * a + b * b;
    double expressionTwo = b * b - 4 * a * c;
    double expressionThree = (1 + b * b + c * c) / (1 + a * a);

    cout << "Expression One: " << expressionOne << endl << "Expression Two: " << expressionTwo << endl << "Expression Three: " << expressionThree << endl;

    return 0;
}