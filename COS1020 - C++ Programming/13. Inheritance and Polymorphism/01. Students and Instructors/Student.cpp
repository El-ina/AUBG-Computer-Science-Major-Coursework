#include "Student.h"
#include <iostream>

Student::Student()
{

}

Student::Student(std::string name, std::string address, std::string major) : Person(name, address)
{
    this->major = major;
}

void Student::display()
{
    std::cout << "Student:" << std::endl;
    Person::display();
    std::cout << "- major: " << major << std::endl;
}

