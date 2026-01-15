#include <iostream>
using namespace std;

int main()
{
    cout << "Enter the radius of a circle: ";
    double radius;
    cin >> radius;

    double c = 2 * 3.14 * radius;
    double a = 3.14 * radius * radius;

    cout << "C = " << c << endl << "A = " << a << endl;

    return 0;
}