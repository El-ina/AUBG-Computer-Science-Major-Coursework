#ifndef COS1020___C___PROGRAMMING_PERSON_H
#define COS1020___C___PROGRAMMING_PERSON_H

#include <string>

class Person
{
    protected:
        std::string name, address;
    public:
        Person();
        Person(std::string name, std::string address);

        virtual void display();
};


#endif //COS1020___C___PROGRAMMING_PERSON_H