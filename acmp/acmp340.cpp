#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    vector <int> a;
    vector <int> b;

    for (int i = 0; i < 3; i++)
    {
        int x;

        cin >> x;

        a.push_back(x);
    }

    for (int i = 0; i < 3; i++)
    {
        int x;

        cin >> x;

        b.push_back(x);
    }

    sort(a.begin(), a.end());
    sort(b.begin(), b.end());

    if (a[0] == b[0] && a[1] == b[1] && a[2] == b[2])
    {
        cout << "Boxes are equal" << endl;
        return 0;
    }

    if (a[0] >= b[0] && a[1] >= b[1] && a[2] >= b[2])
    {
        cout << "The first box is larger than the second one" << endl;
        return 0;
    }

    if (a[0] <= b[0] && a[1] <= b[1] && a[2] <= b[2])
    {
        cout << "The first box is smaller than the second one" << endl;
        return 0;
    }

    cout << "Boxes are incomparable" << endl;
    return 0;
}
