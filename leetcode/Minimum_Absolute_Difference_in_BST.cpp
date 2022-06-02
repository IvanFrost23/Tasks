/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void dfs(TreeNode* vertex, int &mi, bool &hasPrev, int &prev) {
        if (vertex == nullptr)
            return;
        dfs(vertex -> left, mi, hasPrev, prev);
        if (hasPrev) {
            mi = min(mi, vertex -> val - prev);
        }
        hasPrev = true;
        prev = vertex -> val;
        dfs(vertex -> right, mi, hasPrev, prev);
    }
    int getMinimumDifference(TreeNode* root) {
        int prev = 0;
        bool hasPrev = false;
        int mi = 2e9;
        dfs(root, mi, hasPrev, prev);
        return mi;
    }
};
