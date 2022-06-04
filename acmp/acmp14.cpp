#include <iostream>

using namespace std;

int gcd(int a, int b)
{
    while (b != 0)
    {
        int r = a % b;
        a = b;
        b = r;
    }
    return a;
}

int main()
{
    int a, b;

    cin >> a >> b;

    cout << a * b / gcd(a, b);
    return 0;
}
