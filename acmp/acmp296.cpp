#include <iostream>

using namespace std;

int main()
{
    int n;

    cin >> n;

    for (int i = n / 5; i >= 0; i--)
    {
        if ((n - i * 5) % 3 == 0)
        {
            cout << i << ' ' << (n - i * 5) / 3 << endl;
            return 0;
        }
    }
    return 0;
}
