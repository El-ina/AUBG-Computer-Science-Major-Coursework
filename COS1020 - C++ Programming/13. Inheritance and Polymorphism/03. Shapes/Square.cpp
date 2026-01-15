//
// Created by Elina Malchinikolova on 15.01.26.
//

#include "Square.h"
#include <iostream>

Square::Square()
{

}

void Square::setX(double x)
{
    if (x <= 0)
    {
        std::cerr << "Invalid square side!" << std::endl;
        this->x = -1;
    }

    else
    {
        this-> x = x;
    }
}


double Square::getX() const
{
    if (x == -1)
    {
        std::cerr << "Cannot get the side of an invalid square!" << std::endl;
        return NAN;
    }

    return x;
}

Square::Square(double x)
{
    setX(x);
}

double Square::getArea()
{
    if (x == -1)
    {
        std::cerr << "Cannot get the area of an invalid square!" << std::endl;
        return NAN;
    }

    return x * x;
}

double Square::getPerimeter()
{
    if (x == -1)
    {
        std::cerr << "Cannot get the perimeter of an invalid square!" << std::endl;
        return NAN;
    }

    return 4 * x;
}