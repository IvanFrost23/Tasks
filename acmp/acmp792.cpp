#include <iostream>

using namespace std;

int main()
{
    int n1, p1, n2, p2;

    cin >> n1 >> p1 >> n2 >> p2;

    int sum1 = 0;
    int sum2 = 0;

    while (n1 != 0)
    {
        sum1 += n1 % p1;
        n1 /= p1;
    }

    while (n2 != 0)
    {
        sum2 += n2 % p2;
        n2 /= p2;
    }

    cout << (sum1 == sum2 ? sum1 : 0) << endl;
    return 0;
}
