#include <iostream>
using namespace std;

int main()
{

    cout << "Enter the item price: ";
    double price;
    cin >> price;

    //25% discount
    double discountedPrice = 0.75 * price;

    cout << "The price with a 25% discount applied is: " << discountedPrice << endl;
    return 0;
}