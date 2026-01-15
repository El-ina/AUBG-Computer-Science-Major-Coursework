#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    ifstream infile;
    ofstream outfile;

    infile.open("numbersInput.txt");
    if (infile.fail())
    {
        cerr << "Something went wrong opening the numbers file!" << endl;
        return 1;
    }

    outfile.open("numbersOutput.txt");

    int count = 0;
    double sum = 0, average = 0, num;

    while (infile >> num)
    {
        count++;
        sum += num;

    }

    average = sum / count;

    outfile << "Count: " << count << endl << "Sum: " << sum << endl << "Average: " << average << endl;

    infile.close();
    outfile.close();

    return 0;
}