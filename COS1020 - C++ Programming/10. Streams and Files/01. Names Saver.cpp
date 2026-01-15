#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    ofstream outfile;
    outfile.open("copy.txt");

    string fName = "";
    string lName = "";

    cout << "Enter your name: ";
    cin >> fName;
    cin >> lName;

    outfile << fName << '\n' << lName;

    cout << "copy.txt generated successfully!" << endl;

    outfile.close();

    return 0;
}