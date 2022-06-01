#include <iostream>

using namespace std;

int matrix[9][9];
int dx[8] = {-1, -2, -2, -1, 1, 2, 2, 1};
int dy[8] = {-2, -1, 1, 2, 2, 1, -1, -2};

void quenn(int x, int y)
{
    matrix[x][y] = 1;
    int next_x = x;
    int next_y = y;
    while (true)
    {
        next_x++;
        if (next_x >= 1 && next_x <= 8 && next_y >= 1 && next_y <= 8)
        {
            matrix[next_x][next_y] = 1;
        }
        else
            break;
    }
    next_x = x;
    next_y = y;
    while (true)
    {
        next_x--;
        if (next_x >= 1 && next_x <= 8 && next_y >= 1 && next_y <= 8)
        {
            matrix[next_x][next_y] = 1;
        }
        else
            break;
    }

    next_x = x;
    next_y = y;
    while (true)
    {
        next_y--;
        if (next_x >= 1 && next_x <= 8 && next_y >= 1 && next_y <= 8)
        {
            matrix[next_x][next_y] = 1;
        }
        else
            break;
    }

    next_x = x;
    next_y = y;
    while (true)
    {
        next_y++;
        if (next_x >= 1 && next_x <= 8 && next_y >= 1 && next_y <= 8)
        {
            matrix[next_x][next_y] = 1;
        }
        else
            break;
    }

    next_x = x;
    next_y = y;
    while (true)
    {
        next_y++;
        next_x++;
        if (next_x >= 1 && next_x <= 8 && next_y >= 1 && next_y <= 8)
        {
            matrix[next_x][next_y] = 1;
        }
        else
            break;
    }

    next_x = x;
    next_y = y;
    while (true)
    {
        next_y--;
        next_x--;
        if (next_x >= 1 && next_x <= 8 && next_y >= 1 && next_y <= 8)
        {
            matrix[next_x][next_y] = 1;
        }
        else
            break;
    }

    next_x = x;
    next_y = y;
    while (true)
    {
        next_y++;
        next_x--;
        if (next_x >= 1 && next_x <= 8 && next_y >= 1 && next_y <= 8)
        {
            matrix[next_x][next_y] = 1;
        }
        else
            break;
    }

    next_x = x;
    next_y = y;
    while (true)
    {
        next_y--;
        next_x++;
        if (next_x >= 1 && next_x <= 8 && next_y >= 1 && next_y <= 8)
        {
            matrix[next_x][next_y] = 1;
        }
        else
            break;
    }
}

void ladia(int x, int y)
{
    matrix[x][y] = 1;
    int next_x = x;
    int next_y = y;
    while (true)
    {
        next_x++;
        if (next_x >= 1 && next_x <= 8 && next_y >= 1 && next_y <= 8)
        {
            matrix[next_x][next_y] = 1;
        }
        else
            break;
    }
    next_x = x;
    next_y = y;
    while (true)
    {
        next_x--;
        if (next_x >= 1 && next_x <= 8 && next_y >= 1 && next_y <= 8)
        {
            matrix[next_x][next_y] = 1;
        }
        else
            break;
    }

    next_x = x;
    next_y = y;
    while (true)
    {
        next_y--;
        if (next_x >= 1 && next_x <= 8 && next_y >= 1 && next_y <= 8)
        {
            matrix[next_x][next_y] = 1;
        }
        else
            break;
    }

    next_x = x;
    next_y = y;
    while (true)
    {
        next_y++;
        if (next_x >= 1 && next_x <= 8 && next_y >= 1 && next_y <= 8)
        {
            matrix[next_x][next_y] = 1;
        }
        else
            break;
    }
}

void knight(int x, int y)
{
    //matrix[x][y] = 1;
    for (int i = 0; i < 8; i++)
    {
        int next_x = x + dx[i];
        int next_y = y + dy[i];
        if (next_x >= 1 && next_x <= 8 && next_y >= 1 && next_y <= 8)
        {
            matrix[next_x][next_y] = 1;
        }
    }
}

int main()
{
    string s1, s2, s3;

    cin >> s1 >> s2 >> s3;

    int x1 = s1[0] - 'A' + 1;
    int y1 = s1[1] - '0';

    int x2 = s2[0] - 'A' + 1;
    int y2 = s2[1] - '0';

    int x3 = s3[0] - 'A' + 1;
    int y3 = s3[1] - '0';

    quenn(x1, y1);
    ladia(x2, y2);
    knight(x3, y3);

    int ans = 0;

    if (matrix[x1][y1] == 1)
        ans--;
    if (matrix[x2][y2] == 1)
        ans--;
    if (matrix[x3][y3] == 1)
        ans--;
    for (int i = 1; i <= 8; i++)
    {
        for (int j = 1; j <= 8; j++)
        {
            ans += matrix[i][j];
        }
    }
    cout << ans << endl;
    return 0;
}
