#ifndef COS1020___C___PROGRAMMING_RECTANGLE_H
#define COS1020___C___PROGRAMMING_RECTANGLE_H
#include "Square.h"


class Rectangle : public Square
{
    protected:
        double y;

    public:
        Rectangle();
        Rectangle(double x, double y);

        double getX() const override;
        void setX(double x) override;

        double getY() const;
        void setY(double x);

        double getArea() override;
        double getPerimeter() override;
};


#endif //COS1020___C___PROGRAMMING_RECTANGLE_H