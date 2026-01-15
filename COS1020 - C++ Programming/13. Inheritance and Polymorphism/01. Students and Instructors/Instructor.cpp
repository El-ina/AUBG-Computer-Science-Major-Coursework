#include "Instructor.h"
#include <iostream>

Instructor::Instructor()
{

}

Instructor::Instructor(std::string name, std::string address, double experience) : Person(name, address)
{
    if (experience < 0)
    {
        std::cerr << "Experience cannot be a negative number!" << std::endl;
        this->experience = NAN;
    }

    else
    {
        this->experience = experience;
    }

}

void Instructor::display()
{
    std::cout << "Instructor:" << std::endl;
    Person::display();
    std::cout << "- experience: " << experience << std::endl;
}
