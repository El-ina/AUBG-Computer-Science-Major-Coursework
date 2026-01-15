#include <iostream>
using namespace std;

int main()
{
    double price, finalPrice;

    cout << "Enter price: ";
    cin >> price;

    if (price <= 19.99)
    {
        finalPrice = price;
    }
    else if (price <= 99.99)
    {
        finalPrice = 1.06 * price;
    }
    else
    {
        finalPrice = 1.08 * price;
    }


    cout << "Final price: $" << finalPrice;
    return 0;

}