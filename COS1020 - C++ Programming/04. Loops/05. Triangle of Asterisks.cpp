#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    cout << "Enter the triangle size: ";
    int num;
    cin >> num;

    if (num < 11 || num > 20)
    {
        cout << "Invalid Input" << endl;
        return 1;
    }

    if (num % 2 == 0)
    {
        int spaces = num - 1;
        int asterisks = 1;

        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j <= spaces; j++)
            {
                cout << setw(2) << ' ';
            }
            for (int j = 1; j <= asterisks; j++)
            {
                cout << setw(2) << '*';
            }

            cout << endl;

            spaces--;
            asterisks++;
        }
    }

    else
    {
        int spaces = 0;
        int asterisks = num;

        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j <= spaces; j++)
            {
                cout << setw(2) << ' ';
            }
            for (int j = 1; j <= asterisks; j++)
            {
                cout << setw(2) << '*';
            }

            cout << endl;

            spaces++;
            asterisks--;
        }
    }

    return 0;
}