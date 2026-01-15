#include <iostream>
#include <cstring>

using namespace std;

void show_column(char str[])
{
    for (int i = 0; i < strlen(str); i++)
    {
        cout << str[i] << endl;
    }
}

int main()
{
    char text[100];
    cout << "Enter a string: ";
    cin.getline(text, 100);

    show_column(text);

    return 0;
}
