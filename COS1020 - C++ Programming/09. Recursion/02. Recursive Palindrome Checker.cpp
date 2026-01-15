#include <iostream>
using namespace std;

int palindromeCheck(string str)
{
    if (str.length() <= 1)
        return 1;

    if (str.front() != str.back())
        return 0;

    return palindromeCheck(str.substr(1, str.length() - 2));
}

int main()
{
    string word;
    cout << "Enter a word: ";
    cin >> word;

    int result = palindromeCheck(word);

    switch (result)
    {
        case 0:
            cout << word << " is not a palindrome";
            break;
        case 1:
            cout << word << " is a palindrome";
            break;
    }

    return 0;
}