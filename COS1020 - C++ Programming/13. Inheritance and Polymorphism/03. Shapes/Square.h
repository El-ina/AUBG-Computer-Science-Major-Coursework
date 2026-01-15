#ifndef COS1020___C___PROGRAMMING_SQUARE_H
#define COS1020___C___PROGRAMMING_SQUARE_H
#include "Shape.h"

class Square : public Shape
{
    protected:
        double x;
    public:
        Square();
        Square(double x);

        virtual double getX() const;
        virtual void setX(double x);

        virtual double getArea();
        virtual double getPerimeter();
};


#endif //COS1020___C___PROGRAMMING_SQUARE_H