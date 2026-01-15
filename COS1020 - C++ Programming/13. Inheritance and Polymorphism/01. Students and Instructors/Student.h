#ifndef COS1020___C___PROGRAMMING_STUDENT_H
#define COS1020___C___PROGRAMMING_STUDENT_H
#include "Person.h"

class Student : public Person
{
    private:
        std::string major;
    public:
        Student();
        Student(std::string name, std::string address, std::string major);

        void display() override;
};


#endif //COS1020___C___PROGRAMMING_STUDENT_H