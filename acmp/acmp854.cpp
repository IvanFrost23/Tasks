#include <iostream>

using namespace std;

int main()
{
    int a, b;
    string s;

    cin >> a >> b >> s;

    if (s == "fan")
    {
        cout << a << endl;
        return 0;
    }

    if (s == "auto")
    {
        cout << b << endl;
        return 0;
    }

    if (s == "heat")
    {
        cout << (a < b ? b : a) << endl;
        return 0;
    }

    if (s == "freeze")
    {
        cout << (a > b ? b : a) << endl;
        return 0;
    }
    return 0;
}
