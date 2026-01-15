#include <iostream>
using namespace std;

int main()
{
    cout << "Enter kilometers: ";
    float kilometers;
    cin >> kilometers;

    float kmToMiles = 1.609;
    float miles = kilometers / kmToMiles;

    cout << miles << " miles" << endl;

    return 0;
}