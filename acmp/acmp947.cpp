#include <iostream>

using namespace std;

int main()
{
    double a;

    cin >> a;

    for (int i = 2; i <= 10000000; i++)
    {
        a -= (double)1 / (double)i;
        if (a < 0)
        {
            cout << i - 1 << " card(s)" << endl;
            return 0;
        }
    }
    return 0;
}
