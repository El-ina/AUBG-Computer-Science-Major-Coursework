#include <iostream>
#include <cmath>

using namespace std;

int rectPerimeter(double a, double b)
{
    return 2 * (a + b);
}

int rectArea(double a, double b)
{
    return a * b;
}

int main()
{
    double a, b;

    cout << "Enter a: ";
    cin >> a;

    cout << "Enter b: ";
    cin >> b;

    cout << endl;

    cout << "Perimeter = " << rectPerimeter(a, b) << endl;
    cout << "Area = " << rectArea(a, b) << endl;

    return 0;
}