#include <iostream>

using namespace std;

int main()
{
    string s;
    int x;

    cin >> s >> x;

    if (s == "Home")
    {
        if (x % 2 == 0)
        {
            cout << "Yes\n";
        }
        else
        {
            cout << "Yes\n";
        }
    }
    else
    {
        cout << (x % 2 == 0 ? "No" : "Yes") << endl;
    }
    return 0;
}
