#include <iostream>

using namespace std;

int main()
{
    int a, b, c;
    cin >> a >> b >> c;

    if (a == 0 && b == 0 && c == 0)
    {
        cout << 0 << endl;
        return 0;
    }

    if (a == 0)
    {
        if (b > 0)
        {
            if (b == 1)
            {
                cout << "x";
            }
            else
                cout << b << "x";
        }
        if (b < 0)
        {
             if (b == -1)
            {
                cout << "-x";
            }
            else
                cout << b << "x";

        }
        if (c != 0)
        {
            if (c == 1)
                cout << "y";
            if (c == -1)
                cout << "-y";
            if (abs(c) != 1 && c > 0)
                if (b != 0)
                cout << "+" << c << "y";
            else
                cout << c << "y";
            if (abs(c) != 1 && c < 0)
                cout << c << "y";

        }
    }
    else
    {
        cout << a;
        if (b > 0)
        {
            if (b == 1)
            {
                cout << "+x";
            }
            else
            cout << "+" << b << "x";
        }
        if (b < 0)
        {
            if (b == -1)
                cout << "-x";
                else
            cout << b << "x";
        }
        if (c > 0)
        {
            if (c == 1)
                cout << "+y";
            else
            cout << "+" << c << "y";
        }
        if (c < 0)
        {
            if (c == -1)
            {
                cout << "-y";
            }
            else
            cout << c << "y";
        }
    }
    return 0;
}
