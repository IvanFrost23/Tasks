#include <iostream>
#include <vector>
#include <iomanip>

using namespace std;

vector <double> a;

int main()
{
    int n;

    cin >> n;

    for (int i = 0; i < n; i++)
    {
        double x;

        cin >> x;

        a.push_back(x);
    }

    double ans = 0;

    for (int i = 1; i < n; i++)
    {
        ans +=  (a[i - 1] + a[i]) / (double)2;
    }

    cout << setprecision(10) << fixed << ans / (double)(n - 1);


    return 0;
}
