#include "Apple.h"
#include <iostream>

Apple::Apple()
{

}

Apple::Apple(std::string color, std::string taste) : Fruit(color, taste)
{

}

void Apple::display()
{
    std::cout << "Apple:" << std::endl;
    Fruit::display();
}