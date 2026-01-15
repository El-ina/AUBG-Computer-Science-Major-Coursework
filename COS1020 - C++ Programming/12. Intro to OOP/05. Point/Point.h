#ifndef COS1020___C___PROGRAMMING_POINT_H
#define COS1020___C___PROGRAMMING_POINT_H


class Point
{
    private:
        double x, y;
    public:
        Point();
        Point(double x, double y);

        double getX() const;
        void setX(double x);

        double getY() const;
        void setY(double y);

        double calcDistance(const Point& that) const;
};


#endif //COS1020___C___PROGRAMMING_POINT_H