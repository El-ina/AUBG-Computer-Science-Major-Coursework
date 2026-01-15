//
// Created by Elina Malchinikolova on 27.11.25.
//

#include "Product.h"

#include <ios>
#include <iostream>
#include <ostream>

// The default constructor will assign just some placeholder values
Product::Product()
{
    name = "Unknown Product";
    unitPrice = 1;
    quantity = 1;
}

std::string Product::getName()
{
    return name;
}

void Product::setName(const std::string& n)
{
    if (!n.empty()) // The product name cannot be an empty string
    {
        name = n;
    }
    else
    {
        name = "INVALID";
        std::cerr << "Invalid Product Name!" << std::endl;
    }
}

double Product::getUnitPrice() const
{
    return unitPrice;
}

void Product::setUnitPrice(const double up)
{
    if (up > 0) // The product price cannot be negative or 0
    {
        unitPrice = up;
    }
    else
    {
        unitPrice = -1;
        std::cerr << "Invalid Unit Price for " << name << "!" << std::endl;
    }
}


int Product::getQuantity() const
{
    return quantity;
}

void Product::setQuantity(const int q)
{
    if (q > 0) // The product cannot have a quantity of 0 or less
    {
        quantity = q;
    }
    else
    {
        quantity = -1;
        std::cerr << "Invalid Quantity for " << name << "!" << std::endl;
    }
}

Product::Product(const std::string& n, const double up, const int q)
{
    // We use the setters in the constructor to use the field validations without having to rewrite them
    setName(n);
    setUnitPrice(up);
    setQuantity(q);
}

double Product::getTotalPrice() const
{
    if (name == "INVALID" || unitPrice < 0 || quantity < 0)
    {
        return -1;
        // If the product is invalid (meaning, any of its fields are invalid), we cannot include it in our calculations.
        // The getTotalPrice() method will just return -1 to indicate an error
    }
    return unitPrice * quantity;
}

void Product::display() const
{
    if (getTotalPrice() == -1)
    {
        // We use the getTotalPrice() method as a wrapper for all of the validations.
        // If it returns -1, then the product is invalid.
        std::cerr << "Cannot Display Info for Invalid Product!" << std::endl;
        return;
    }

    std::cout << name << " " << quantity << " X " << unitPrice << ", so the price is: " << getTotalPrice() << std::endl;
}
