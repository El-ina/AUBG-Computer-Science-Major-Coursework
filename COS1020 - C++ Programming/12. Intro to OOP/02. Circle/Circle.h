#ifndef COS1020___C___PROGRAMMING_CIRCLE_H
#define COS1020___C___PROGRAMMING_CIRCLE_H


class Circle
{
    public:
        Circle();
        Circle(double);

        double getRadius() const;
        void setRadius(double);

        double getArea() const;
        double getPerimeter() const;

    private:
        double radius;
};


#endif //COS1020___C___PROGRAMMING_CIRCLE_H