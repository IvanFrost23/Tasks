#include <iostream>

using namespace std;

int main()
{
    int x;
    int ind = 1;
    int ma = -2e9, mi = 2e9;
    while (cin >> x)
    {
        if (ind % 2 == 0)
        {
            ma = max(ma, x);
        } else {
            mi = min(mi, x);
        }
        ind++;
    }
    cout << ma + mi << endl;
    return 0;
}
