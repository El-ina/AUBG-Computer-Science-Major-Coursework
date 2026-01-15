#include <iostream>
using namespace std;

int main()
{
    cout << "Enter miles: ";
    float miles;
    cin >> miles;

    float milesToKm = 1.609;
    float kilometers = miles * milesToKm;

    cout << kilometers << " km." << endl;

    return 0;

}