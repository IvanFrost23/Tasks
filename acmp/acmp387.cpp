#include <iostream>

using namespace std;

int main()
{
    int n;
    int ans = 0;

    cin >> n;
    cin.ignore();
    for (int i = 0; i < n; i++)
    {
        string s;

        getline(cin, s);

        for (int j = 0; j < s.length(); j++)
        {
            if (s[j] == '>' && s[j - 1] == '-')
            {
                if (s[j + 1] == s[0])
                {
                    ans++;
                    break;
                }
                break;
            }
        }
    }
    cout << ans << endl;
    return 0;
}
