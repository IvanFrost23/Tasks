#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int n;

    cin >> n;

    vector <int> fib;

    fib.push_back(1);
    fib.push_back(1);

    for (int i = 2; i < n; i++)
    {
        fib.push_back(fib[i - 1] + fib[i - 2]);
    }

    if (n == 0)
    {
        cout << 0 << endl;
        return 0;
    }

    cout << fib[n - 1];
    return 0;
}
