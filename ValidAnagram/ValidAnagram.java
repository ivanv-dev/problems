class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];

        for(int i = 0; i < s.length(); i++){
            alphabet[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            alphabet[t.charAt(i) - 'a']--;
        }
        for(var a: alphabet){
            if(a != 0) return false;
        }
        return true;
        
    }
}