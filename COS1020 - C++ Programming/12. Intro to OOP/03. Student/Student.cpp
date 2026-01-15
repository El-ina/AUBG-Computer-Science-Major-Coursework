#include "Student.h"
#include <string>
#include <iostream>

Student::Student()
{

}

Student::Student(std::string name, double quizzes, double exams)
{
    if (name.empty())
    {
        std::cerr << "Invalid name!" << std::endl;
        this->name = "-1";
    }
    else
    {
        this->name = name;
    }

    if (quizzes < 0)
    {
        std::cerr << "Invalid quiz scores!" << std::endl;
        this->quizzes = -1;
    }
    else
    {
        this->quizzes = quizzes;
    }

    if (exams < 0)
    {
        std::cerr << "Invalid exam scores!" << std::endl;
        this->exams = -1;
    }
    else
    {
        this->exams = exams;
    }

}

std::string Student::getName() const
{
    if (name == "-1")
    {
        return "INVALID!";
    }

    return name;
}


double Student::getFinal() const
{
    if (exams >= 0 && quizzes >= 0 && name != "-1")
    {
        return 0.4 * quizzes + 0.6 * exams;
    }

    std::cerr << "Invalid student data!" << std::endl;
    return NAN;
}
