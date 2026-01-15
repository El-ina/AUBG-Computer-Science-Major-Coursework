#include <iostream>
using namespace std;

struct person
{
    string name;
    int age;
};

int main()
{
    person p1, p2, p3;

    cout << "Enter p1's name: ";
    cin >> p1.name;

    cout << "Enter p1's age: ";
    cin >> p1.age;

    cout << endl;

    cout << "Enter p2's name: ";
    cin >> p2.name;

    cout << "Enter p2's age: ";
    cin >> p2.age;

    cout << endl;

    cout << "Enter p3's name: ";
    cin >> p3.name;

    cout << "Enter p3's age: ";
    cin >> p3.age;

    string name = p1.name;
    int maxAge = p1.age;

    if (p2.age > maxAge) { maxAge = p2.age; name = p2.name; }
    if (p3.age > maxAge) { maxAge = p3.age; name = p3.name; }


    cout << endl << "The person with the largest age is: " << name << endl;


    return 0;
}