#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    int n, v, l;

    cin >> n >> v >> l;

    double minu = ((double)l / (double)v) * 60;

    for (int i = 0; i < n; i++)
    {
        int x, y;
        cin >> x >> y;
        minu += y;
    }
    cout << setprecision(2) << fixed << minu;
    return 0;
}
