#include <iostream>
#include "Shape.h"
#include "Shape.cpp"
#include "Rectangle.h"
#include "Rectangle.cpp"
#include "Square.h"
#include "Square.cpp"
using namespace std;

int main()
{
    Square sq(2);
    Rectangle rect(1, 2);

    cout << "Square:\n" << "- Area: " << sq.getArea() << "\n- Perimeter: " << sq.getPerimeter() << endl << endl;
    cout << "Rectangle:\n" << "- Area: " << rect.getArea() << "\n- Perimeter: " << rect.getPerimeter() << endl;


    return 0;
}