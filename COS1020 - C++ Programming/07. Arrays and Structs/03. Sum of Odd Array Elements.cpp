#include <iostream>
using namespace std;

int getOddNumbersSum(const int array[], int size)
{
    int sum = 0;

    for (int i = 0; i < size; i++)
    {
        if (array[i] % 2 != 0)
        {
            sum += array[i];
        }
    }

    return sum;
}

int main()
{
    cout << "Enter array size: ";
    int size;
    cin >> size;

    int arr[size];

    cout << endl;

    for (int i = 0; i < size; i++)
    {
        cout << "Enter element #" << i + 1 << ": ";
        cin >> arr[i];
    }

    cout << endl;

    cout << "The number of odd elements in the array is: " << getOddNumbersSum(arr, size) << endl;

    return 0;
}