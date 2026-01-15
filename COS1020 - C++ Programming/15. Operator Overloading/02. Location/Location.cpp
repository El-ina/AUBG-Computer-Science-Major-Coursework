#include "Location.h"

Location::Location()
{
    this->x = 0;
    this->y = 0;
}

Location::Location(int x, int y)
{
    this->x = x;
    this->y = y;
}

bool Location::operator==(const Location& other) const
{
    return (x == other.x && y == other.y);
}

Location& Location::operator=(const Location& other)
{
    if (this != &other) {
        x = other.x;
        y = other.y;
    }
    return *this;
}

Location Location::operator+(const Location& other) const
{
    return Location(x + other.x, y + other.y);
}

std::ostream& operator<<(std::ostream& os, const Location& loc)
{
    os << "(" << loc.x << ", " << loc.y << ")";
    return os;
}

std::istream& operator>>(std::istream& is, Location& loc)
{
    is >> loc.x >> loc.y;
    return is;
}