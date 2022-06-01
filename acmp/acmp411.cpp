#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main()
{
    double a, b, c;

    cin >> a >> b >> c;

    if (a == 0 && b == 0)
    {
        if (c == 0)
        {
            cout << -1 << endl;
            return 0;
        }
        cout << 0 << endl;
        return 0;
    }

    if (a == 0)
    {
        if (c == 0 && b == 0)
        {
            cout << -1 << endl;
            return 0;
        }
        cout << 1 << endl;
        cout << setprecision(10) << fixed << -c / b;
        return 0;
    }
    double d = b * b - 4 * a * c;
    if (d == 0)
    {
        cout << 1 << endl;
        cout << setprecision(10) << fixed << -b / (2 * a);
        return 0;
    }
    if (d < 0)
    {
        cout << 0 << endl;
        return 0;
    }
    cout << 2 << endl;
    cout << setprecision(10) << fixed << (-b + sqrt(d)) / (2 * a) << endl;
    cout << setprecision(10) << fixed << (-b - sqrt(d)) / (2 * a) << endl;
    return 0;
}
