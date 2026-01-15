#include "Tuple.h"

template <typename T1, typename T2>
Tuple<T1, T2>::Tuple(T1 memberOne, T2 memberTwo)
{
    this->memberOne = memberOne;
    this->memberTwo = memberTwo;
}

template <typename T1, typename T2>
T1* Tuple<T1, T2>::getMemberOne()
{
    return &memberOne;
}

template <typename T1, typename T2>
T2* Tuple<T1, T2>::getMemberTwo()
{
    return &memberTwo;
}


