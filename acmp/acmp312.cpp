#include <iostream>

using namespace std;

int main()
{
    long long a1, a2, n;

    cin >> a1 >> a2 >> n;

    long long b = a2 - a1;

    cout << a1 + (n - 1) * b << endl;

    return 0;
}
