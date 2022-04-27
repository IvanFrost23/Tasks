class Solution {
    public static Map <Character, Integer> help;
    static {
        help = new HashMap<>();
        help.put('M', 1000);
        help.put('D', 500);
        help.put('L', 50);
        help.put('V', 5);
        help.put('I', 1);
        help.put('X', 10);
        help.put('C', 100);
    }
    
    /*public static Map <String, Integer> help2;
    static {
        help2 = new HashMap<>();
        help2.put("I", 1);
        help2.put("X", 10);
        help2.put("C", 100);
        help2.put("IV", 4);
        help2.put("IX", 9);
        help2.put("XL", 40);
        help2.put("XC", 90);
        help2.put("CD", 400);
        help2.put("CM", 900);
    }*/
    
    public int romanToInt(String s) {
        int ans = 0;
        int index = 0;
        int len = s.length();
       
        for (int i = 0; i < len; i++) {
            if (i + 1 < len && help.get(s.charAt(i)) < help.get(s.charAt(i + 1))) {
                ans -= help.get(s.charAt(i));
            } else {
                ans += help.get(s.charAt(i));
            }
        }
        
        return ans;
    }
}