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
    void search(TreeNode* vertex, int& minDiff, bool& has_prev, int& prev) {
        if (vertex == nullptr) {
            return;
        }
        search(vertex -> left, minDiff, has_prev, prev);
        if (has_prev) {
            minDiff = min(minDiff, vertex -> val - prev);
        }
        has_prev = true;
        prev = vertex -> val;
        search(vertex -> right, minDiff, has_prev, prev);
    }
    int minDiffInBST(TreeNode* root) {
        int minDiff = 2e9;
        bool has_prev = false;
        int prev = 0;
        search(root, minDiff, has_prev, prev);
        return minDiff;
    }
};
