#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    int a = 1;
    int b = 1;
    for (int i = 1; i <= 100; i++)
    {
        if (i <= 1)
        {
            cout << setw(2) << i << " - " << i << endl;
        }
        else if (i == 2)
        {
            cout << setw(2) << i << " - " << 1 << endl;
        }
        else
        {
            int c = a + b;
            cout << setw(2) << i << " - " << c << endl;

            a = b;
            b = c;
        }
    }
    return 0;
}