#include "Grapefruit.h"
#include <iostream>

Grapefruit::Grapefruit()
{

}

Grapefruit::Grapefruit(std::string color, std::string taste) : Fruit(color, taste)
{

}

void Grapefruit::display()
{
    std::cout << "Grapefruit:" << std::endl;
    Fruit::display();
}