#include <iostream>
#include "Fruit.h"

Fruit::Fruit()
{

}

std::string Fruit::getColor() const
{
    return color;
}

void Fruit::setColor(std::string color)
{
    this->color = color;
}

std::string Fruit::getTaste() const
{
    return  taste;
}

void Fruit::setTaste(std::string taste)
{
    this->taste = taste;
}

Fruit::Fruit(std::string color, std::string taste)
{
    setColor(color);
    setTaste(taste);
}


void Fruit::display()
{
    std::cout << "- color: " << color << "\n" << "- taste: " << taste << std::endl;
}
