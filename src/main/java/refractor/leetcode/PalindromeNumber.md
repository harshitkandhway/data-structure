class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int i = 0;
        int l = str.length()-1;
        while(i<l){
            if(str.charAt(i)!=str.charAt(l)){
                return false;
            } else{
                i++;
                l--;
            }
        }
        return true;
    }
}
