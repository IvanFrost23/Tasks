#include <iostream>
#include <vector>

using namespace std;

vector <long long> a;

int main()
{
    int n;

    cin >> n;
    long long sum = 0;
    for (int i = 0; i < n; i++)
    {
        int x;

        cin >> x;
        sum += x;
        a.push_back(x);
    }
    cout << a[a.size() / 2] << endl;
    return 0;
}
