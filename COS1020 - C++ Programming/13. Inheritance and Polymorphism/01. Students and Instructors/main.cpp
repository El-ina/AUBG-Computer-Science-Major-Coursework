#include <iostream>
#include "Person.h"
#include "Person.cpp"
#include "Student.h"
#include "Student.cpp"
#include "Instructor.h"
#include "Instructor.cpp"
using namespace std;

int main()
{
    cout << "Person:" << endl;
    Person p("John", "John's Address");
    p.display();

    cout << endl;

    Instructor i("Jane", "Jane's Address", 9);
    i.display();

    cout << endl;

    Student s("Ivan", "Ivan's Address", "Computer Science");
    s.display();

    return 0;
}