#include <iostream>
using namespace std;

enum product {
    bread = 'b',
    milk = 'm',
    meat = 't',
    vegetables = 'v',
    unknown = 'u'
};

int main()
{
    product product;
    char input;

    cout << "Declare a product (enter 'b' for bread, 'm' for milk, 't' for meat, and 'v' for vegetables): ";
    cin >> input;

    switch (tolower(input))
    {
        case 'b':
            product = bread;
            break;
        case 'm':
            product = milk;
            break;
        case 't':
            product = meat;
            break;
        case 'v':
            product = vegetables;
            break;
        default:
            product = unknown;
            break;
    }

    cout << "\nEnum value: " << product << endl;

    return 0;
}