#include <iostream>

using namespace std;

int main()
{
    long long n, m;

    cin >> n >> m;

    if (n == 1 && m == 1) {
        cout << 0 << endl;
        return 0;
    }
    if (n < 1 || m < 1)
    {
        cout << 1 << endl;
        return 0;
    }

    if (n == 1 || m == 1)
    {
        cout << 1 << endl;
        return 0;
    }

    if (n == m)
    {
        cout << 2 << endl;
    }
    else
    {
        cout << 1 << endl;
    }
    return 0;
}
