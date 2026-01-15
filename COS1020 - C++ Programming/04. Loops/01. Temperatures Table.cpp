#include <iostream>
using namespace std;

int main()
{

    for (int i = 10; i <= 35; i+=5)
    {
        cout << i << "C - " << i * 1.8 + 32 << "F" << endl;
    }

    return 0;
}