#ifndef COS1020___C___PROGRAMMING_TUPLE_H
#define COS1020___C___PROGRAMMING_TUPLE_H

template<typename T1, typename T2>

class Tuple
{
    private:
        T1 memberOne;
        T2 memberTwo;
    public:
        Tuple(T1 memberOne, T2 memberTwo);
        T1* getMemberOne();
        T2* getMemberTwo();
};


#endif //COS1020___C___PROGRAMMING_TUPLE_H