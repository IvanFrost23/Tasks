#include <iostream>

using namespace std;

int main()
{
    int mi = 2e9, ma = -2e9;
    string s;
    int bal = 0;
    cin >> s;
    mi = 0;
    ma = 0;
    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] == '1')
        {
            bal++;
        }
        else
        {
            bal--;
        }
        mi = min(mi, bal);
        ma = max(ma, bal);
    }
    cout << ma - mi + 1;
    return 0;
}
