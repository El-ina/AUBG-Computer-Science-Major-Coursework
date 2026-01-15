#include <iostream>
#include <iomanip>
using namespace std;

double payraiseCalculator(double currSalary)
{
    if (currSalary < 40000)
    {
        return 1.05 * currSalary;
    }

    return (currSalary + 2000) + 0.02 * (currSalary - 40000);
}

int main()
{
    double currSalary;
    cout << "Enter the current salary: ";
    cin >> currSalary;

    cout << endl;

    cout << fixed << setprecision(2);
    cout << "Your anticipated salary is: " << payraiseCalculator(currSalary) << endl;

    return 0;
}