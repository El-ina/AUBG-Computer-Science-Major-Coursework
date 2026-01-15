#include <iostream>
#include "Triangle.h"
#include "Triangle.cpp"
using namespace std;

int main()
{
    Triangle triangles[4];

    for (int i = 0; i <= 3; i++)
    {
        double a, b, c;
        cout << "Enter triangle " << i + 1 << "'s a: ";
        cin >> a;

        cout << "Enter triangle " << i + 1 << "'s b: ";
        cin >> b;

        cout << "Enter triangle " << i + 1 << "'s c: ";
        cin >> c;

        Triangle triangle(a, b, c);
        triangles[i] = triangle;

        cout << endl;
    }

    for (int i = 0; i < 4; i++)
    {
        if (triangles[i].getType() != "Invalid")
        {
            cout << triangles[i].getType() << " triangle " << i + 1 << "'s perimeter is: " << triangles[i].getPerimeter() << endl;
        }
    }

    return 0;
}