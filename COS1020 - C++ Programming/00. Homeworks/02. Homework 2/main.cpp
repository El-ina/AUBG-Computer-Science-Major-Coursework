// Task 2 - Runners
// The program reads an arbitrary number of lines of runners’ times
// that are in the format <runner last name> <distance> <time1> <time2> <time3>
// and for every runner prints out their last name, the distance they've run, and their best (lowest) time

#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    // we create the input stream and open the file...
    ifstream infile;
    infile.open("runners.txt");

    // ...we handle any possible errors when opening the files...
    if (!infile)
    {
        cerr << "Failed to open file." << endl;
        return 1;
    }

    // ...and if everything goes well, we start reading the file:

    string name;
    int distance;
    float times[3];

    while (infile >> name >> distance >> times[0] >> times[1] >> times[2])
        // while there are no more lines to read in the file,
        // we break them down into the name, distance, and 3 times for every runner...
    {
        // ...we find the best (minimum) time...
        float minTime = times[0];
        for (int i = 1; i < 3; i++)
        {
            if (times[i] < minTime)
            {
                minTime = times[i];
            }
        }   

        // ...and we print out the runners' data to the screen...
        cout << name << " managed to run " << distance << "km in " << minTime << "min." << endl;
    }

    infile.close(); // ...we close the file...

    return 0;
    // ...and we're done!
}