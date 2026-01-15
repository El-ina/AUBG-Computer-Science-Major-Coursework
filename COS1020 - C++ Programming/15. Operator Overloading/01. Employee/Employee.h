#ifndef COS1020___C___PROGRAMMING_EMPLOYEE_H
#define COS1020___C___PROGRAMMING_EMPLOYEE_H
#include <string>
#include <iostream>

class Employee
{
    private:
        std::string name;
        int age;
    public:
        Employee(std::string name, int age);
        bool operator<(const Employee& other) const;
        friend std::ostream& operator<<(std::ostream& os, const Employee& e);
};


#endif //COS1020___C___PROGRAMMING_EMPLOYEE_H