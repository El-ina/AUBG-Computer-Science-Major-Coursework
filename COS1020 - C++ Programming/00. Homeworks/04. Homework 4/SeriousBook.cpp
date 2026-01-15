//
// Created by Elina Malchinikolova on 27.11.25.
//

#include "SeriousBook.h"

#include <iostream>

std::string SeriousBook::getGenre() const
{
    return genre;
}

void SeriousBook::setGenre(const std::string& g)
{
    if (g.empty())
    {
        genre = "INVALID";
        std::cerr << "Invalid Genre!" << std::endl;
        return;
    }

    genre = g;
}

SeriousBook::SeriousBook(const std::string& n, const std::string& a, const int p, const std::string& g) : Book(n, a, p)
{
    setGenre(g);
}

void SeriousBook::type() const
{
    if (getName() == "INVALID" || getAuthor() == "INVALID" || getPages() < 0 || getGenre() == "INVALID")
    {
        std::cout << "Invalid Serious Book!" << std::endl;
        return;
    }

    std::cout << "Serious book, genre: " << getGenre() << std::endl;
}
