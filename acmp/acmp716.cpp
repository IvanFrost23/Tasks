#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    int n;
    double x, old;
    double left = 30;
    double right = 4000;

    cin >> n >> old;

    for (int i = 0; i < n - 1; i++)
    {
        string s;
        cin >> x >> s;

        if (x == old) continue;

        if (s == "closer")
        {
            if (x > old)
            {
                left = max(left, (x + old) / (double)2);
            }
            else
            {
                right = min(right, (x + old) / (double)2);
            }
        }
        else
        {
            if (x <= old)
            {
                left = max(left, (x + old) / (double)2);
            }
            else
            {
                right = min(right, (x + old) / (double)2);
            }
        }

        old = x;
    }
    left = max((double)30, left);
    right = min((double)4000, right);
    cout << setprecision(10) << fixed << left << ' ' << right << endl;
    return 0;
}
