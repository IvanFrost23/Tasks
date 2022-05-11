#include <iostream>

using namespace std;

int dx[8] = {-2, -1, 1, 2, 2, 1, -1, -2};
int dy[8] = {-1, -2, -2, -1, 1, 2, 2, 1};

int main()
{
    string s;

    cin >> s;

    int x = (s[0] - 'a' + 1);
    int y = (s[1] - '0');

    for (int i = 0; i < 8; i++)
    {
        int xx = x + dx[i];
        int yy = y + dy[i];
        if (xx >= 1 && xx <= 8 && yy >= 1 && yy <= 8)
        {
            cout << (char)(xx - 1 + 'a') << (char)(yy + '0') << endl;
        }
    }
    return 0;
}
