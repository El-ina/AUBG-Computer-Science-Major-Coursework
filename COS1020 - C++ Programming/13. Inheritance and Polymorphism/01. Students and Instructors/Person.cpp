#include "Person.h"
#include <iostream>

Person::Person()
{

}

Person::Person(std::string name, std::string address)
{
    this->name = name;
    this->address = address;
}

void Person::display()
{
    std::cout << "- name: " << name << "\n" << "- address: " << address << std::endl;
}
