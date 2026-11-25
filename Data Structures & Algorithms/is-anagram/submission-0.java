class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        HashMap<Character, Integer> charMap2 = new HashMap<>();
        for(char c:s.toCharArray()){
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c)+1);
            }else{
                charMap.put(c, 1);
            }
        }
        for(char d:t.toCharArray()){
            if(charMap2.containsKey(d)){
                charMap2.put(d, charMap2.get(d)+1);
            }else{
                charMap2.put(d, 1);
            }
        }
        return charMap.equals(charMap2);
    }
}
