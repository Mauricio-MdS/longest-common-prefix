class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (prefix.isEmpty()) break;
            int commonLength = 0;
            int minLength = Math.min(prefix.length(), strs[i].length());
            while (commonLength < minLength && prefix.charAt(commonLength) == strs[i].charAt(commonLength)) {
                commonLength++;
            }
            prefix = prefix.substring(0, commonLength);
        }
        return prefix;
    }
}