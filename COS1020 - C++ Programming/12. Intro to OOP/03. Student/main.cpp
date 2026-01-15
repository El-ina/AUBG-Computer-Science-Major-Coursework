#include <iostream>
#include "Student.h"
#include "Student.cpp"
using namespace std;

int main()
{
    Student students[5];

    for (int i = 1; i <= 5; i++)
    {
        string name;
        double quizzes, exams;

        cout << "Enter student " << i << "'s name: ";
        cin >> name;

        cout << "Enter student " << i << "'s quizzes score: ";
        cin >> quizzes;

        cout << "Enter student " << i << "'s exams score: ";
        cin >> exams;


        Student student(name, quizzes, exams);
        students[i - 1] = student;

        cout << endl;
    }

    for (int i = 1; i <= 5; i++)
    {
        cout << students[i - 1].getName() << "'s final score is: " << students[i - 1].getFinal() << endl;
    }

    return 0;
}