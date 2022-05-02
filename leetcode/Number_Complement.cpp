class Solution {
public:
    int findComplement(int num) {
        int left = 0;
        int right = 31;
        
        while (left + 1 < right) {
            int middle = (left + right) / 2;
            if ((1 << middle) > num)
            {
                right = middle;
            }
            else
            {
                left = middle;
            }
        }
      
        int mask = (1 << left) + ((1 << left) - 1);
        return mask ^ num;
    }
};