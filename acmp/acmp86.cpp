#include <iostream>

using namespace std;

int main()
{
    int n;

    cin >> n;

    if (n <= 2)
    {
        cout << 0 << endl;
        return 0;
    }

    cout << n * n - n - n - n + 2;
    return 0;
}
