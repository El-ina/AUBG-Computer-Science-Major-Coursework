#include <iomanip>
#include <iostream>
using namespace std;

void printMatrix(int matrix[10][10])
{
    for (int i = 0; i < 10; i++)
    {
        for (int j = 0; j < 10; j++)
        {
            cout << setw(4) << matrix[i][j];
        }

        cout << endl;
    }
}

int main()
{
    int matrix[10][10];

    for (int i = 0; i < 10; i++)
    {
        for (int j = 0; j < 10; j++)
        {
            matrix[i][j] = (i + 1) * (j + 1);
        }
    }

    printMatrix(matrix);
    return 0;
}