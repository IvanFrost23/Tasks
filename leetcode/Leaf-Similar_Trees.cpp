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
    void dfs(TreeNode* vertex, vector <int> &a) {
        if (vertex -> left == nullptr && vertex -> right == nullptr) {
            a.push_back(vertex -> val);
            return;
        }
        if (vertex -> left != nullptr) {
            dfs(vertex -> left, a);
        }
        if (vertex -> right != nullptr) {
            dfs(vertex -> right, a);
        }
    }
    
    bool leafSimilar(TreeNode* root1, TreeNode* root2) {
        vector <int> ans1;
        vector <int> ans2;
        dfs(root1, ans1);
        dfs(root2, ans2);
        return ans1 == ans2;
    }
};