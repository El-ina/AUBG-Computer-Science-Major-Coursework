#include <iostream>
#include "Circle.h"
#include "Circle.cpp"
using namespace std;

int main()
{
    double radius;
    cout << "Enter the circle's radius: ";
    cin >> radius;

    Circle circle = Circle(radius);
    cout << "\nRadius: " << circle.getRadius() << "\nArea: " << circle.getArea() << "\n" << "Circumference: " << circle.getPerimeter() << endl;

    return 0;
}