#include "Employee.h"

Employee::Employee(std::string name, int age)
{
    this->name = name;
    this->age = age;
}

bool Employee::operator<(const Employee& other) const
{
    return age < other.age;
}

std::ostream& operator<<(std::ostream& os, const Employee& e)
{
    os << e.name << " (" << e.age << ")";
    return os;
}



