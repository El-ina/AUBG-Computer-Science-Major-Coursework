#include <iostream>
using namespace std;

int main()
{
    const double POUNDS_TO_KILOGRAMS = 0.45359237;
    double pounds, kilograms;
    cout << "Enter pounds: ";
    cin >> pounds;

    kilograms = pounds * POUNDS_TO_KILOGRAMS;
    cout << "Kilograms: " << kilograms << endl;
    return 0;
}