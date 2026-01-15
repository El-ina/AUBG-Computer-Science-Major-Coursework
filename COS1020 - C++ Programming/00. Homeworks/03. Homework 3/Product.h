//
// Created by Elina Malchinikolova on 27.11.25.
//

#ifndef HOMEWORK_3_PRODUCT_H
#define HOMEWORK_3_PRODUCT_H
#include <string>


class Product
{
    private:
        std::string name;
        double unitPrice;
        int quantity;

    public:
        Product();
        Product(const std::string& n, double up, int q);

        std::string getName();
        void setName(const std::string& n);

        double getUnitPrice() const;
        void setUnitPrice(double up);

        int getQuantity() const;
        void setQuantity(int q);

        double getTotalPrice() const;

        void display() const;


};


#endif //HOMEWORK_3_PRODUCT_H