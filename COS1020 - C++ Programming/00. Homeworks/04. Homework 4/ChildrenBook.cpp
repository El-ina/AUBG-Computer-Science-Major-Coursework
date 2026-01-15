//
// Created by Elina Malchinikolova on 27.11.25.
//

#include "ChildrenBook.h"

#include <iostream>
#include <ostream>

int ChildrenBook::getAppropriateAge() const
{
    return ageAppropriate;
}

void ChildrenBook::setAppropriateAge(const int aa)
{
    if (aa <= 0)
    {
        std::cerr << "Age must be greater than zero" << std::endl;
        ageAppropriate = -1;
        return;
    }

    ageAppropriate = aa;
}

ChildrenBook::ChildrenBook(const std::string& n, const std::string& a, const int p, const int aa) : Book(n, a, p)
{
    setAppropriateAge(aa);
}


void ChildrenBook::type() const
{
    if (getName() == "INVALID" || getAuthor() == "INVALID" || getPages() < 0 || getAppropriateAge() < 0)
    {
        std::cout << "Invalid Children Book!" << std::endl;
        return;
    }

    std::cout << "Children book for " << getAppropriateAge() << " and older" << std::endl;
}
