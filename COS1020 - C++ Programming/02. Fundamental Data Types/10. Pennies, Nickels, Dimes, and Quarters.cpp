#include <iostream>
using namespace std;

int main()
{
    /*
    1 penny = 1 cent
    1 nickel = 5 cents
    1 dime = 10 cents
    1 quarter = 25 cents
     */

    int pennies, nickels, dimes, quarters;
    cout << "Enter the amount of pennies: ";
    cin >> pennies;

    cout << "Enter the amount of nickels: ";
    cin >> nickels;

    cout << "Enter the amount of dimes: ";
    cin >> dimes;

    cout << "Enter the amount of quarters: ";
    cin >> quarters;

    cout << "\nTotal amount of coin savings: $" << pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25 << endl;

    return 0;
}