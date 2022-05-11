#include <iostream>

using namespace std;

int main()
{
    long long n, m, k;
    long long sum = 0, mred = 0, mwhite = 0;

    cin >> n >> m >> k;

    for (int i = 1; i <= m; i++)
    {
        long long red = i / k;
        long long white = i % k;
        mred = max(mred, red);
        mwhite = max(mwhite, white);
    }
    cout << n * (mred + mwhite);
    return 0;
}
