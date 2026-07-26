class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        
        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            List<String> list = map.get(sortedString);
            if(list==null) list = new ArrayList();
            list.add(s);
            map.put(sortedString, list); 
           
        }
        List<List<String>> rs = new ArrayList();
         for(Map.Entry<String, List<String>> entry : map.entrySet()){
                rs.add(entry.getValue());
            }
         return rs;
    }
}
