#include <iostream>
#include <cmath>

using namespace std;

double hypotenuseCalc(double a, double b)
{
    return sqrt(pow(a,2) + pow(b,2));
}

int main()
{
    double a, b;
    cout << "Enter a: ";
    cin >> a;

    cout << "Enter b: ";
    cin >> b;

    cout << endl;

    cout << "c = " << hypotenuseCalc(a, b) << endl;

    return 0;
}