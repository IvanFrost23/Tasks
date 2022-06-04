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
    int n;

    cin >> n;

    int ans = 0;

    for (int i = 1; i < n; i++)
    {
        if (gcd(i, n) == 1)
        {
            ans++;
        }
    }

    cout << ans << endl;
    return 0;
}
