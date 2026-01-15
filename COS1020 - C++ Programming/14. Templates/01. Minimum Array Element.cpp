#include <iostream>
using namespace std;

template <typename T>

T findMinEl(T arr[], int len)
{
    T minEl = arr[0];
    for (int i = 1; i < len; i++)
    {
        if (arr[i] < minEl)
        {
            minEl = arr[i];
        }
    }

    return minEl;
}

int main()
{
    int intArr[] = { 1, 2, 3, 4, 5 };
    char charArr[] = { 'a', 'b', 'c', 'd', 'e' };

    cout << "Min Value of the int array: " << findMinEl(intArr, sizeof(intArr) / sizeof(intArr[0])) << endl;
    cout << "Min Value of the char array: " << findMinEl(charArr, sizeof(charArr) / sizeof(charArr[0])) << endl;

    return 0;
}