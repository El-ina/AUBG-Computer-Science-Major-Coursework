#include <iostream>
using namespace std;

int main()
{
    cout << "How many numbers would you input? ";
    int count;
    cin >> count;
    double sum;

    for (int i = 1; i <= count; i++)
    {
        int num;
        cin >> num;

        sum += num;
    }

    cout << "Average = " << sum / count;

    return 0;
}