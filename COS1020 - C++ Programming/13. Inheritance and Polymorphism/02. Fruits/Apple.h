#ifndef COS1020___C___PROGRAMMING_APPLE_H
#define COS1020___C___PROGRAMMING_APPLE_H
#include "Fruit.h"


class Apple : public Fruit
{
    public:
        Apple();
        Apple(std::string color, std::string taste);
        void display() override;
};


#endif //COS1020___C___PROGRAMMING_APPLE_H