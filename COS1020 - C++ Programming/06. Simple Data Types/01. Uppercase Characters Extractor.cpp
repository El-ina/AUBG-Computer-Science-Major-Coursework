#include <iostream>
using namespace std;

string uppercaseExtractor(string input)
{
    string resultStr = "";
    for (int i = 0; i < input.length(); i++)
    {
        if (isupper(input[i]))
        {
            resultStr += input[i];
        }
    }

    return resultStr;
}

int main()
{
    string input;
    cout << "Enter something (to end the inputting, type '!'): ";
    getline(cin, input, '!');

    string result = uppercaseExtractor(input);

    cout << "The uppercase letters in the input are: " << ((result.length() == 0) ? "None" : result) << endl;

    return 0;
}