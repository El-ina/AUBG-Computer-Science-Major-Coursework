//
// Created by Elina Malchinikolova on 27.11.25.
//

#ifndef INC_13__INHERITANCE_AND_POLYMORPHISM_SERIOUSBOOK_H
#define INC_13__INHERITANCE_AND_POLYMORPHISM_SERIOUSBOOK_H
#include <string>

#include "Book.h"


class SeriousBook : public Book
{
    private:
        std::string genre;
    public:
        SeriousBook(const std::string& n, const std::string& a, int p, const std::string& g);

        std::string getGenre() const;
        void setGenre(const std::string& g);

        void type() const;
};


#endif //INC_13__INHERITANCE_AND_POLYMORPHISM_SERIOUSBOOK_H