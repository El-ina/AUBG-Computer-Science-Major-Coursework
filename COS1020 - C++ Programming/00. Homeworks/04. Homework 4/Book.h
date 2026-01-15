//
// Created by Elina Malchinikolova on 27.11.25.
//

#ifndef INC_13__INHERITANCE_AND_POLYMORPHISM_BOOK_H
#define INC_13__INHERITANCE_AND_POLYMORPHISM_BOOK_H
#include <string>


class Book
{
    private:
        std::string name;
        std::string author;
        int pages;


    public:
        virtual ~Book() = default;
        Book(std::string n, std::string a, int p);

        std::string getName() const;
        void setName(const std::string& n);

        std::string getAuthor() const;
        void setAuthor(const std::string& a);

        int getPages() const;
        void setPages(const int& p);

        virtual void type() const = 0;
};


#endif //INC_13__INHERITANCE_AND_POLYMORPHISM_BOOK_H