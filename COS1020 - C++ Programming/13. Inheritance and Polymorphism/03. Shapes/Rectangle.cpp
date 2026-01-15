#include "Rectangle.h"
#include <iostream>

Rectangle::Rectangle()
{

}

void Rectangle::setX(double x)
{
    if (x <= 0)
    {
        std::cerr << "Invalid rectangle x!" << std::endl;
        this->x = -1;
    }

    else
    {
        this-> x = x;
    }
}

double Rectangle::getX() const
{
    if (x == -1)
    {
        std::cerr << "Cannot get the x of an invalid rectangle!" << std::endl;
        return NAN;
    }

    return x;
}

void Rectangle::setY(double y)
{
    if (y <= 0)
    {
        std::cerr << "Invalid rectangle y!" << std::endl;
        this->y = -1;
    }

    else
    {
        this-> y = y;
    }
}

double Rectangle::getY() const
{
    if (y == -1)
    {
        std::cerr << "Cannot get the y of an invalid rectangle!" << std::endl;
        return NAN;
    }

    return y;
}

Rectangle::Rectangle(double x, double y)
{
    setX(x);
    setY(y);
}


double Rectangle::getArea()
{
    if (x == -1 || y == -1)
    {
        std::cerr << "Cannot get the area of an invalid rectangle!" << std::endl;
        return NAN;
    }

    return x * y;
}

double Rectangle::getPerimeter()
{
    if (x == -1 || y == -1)
    {
        std::cerr << "Cannot get the perimeter of an invalid rectangle!" << std::endl;
        return NAN;
    }

    return 2 * (x + y);
}
