#include <iostream>

using namespace std;

int matrix[1100][1100];

int main()
{
    int n, m;

    cin >> n >> m;

    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= m; j++)
        {
            if ((i * j) % 2 == 0)
            {
                matrix[i][j] = 1;
            }
        }
    }
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= m; j++)
        {
            if ((i * j) % 3 == 0)
            {
                matrix[i][j] = 2;
            }
        }
    }

    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= m; j++)
        {
            if ((i * j) % 5 == 0)
            {
                matrix[i][j] = 3;
            }
        }
    }

    int qBlack = 0;
    int qGreen = 0;
    int qBlue = 0;
    int qRed = 0;

    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= m; j++)
        {
            if (matrix[i][j] == 0)
            {
                qBlack++;
            }
            if (matrix[i][j] == 1)
            {
                qRed++;
            }
            if (matrix[i][j] == 2)
            {
                qGreen++;
            }
            if (matrix[i][j] == 3)
            {
                qBlue++;
            }
        }
    }
    cout << "RED : " << qRed << endl;
    cout << "GREEN : " << qGreen << endl;
    cout << "BLUE : " << qBlue << endl;
    cout << "BLACK : " << qBlack << endl;
    return 0;
}
