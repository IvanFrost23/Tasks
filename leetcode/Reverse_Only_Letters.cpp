class Solution {
public:
    bool is_letter(char ch)
    {
        if (ch >= 'a' && ch <= 'z')
        {
            return true;
        }
        if (ch >= 'A' && ch <= 'Z')
        {
            return true;
        }
        return false;
    }
    
    string reverseOnlyLetters(string s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (true)
        {
            while (left < right && !is_letter(s[left]))
            {
                left++;
            }
            while (left < right && !is_letter(s[right]))
            {
                right--;
            }
            if (left < right)
            {
                swap(s[left++], s[right--]);
            }
            else
            {
                break;
            }
        }
        return s;
    }
};