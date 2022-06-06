#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int min_n(int x)
{
    string s = to_string(x);
    int l = s.length();
    for (int i = 0; i < 4 - l; i++)
    {
        s = '0' + s;
    }
    sort(s.begin(), s.end());
    return stoi(s);
}
int max_n(int x)
{
    string s = to_string(x);
    int l = s.length();
    for (int i = 0; i < 4 - l; i++)
    {
        s = '0' + s;
    }
    sort(s.begin(), s.end());
    string ans = "";
    for (int i = s.length() - 1; i >= 0; i--)
    {
        ans += s[i];
    }
    return stoi(ans);
}

int main()
{
    int x, q = 0;

    cin >> x;

    while (true)
    {
        int mi = min_n(x);
        int ma = max_n(x);
        if (ma - mi == x)
        {
            cout << x << endl << q << endl;
            return 0;
        }
        x = ma - mi;
        q++;
    }

    return 0;
}
