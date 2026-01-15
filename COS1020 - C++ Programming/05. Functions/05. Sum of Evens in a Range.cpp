#include <iostream>
using namespace std;

int sumEvenNumbers(int start, int end)
{

    if (start >= end)
    {
        return -1;
    }
    int sum = 0;

    for (int i = start; i <= end; i++)
    {
        if (i % 2 == 0)
        {
            sum += i;
        }
    }

    return sum;
}

int main()
{
    int start, end;

    cout << "Range start: ";
    cin >> start;

    cout << "Range end: ";
    cin >> end;

    cout << endl;

    if (sumEvenNumbers(start, end) == -1)
    {
        cout << "Error - enter a valid range!" << endl;
    }

    else
    {
        cout << "Sum of even numbers in that range: " << sumEvenNumbers(start, end) << endl;
    }


    return 0;
}