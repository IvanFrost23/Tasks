class Solution {
public:
    bool isToeplitzMatrix(vector<vector<int>>& matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            int element = matrix[i][0];
            int dx = i;
            int dy = 0;
            while (dx < matrix.size() && dy < matrix[dx].size()) {
                if (matrix[dx][dy] != element) {
                    return false;
                }
                dx++;
                dy++;
            }
        }
        for (int i = 0; i < matrix[0].size(); i++) {
            int element = matrix[0][i];
            int dx = 0;
            int dy = i;
            while (dx < matrix.size() && dy < matrix[dx].size()) {
                if (matrix[dx][dy] != element) {
                    return false;
                }
                dx++;
                dy++;
            }
        }
        return true;
    }
};