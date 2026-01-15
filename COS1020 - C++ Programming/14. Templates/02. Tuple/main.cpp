#include <iostream>
#include "Tuple.h"
#include "Tuple.cpp"
#include <string>
using namespace std;

int main()
{

    Tuple<int, char> tuple1(1, 'a');
    Tuple<string, double> tuple2("Hello", 3.7);

    cout << "Tuple 1: (" << *tuple1.getMemberOne() << ", " << *tuple1.getMemberTwo() << ")" << endl;
    cout << "Tuple 2: (" << *tuple2.getMemberOne() << ", " << *tuple2.getMemberTwo() << ")" << endl;

    return 0;
}