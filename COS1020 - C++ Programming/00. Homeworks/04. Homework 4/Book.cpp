//
// Created by Elina Malchinikolova on 27.11.25.
//

#include "Book.h"

#include <iostream>
#include <ostream>

std::string Book::getName() const
{
    return name;
}

void Book::setName(const std::string& n)
{
    if (n.empty())
    {
        std::cerr << "Name cannot be an empty string!" << std::endl;
        name = "INVALID";
        return;
    }

    name = n;
}

std::string Book::getAuthor() const
{
    return author;
}

void Book::setAuthor(const std::string& a)
{
    if (a.empty())
    {
        std::cerr << "Author cannot be an empty string!" << std::endl;
        author = "INVALID";
        return;
    }

    author = a;
}

int Book::getPages() const
{
    return pages;
}

void Book::setPages(const int& p)
{
    if (p <= 0)
    {
        std::cerr << "Pages cannot be a negative number or zero!" << std::endl;
        pages = -1;
        return;
    }
    pages = p;
}

Book::Book(std::string n, std::string a, int p)
{
    setName(n);
    setAuthor(a);
    setPages(p);
}
