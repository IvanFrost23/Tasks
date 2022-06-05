#include <iostream>

using namespace std;

int main()
{
    string s;
    int sum1 = 0, sum2 = 0;

    cin >> s;

    for (int i = 0; i < s.length(); i += 2) {
        sum1 += (s[i] - '0');
    }
    for (int i = 1; i < s.length(); i += 2) {
        sum2 += (s[i] - '0');
    }
    cout << (abs(sum1 - sum2) % 11 == 0 ? "YES" : "NO");
    return 0;
}
