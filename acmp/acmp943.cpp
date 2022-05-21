#include <iostream>

using namespace std;

int main()
{
    int n, m, y, x;

    cin >> n >> m >> y >> x;

    if (y % 2 == 1) {
        cout << (y - 1) * m + x - 1;
    }
    else
    {
        cout << (y - 1) * m + (m - x);
    }
    return 0;
}
