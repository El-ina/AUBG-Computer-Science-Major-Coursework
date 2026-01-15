#include <iostream>
#include "Point.h"
#include "Point.cpp"
using namespace std;

int main()
{
    double x1, y1, x2, y2;

    cout << "Enter x1: ";
    cin >> x1;

    cout << "Enter y1: ";
    cin >> y1;

    const Point p1(x1, y1);

    cout << endl;

    cout << "Enter x2: ";
    cin >> x2;

    cout << "Enter y2: ";
    cin >> y2;

    const Point p2(x2, y2);

    cout << endl << "Distance: " << p2.calcDistance(p1);


    return 0;
}