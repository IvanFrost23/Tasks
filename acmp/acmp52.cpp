#include <iostream>

using namespace std;

int main()
{
    string s;

    cin >> s;

    if ((s[0] - '0') + (s[1] - '0') + (s[2] - '0') == (s[3] - '0') + (s[4] - '0') + (s[5] - '0')) {
        cout << "YES" << endl;
    }
    else
    {
        cout << "NO" << endl;
    }
    return 0;
}
