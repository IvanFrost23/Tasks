#include <iostream>

using namespace std;

int main()
{

    long long num;

    cin >> num;
    long long x = 1;
    long long y = 1;
    for (int i = 3; i <= 100000; i++)
    {
        long long cnt = y;
        y = y + x;
        x = cnt;
        if (y == num)
        {
            cout << 1 << endl << i;
            return 0;
        }
        if (y > num)
            break;
    }
    cout << 0 << endl;
    return 0;
}
