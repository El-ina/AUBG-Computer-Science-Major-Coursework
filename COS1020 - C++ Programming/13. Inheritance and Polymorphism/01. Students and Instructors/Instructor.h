#ifndef COS1020___C___PROGRAMMING_INSTRUCTOR_H
#define COS1020___C___PROGRAMMING_INSTRUCTOR_H
#include "Person.h"

class Instructor : public Person
{
    private:
        double experience;
    public:
        Instructor();
        Instructor(std::string name, std::string address, double experience);

        void display() override;
};


#endif //COS1020___C___PROGRAMMING_INSTRUCTOR_H