#include <iostream>

using namespace std;

int main()
{
    long long n, m, f, l;

    cin >> n >> m >> f >> l;

    long long all = m + f + l - n;

    cout << all << ' ' << m - all << ' ' << f - all << endl;
    return 0;
}
