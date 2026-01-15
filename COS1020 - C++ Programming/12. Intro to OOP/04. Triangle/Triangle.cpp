#include "Triangle.h"

Triangle::Triangle()
{

}

bool Triangle::isValid(double a, double b, double c) const
{
    return (a > 0 && b > 0 && c > 0) && ((a + b > c) && (a + c > b) && (b + c > a));
}

Triangle::Triangle(double sideA, double sideB, double sideC)
{
    if (Triangle::isValid(sideA, sideB, sideC))
    {
        this->sideA = sideA;
        this->sideB = sideB;
        this->sideC = sideC;
    }

    else
    {
        this->sideA = -1;
        this->sideB = -1;
        this->sideC = -1;
    }
}

std::string Triangle::getType() const
{
    if (this->sideA == -1 && this->sideB == -1 && this->sideC == -1)
    {
        return "Invalid";
    }

    else if (this->sideA == this->sideB == this->sideC)
    {
        return "Equilateral";
    }

    else if (this->sideA == this->sideB || this->sideA == this->sideC || this->sideB == this->sideC)
    {
        return "Isosceles";
    }

    else
    {
        return "Scalene";
    }
}

double Triangle::getPerimeter() const
{
    if (this->getType() != "Invalid")
    {
        return (this->sideA + this->sideB + this->sideC);
    }

    return 0;
}