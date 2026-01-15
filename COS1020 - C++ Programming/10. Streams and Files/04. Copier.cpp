#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    ifstream infile;
    ofstream outfile;

    infile.open("copy.txt");
    if (infile.fail())
    {
        cerr << "Something went wrong opening the file for copying!" << endl;
    }

    outfile.open("paste.txt");

    string line;

    while (getline(infile, line))
    {
        outfile << line << '\n';
    }

    cout << "File copied to paste.txt successfully!" << endl;

    infile.close();
    outfile.close();
    return 0;
}