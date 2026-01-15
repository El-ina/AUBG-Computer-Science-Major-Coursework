#include <iostream>
using namespace std;

int main()
{
    int int1, int2, int3, int4;
    float float1, float2;

    cout << "Enter int1: ";
    cin >> int1;

    cout << "Enter int2: ";
    cin >> int2;

    cout << "Enter int3: ";
    cin >> int3;

    cout << "Enter int4: ";
    cin >> int4;

    cout << endl;

    cout << "Enter float1: ";
    cin >> float1;

    cout << "Enter float2: ";
    cin >> float2;

    float expression = (int1 + int2) / float1 - int3 / float2 + int4;

    cout << endl << "The final result is: " << expression << endl;

    return 0;
}