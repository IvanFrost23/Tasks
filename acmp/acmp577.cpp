#include <iostream>
#include <map>

using namespace std;

map <int, int> a;

int main()
{
    int n, m;

    cin >> n >> m;

    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= m; j++)
        {
            long long mnoj = i * j;
            while (mnoj != 0)
            {
                a[mnoj % 10]++;
                mnoj /= 10;
            }
        }
    }

    for (int i = 0; i <= 9; i++)
    {
        cout << a[i] << endl;
    }
    return 0;
}
