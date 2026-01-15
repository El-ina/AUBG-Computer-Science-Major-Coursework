#include "Circle.h"
#include <iostream>

Circle::Circle()
{
    radius = 1;
}

double Circle::getRadius() const
{
    return radius;
}

void Circle::setRadius(double r)
{
    if (r <= 0)
    {
        std::cerr << "Radius must be greater than zero!" << std::endl;
        return;
    }
    radius = r;
}

Circle::Circle(double r)
{
    setRadius(r);
}

double Circle::getArea() const
{
    return 3.14159 * radius * radius;
}

double Circle::getPerimeter() const
{
    return 2 * 3.14159 * radius;
}
