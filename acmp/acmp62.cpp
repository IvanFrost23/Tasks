#include <iostream>

using namespace std;

int main()
{
    string s;

    cin >> s;

    int x1 = s[0] - 'A' + 1;
    int y1 = s[1] - '0';

    if (x1 % 2 == 1 && y1 % 2 == 1)
    {
        cout << "BLACK" << endl;
    }
    if (x1 % 2 == 1 && y1 % 2 == 0)
    {
        cout << "WHITE" << endl;
    }
    if (x1 % 2 == 0 && y1 % 2 == 0)
    {
        cout << "BLACK" << endl;
    }
    if (x1 % 2 == 0 && y1 % 2 == 1)
    {
        cout << "WHITE" << endl;
    }
    return 0;
}
