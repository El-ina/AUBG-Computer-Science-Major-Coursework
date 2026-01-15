#include <iostream>
using namespace std;

int main()
{
    double hoursWorked, hourlyRate, weeklySalary;
    cout << "Enter hours worked: ";
    cin >> hoursWorked;

    cout << "Enter hourly rate: ";
    cin >> hourlyRate;

    if (hoursWorked > 40)
    {
        weeklySalary = (40 * hourlyRate) + (hoursWorked - 40) * hourlyRate * 1.5;
    }

    else
    {
        weeklySalary = hoursWorked * hourlyRate;
    }

    cout << "Final weekly salary: $" << weeklySalary;
    return 0;
}