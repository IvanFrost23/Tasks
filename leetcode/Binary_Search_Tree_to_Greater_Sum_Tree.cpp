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
    void convert(TreeNode* vertex, int &greaterSum, int &last, int &qLast) {
        if (vertex == nullptr) {
            return;
        }
        convert(vertex -> right, greaterSum, last, qLast);
        
        if (vertex -> val == last) {
            qLast++;
        } else {
            greaterSum += last * qLast;
            last = vertex -> val;
            qLast = 1;
        }
        vertex -> val += greaterSum;
        convert(vertex -> left, greaterSum, last, qLast);
    }
    
public:
    TreeNode* bstToGst(TreeNode* root) {
        int sumGreater = 0;
        int lastElement = 0;
        int qElelement = 0;
        convert(root, sumGreater, lastElement, qElelement);
        return root;
    }
};