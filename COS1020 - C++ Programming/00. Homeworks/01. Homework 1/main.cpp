//COS1020B - Intro to COS1020 - C++ Programming; Homework #1
//Author: Elina Malchinikolova
//Task: Count letters that are either 'a', 'u', 'b', or 'g'

#include <iostream>
using namespace std;

bool checkLetter(char c)
{
    /*
     if c is either 'a', 'u', 'b', or 'g',
     the expression below will evaluate to true
     and we can directly return its value
     without needing to create another variable just for it
     */
    return (c == 'a' || c == 'u' || c == 'b' || c == 'g');
}

int main()
{
    int countOfLetters; //the variable that is going to store the amount of letters to be processed

    while (true) //an infinite loop because we can't know how many (if any) negative (invalid) numbers the user is going to enter
    {
        cout << "Please enter the number of letters to be processed: ";
        cin >> countOfLetters;

        if (countOfLetters > 0)
        {
            /*
             if the user has provided a positive (valid) amount of letters to be processed,
             we can safely break out of the loop and move on to processing the letters themselves
             */
            break;
        }
    }

    cout << endl; //a breather line

    //now that we've broken out of the while loop and know how many letters to expect, we can begin processing them...

    char letter; //a placeholder variable that will store the current letter
    int validLetters = 0; //a counter which is to be incremented when a valid (according to the function) letter is entered

    for (int i = 1; i <= countOfLetters; i++) //a for loop because we know how many inputs to anticipate
    {
        cout << "Please enter a letter: ";
        cin >> letter;

        if (checkLetter(letter))
        {
            validLetters++; //valid letter => increment the counter...
        }
    }

    cout << endl; //a breather line

    //...and print everything out
    if (validLetters == countOfLetters)
    {
        //if all entered letters are valid, we better say in the output message that ALL letters match the criteria
        cout << "Out of " << countOfLetters << " letters, all " << validLetters << " match the criteria!" << endl;
    }
    else if (validLetters == 0)
    {
        //else if there is not a single valid letter, the output message clearly says that none match the criteria
        cout << "Out of " << countOfLetters << " letters, none match the criteria..." << endl;
    }
    else
    {
        //in all other cases, ONLY... gets the job done
        cout << "Out of " << countOfLetters << " letters, only " << validLetters << " match the criteria." << endl;
    }

    return 0;
    //***the end***
}