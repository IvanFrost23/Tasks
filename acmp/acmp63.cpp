#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int s, p;

    cin >> s >> p;

    long long d = s * s - 4 * p;
    long long a = (s - sqrt(d)) / 2;
    long long b = (s + sqrt(d)) / 2;
    cout << a << ' ' << b << endl;
    return 0;
}
