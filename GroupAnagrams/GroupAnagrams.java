class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] words) {
        List<List<String>> groupedAnagrams = new ArrayList();
        Map<String, List<String>> map = new HashMap();

        for(var word: words){
            char[] wordAsChars = word.toCharArray();
            Arrays.sort(wordAsChars);
            String sortedWord = new String(wordAsChars);
            map.computeIfAbsent(sortedWord, x -> new ArrayList<>()).add(word);
        }

         groupedAnagrams.addAll(map.values());
         return groupedAnagrams;
    }

}