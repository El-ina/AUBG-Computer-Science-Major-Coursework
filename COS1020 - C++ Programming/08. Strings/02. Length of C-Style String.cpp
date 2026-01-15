#include <iostream>
#include <cstring>

using namespace std;

int string_length(char str[])
{

    int i = 0;
    while (true)
    {
        if (str[i] == '\0')
        {
            break;
        }

        i++;

    }

    return i;
}

int main()
{
    char text[100];
    cout << "Enter a string: ";
    cin.getline(text, 100);

    cout << string_length(text) << endl;

    return 0;
}
