#include <iostream>

using namespace std;

int main()
{
    int n, m;

    cin >> n >> m;

    int num = n / m;
    int uv = n % m;

    for (int i = 0; i < m - uv; i++)
    {
        cout << num << ' ';
    }
    for (int i = 0; i < uv; i++)
    {
        cout << num + 1 << ' ';
    }
    return 0;
}
