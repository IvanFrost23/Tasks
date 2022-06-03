#include <iostream>
#include <string>

using namespace std;

bool happy(int x)
{
    string s = to_string(x);
    int l = s.length();
    for (int i = 0; i < 6 - l; i++)
        s = '0' + s;
    if ((s[0] - '0') + (s[1] - '0') + (s[2] - '0') == (s[3] - '0') + (s[4] - '0') + (s[5] - '0'))
        return true;
    return false;
}

int main()
{
    int n;

    cin >> n;

    for (int i = 0; i < n; i++)
    {
        int x;

        cin >> x;

        if (happy(x + 1) || happy(x - 1))
        {
            cout << "Yes" << endl;
        }
        else
        {
            cout << "No" << endl;
        }
    }
    return 0;
}
