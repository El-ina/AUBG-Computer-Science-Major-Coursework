#ifndef COS1020___C___PROGRAMMING_TRIANGLE_H
#define COS1020___C___PROGRAMMING_TRIANGLE_H

#include <string>

class Triangle
{
    private:
        double sideA, sideB, sideC;
        bool isValid(double a, double b, double c) const;

    public:
        Triangle();
        Triangle(double sideA, double sideB, double sideC);
        std::string getType() const;
        double getPerimeter() const;
};


#endif //COS1020___C___PROGRAMMING_TRIANGLE_H