#include <iostream>

using namespace std;

int main()
{
    long long n;

    cin >> n;

    if (n == 0)
    {
        cout << 1 << endl;
        return 0;
    }

    if (n >= 0)
        cout << (n * (n + 1)) / 2;
    else
        cout << -((abs(n) * (abs(n) + 1)) / 2 - 1);
    return 0;
}
