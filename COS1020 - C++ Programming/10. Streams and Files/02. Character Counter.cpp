#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    ifstream infile;

    if (infile.fail())
    {
        cerr << "Something went wrong opening the file!" << endl;
        return 1;
    }

    infile.open("copy.txt");

    int charCounter = 0;

    char ch;

    while (infile >> ch)
    {
        charCounter++;
    }

    cout << "The # of characters in copy.txt is: " << charCounter << endl;

    return 0;
}