//
// Created by Elina Malchinikolova on 27.11.25.
//

#ifndef INC_13__INHERITANCE_AND_POLYMORPHISM_CHILDRENBOOK_H
#define INC_13__INHERITANCE_AND_POLYMORPHISM_CHILDRENBOOK_H
#include "Book.h"


class ChildrenBook : public Book
{
    private:
        int ageAppropriate;
    public:
        ChildrenBook(const std::string& n, const std::string& a, int p, int aa);

        int getAppropriateAge() const;
        void setAppropriateAge(int aa);

        void type() const;

};


#endif //INC_13__INHERITANCE_AND_POLYMORPHISM_CHILDRENBOOK_H