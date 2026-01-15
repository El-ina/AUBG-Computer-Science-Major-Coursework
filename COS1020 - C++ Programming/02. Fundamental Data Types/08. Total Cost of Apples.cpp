#include <iostream>
using namespace std;

int main()
{
    cout << "Pounds of apples: ";
    double pounds;
    cin >> pounds;

    const double POUNDS_TO_KILOGRAMS = 0.45359237;
    const double PRICE_PER_KILOGRAM = 1.2;

    double kilograms = pounds * POUNDS_TO_KILOGRAMS;
    double finalPrice = PRICE_PER_KILOGRAM * kilograms;

    cout << "The final price is: " << finalPrice << endl;
    return 0;
}