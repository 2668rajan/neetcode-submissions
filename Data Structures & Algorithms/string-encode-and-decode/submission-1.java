class Solution {

    public String encode(List<String> list) {
         StringBuilder sb = new StringBuilder();
        for (String s : list){
            sb.append(s.length())
                    .append("#")
                    .append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String encoded) {
     List<String> result = new ArrayList<>();

        int i=0;
        while(i<encoded.length()){
            int j=i;

            while (encoded.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(encoded.substring(i,j));

            String temp = encoded.substring(j+1, j+1+len);
           
            result.add(temp);
            i=j+len+1;
        }
        return result;
    }
}
