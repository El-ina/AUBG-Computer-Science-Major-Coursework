#include <iostream>
using namespace std;

int getMax(int a, int b, int c, int d)
{
    int maxAB =  max(a, b);
    int maxCD = max(c, d);

    return max(maxAB, maxCD);
}

int main()
{
    int a, b, c, d;
    cout << "Enter a: ";
    cin >> a;
    cout << "Enter b: ";
    cin >> b;
    cout << "Enter c: ";
    cin >> c;
    cout << "Enter d: ";
    cin >> d;

    cout << endl;

    cout << "The biggest of these all is: " << getMax(a, b, c, d) << endl;
    return 0;
}