#include <iostream>
#include <vector>

using namespace std;

vector <int> a;
vector <int> b, c;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int pol = 0, otr = 0;

    int n;

    cin >> n;

    for (int i = 0; i < n; i++)
    {
        int x;

        cin >> x;

        a.push_back(x);

        if (x > 0)
        {
            pol += x;
            b.push_back(i + 1);
        }
        else
        {
            otr += x;
            c.push_back(i + 1);
        }
    }

    if (abs(pol) > abs(otr))
    {
        cout << b.size() << endl;
        for (auto i : b)
        {
            cout << i << ' ';
        }
    }
    else
    {
        cout << c.size() << endl;
        for (auto i : c)
        {
            cout << i << ' ';
        }
    }

    return 0;
}
