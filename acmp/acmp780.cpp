#include <iostream>

using namespace std;

int main()
{
    int n, sum = 0;

    cin >> n;

    for (int i = 1; i <= n; i++)
    {
        sum += i;
        if (sum == n)
        {
            cout << i;
            return 0;
        }
    }
    cout << 0 << endl;
    return 0;
}
