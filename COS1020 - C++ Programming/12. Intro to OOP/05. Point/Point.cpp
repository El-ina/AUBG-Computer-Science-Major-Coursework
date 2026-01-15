#include "Point.h"
#include <complex>

Point::Point()
{

}

double Point::getX() const
{
    return this->x;
}

void Point::setX(double x)
{
    this->x = x;
}

double Point::getY() const
{
    return this->y;
}

void Point::setY(double y)
{
    this->y = y;
}

Point::Point(double x, double y)
{
    setX(x);
    setY(y);
}


double Point::calcDistance(const Point& that) const
{
    return std::sqrt(pow(that.getX() - this->getX(), 2) + pow(that.getY() - this->getY(), 2));
}