#include <iostream>
#include <cstring>

using namespace std;

bool is_valid_name(char str[])
{
    bool flag = false;

    if (isupper(str[0]) && (strlen(str) >= 4 && strlen(str) <= 20))
    {
        flag = true;
        for (int i = 1; i < strlen(str); i++)
        {
            if (!(isalpha(str[i]) && islower(str[i])))
            {
                flag = false;
            }
        }
    }

    return flag;
}


int main()
{
    char text[100];
    cout << "Enter a name: ";
    cin.getline(text, 100);

    cout << ((is_valid_name(text)) ? "Valid name" : "Invalid name") << endl;

    return 0;
}
