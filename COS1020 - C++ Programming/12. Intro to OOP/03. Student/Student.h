#ifndef COS1020___C___PROGRAMMING_STUDENT_H
#define COS1020___C___PROGRAMMING_STUDENT_H

#include <string>

class Student
{
    private:
        std::string name;
        double quizzes, exams;

    public:
        Student();
        Student(std::string name, double quizzes, double exams);
        std::string getName() const;
        double getFinal() const;
};


#endif //COS1020___C___PROGRAMMING_STUDENT_H