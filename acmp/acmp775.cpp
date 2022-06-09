#include <iostream>

using namespace std;

string inc(string n)
{
    int per = 0;
    if (n[n.length() - 1] == '9') {
        per = 1;
        n[n.length() - 1] = '0';
        for (int i = n.length() - 2; i >= 0; i--)
        {
            if (n[i] != '9') {
                n[i]++;
                per = 0;
                break;
            } else {
                n[i] = '0';
                per = 1;
            }
        }
        if (per == 1) {
            n = "1" + n;
        }
        return n;
    }
    else {
        n[n.length() - 1]++;
    }
    return n;
}

int main()
{
    string n, m;

    cin >> n >> m;

    if (m == "0")
    {
        cout << "NO" << endl;
        return 0;
    }

    cout << inc(n);
    return 0;
}
