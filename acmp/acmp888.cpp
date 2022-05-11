#include <iostream>
#include <vector>

using namespace std;

vector <int> a;

int main()
{
    int n, x;

    cin >> n;

    for (int i = 0; i < n; i++)
    {
        cin >> x;

        a.push_back(x);
    }

    long long ans = 0;
    int price = 3;

    for (int i = 0; i < n; i++)
    {
        if (a[i] == 0)
        {
            price = max(3, price - 3);
        }
        else
        {
            ans += price;
            price++;
        }
    }
    cout << ans << endl;
    return 0;
}
