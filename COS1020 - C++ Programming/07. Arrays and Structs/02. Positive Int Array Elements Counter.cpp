#include <iostream>
using namespace std;

int nonNegativeCount(const int array[], int len)
{
    int counter = 0;
    for (int i = 0; i < len; i++)
    {
        if (array[i] > 0)
        {
            counter++;
        }
    }

    return counter;
}

int main()
{
    cout << "Enter the array size: ";
    int count;

    cin >> count;

    int arr[count];

    for (int i = 0; i < count; i++)
    {
        cout << "Enter the array element #" << i + 1 << ": ";
        cin >> arr[i];
    }

    cout << endl;
    cout << "# of non-negative elements: " << nonNegativeCount(arr, count) << endl;

    return 0;
}