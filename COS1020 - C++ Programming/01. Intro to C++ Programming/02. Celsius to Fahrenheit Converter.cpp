#include <iostream>
using namespace std;

int main()
{
    cout << "Enter Celsius temperature: ";
    float celsius;
    cin >> celsius;

    float fahrenheit = celsius * 1.8 + 32;

    cout << fahrenheit <<" F";
    return 0;

}