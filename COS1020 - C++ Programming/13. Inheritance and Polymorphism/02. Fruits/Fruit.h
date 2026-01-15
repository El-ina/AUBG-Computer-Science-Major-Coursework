#ifndef COS1020___C___PROGRAMMING_FRUIT_H
#define COS1020___C___PROGRAMMING_FRUIT_H
#include <string>

class Fruit
{
    private:
        std::string color, taste;

    public:
        Fruit();
        Fruit(std::string color, std::string taste);

        std::string getColor() const;
        void setColor(std::string color);

        std::string getTaste() const;
        void setTaste(std::string taste);

        virtual void display();
};


#endif //COS1020___C___PROGRAMMING_FRUIT_H