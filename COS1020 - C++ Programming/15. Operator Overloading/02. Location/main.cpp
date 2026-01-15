#include <iostream>
#include "Location.h"
#include "Location.cpp"

using namespace std;

int main()
{
    Location loc1(5, 10);
    Location loc2(3, 7);

    cout << "Location 1: " << loc1 << endl;
    cout << "Location 2: " << loc2 << endl;

    cout << endl;

    Location loc3 = loc1 + loc2;
    cout << "loc1 + loc2 = " << loc3 << endl;


    if (loc1 == loc2) {
        cout << "loc1 and loc2 are equal" << endl;
    }
    else
    {
        cout << "loc1 and loc2 are not equal" << endl;
    }

    cout << endl;

    Location loc4;
    loc4 = loc1;

    cout << "loc4 (after assignment from loc1): " << loc4 << endl;

    if (loc4 == loc1) {
        cout << "loc4 and loc1 are equal" << endl;
    }


    return 0;
}