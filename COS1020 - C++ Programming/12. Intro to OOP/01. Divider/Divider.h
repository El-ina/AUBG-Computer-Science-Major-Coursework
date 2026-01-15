#ifndef COS1020___C___PROGRAMMING_DIVIDER_H
#define COS1020___C___PROGRAMMING_DIVIDER_H


class Divider
{
    public:
        Divider();
        Divider(double enumerator, double denominator);

        double result() const;

    private:
        double enumerator;
        double denominator;
};


#endif