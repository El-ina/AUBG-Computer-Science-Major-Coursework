#include <iostream>
#include "Fruit.h"
#include "Fruit.cpp"
#include "Apple.h"
#include "Apple.cpp"
#include "Grapefruit.h"
#include "Grapefruit.cpp"
using namespace std;

int main()
{
    Fruit f("White", "Tasty");
    Apple a("Red", "Sweet");
    Grapefruit g("Orange", "Sour");

    cout << "Fruit:\n";
    f.display();
    cout << endl;
    a.display();
    cout << endl;
    g.display();

    return 0;
}