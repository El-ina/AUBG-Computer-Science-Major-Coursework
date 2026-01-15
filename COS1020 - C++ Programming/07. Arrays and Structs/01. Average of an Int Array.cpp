#include <iomanip>
#include <iostream>

using namespace std;

double getAverage(int array[])
{
    double sum = 0;
    int count = sizeof(array);
    for (int i = 0; i < count; i++)
    {
        sum += (double)array[i];
    }

    return sum / count;
}

int main()
{
    int nums[10];

    for (int i = 0; i < 10; i++)
    {
        cout << "Enter number #" << i + 1 <<": ";
        cin >> nums[i];
    }

    cout << endl;

    cout << fixed << setprecision(2);
    cout << "Average is: " << getAverage(nums) << endl;

    return 0;
}