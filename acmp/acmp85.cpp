#include <iostream>

using namespace std;

int gcd(int x, int y)
{
    while (y != 0)
    {
        int r = x % y;
        x = y;
        y = r;
    }
    return x;
}

int main()
{
    int n, m;

    cin >> n >> m;

    for (int i = 0; i < gcd(n, m); i++)
    {
        cout << 1;
    }
    return 0;
}
