#include "Divider.h"

Divider::Divider()
{
    Divider::enumerator = 1;
    Divider::denominator = 1;
}

Divider::Divider(double enumerator, double denominator)
{
    Divider::enumerator = enumerator;
    Divider::denominator = denominator;
}


double Divider::result() const
{
    return enumerator / denominator;
}
