class Solution {
public:
    vector<int> sortArrayByParityII(vector<int>& nums) {
        int first = 0;
        int second = 1;
        
        while (true)
        {
            while (first < nums.size() && first % 2 == nums[first] % 2)
            {
                first += 2;
            }
            
            while (second < nums.size() && second % 2 == nums[second] % 2)
            {
                second += 2;
            }
            
            if (first < nums.size() && second < nums.size())
            {
                swap(nums[first], nums[second]);
            }
            else
            {
                break;
            }
        }
        
        return move(nums);
    }
};