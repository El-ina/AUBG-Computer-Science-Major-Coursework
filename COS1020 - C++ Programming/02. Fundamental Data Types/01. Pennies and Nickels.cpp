#include <iostream>
using namespace std;

int main()
{
    cout << "Enter the amount of pennies: ";
    int pennies;
    cin >> pennies;

    cout << "Enter the amount of nickels: ";
    int nickels;
    cin >> nickels;

    double total = pennies * 0.01 + nickels * 0.05;
    cout << "Total amount of coin savings: $" << total << endl;
    return 0;
}