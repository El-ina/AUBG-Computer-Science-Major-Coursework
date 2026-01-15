#ifndef COS1020___C___PROGRAMMING_GRAPEFRUIT_H
#define COS1020___C___PROGRAMMING_GRAPEFRUIT_H
#include "Fruit.h"

class Grapefruit : public Fruit
{
    public:
        Grapefruit();
        Grapefruit(std::string color, std::string taste);
        void display() override;
};

#endif //COS1020___C___PROGRAMMING_GRAPEFRUIT_H