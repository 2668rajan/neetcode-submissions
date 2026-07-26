class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //HashMap to store grouped Anagrams
        Map<String, List<String>> map = new HashMap();
        

        for(String s : strs){
            //convert each array to char array
            char[] charArray = s.toCharArray();

            //sort the char array
            Arrays.sort(charArray);

            //back to string that is sorted
            String sortedString = new String(charArray);

            // List<String> list = map.get(sortedString);
            // if(list==null) list = new ArrayList();
            // list.add(s);
            // map.put(sortedString, list); 

            //push the key into map if absent
            map.putIfAbsent(sortedString, new ArrayList());

            //push the current string
            map.get(sortedString).add(s);
           
        }

        //create the result list
        List<List<String>> rs = new ArrayList();
        //iterate over the map and add into result list for each key
         for(Map.Entry<String, List<String>> entry : map.entrySet()){
                rs.add(entry.getValue());
            }

            //return the list
         return rs;
    }
}
