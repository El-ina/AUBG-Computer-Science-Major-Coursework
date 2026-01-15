#include <iostream>
#include <fstream>
#include "Product.h"
#include "Product.cpp"
using namespace std;

// Solution to Task 2 - Products

int main()
{
    ifstream inFile;
    inFile.open("products.txt");

    // We keep all of our products in an array
    Product products[100];

    // This is the variable with which we keep track of the products we have accumulated in the array
    int currProd = 0;

    while (!inFile.eof())
    {
        string name;
        double price;
        int quantity;

        getline(inFile, name, '$');
        inFile >> price;
        inFile >> quantity;

        // We remove the trailing '\n' character from the beginning of the names if there is one
        // (which there is if the name is not the first in the list)
        name.erase(remove(name.begin(), name.end(), '\n'), name.end());

        Product product(name, price, quantity);
        products[currProd++] = product;
    }

    inFile.close(); // We no longer need the file, we have all our data stored in the array

    double sum = 0;

    for (int i = 0; i < currProd; i++)
    {
        products[i].display();

        if (products[i].getTotalPrice() > 0)
        {
            // If getProductPrice() returns a positive value, then we have a valid product
            // We can add its price to our shopping sum
            sum += products[i].getTotalPrice();
        }

    }


    cout << endl << "The total amount we have to pay is: " << sum << endl;
    return 0;
}