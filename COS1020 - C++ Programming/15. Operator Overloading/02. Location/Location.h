#ifndef COS1020___C___PROGRAMMING_LOCATION_H
#define COS1020___C___PROGRAMMING_LOCATION_H

#include <iostream>

class Location
{
    private:
        int x;
        int y;

    public:
        Location();
        Location(int x, int y);

        bool operator==(const Location& other) const;
        Location& operator=(const Location& other);
        Location operator+(const Location& other) const;

        friend std::ostream& operator<<(std::ostream& os, const Location& loc);
        friend std::istream& operator>>(std::istream& is, Location& loc);
};


#endif //COS1020___C___PROGRAMMING_LOCATION_H