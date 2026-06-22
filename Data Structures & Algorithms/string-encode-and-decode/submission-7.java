class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList();
        int i =0;
        int j =0;
        while(j<str.length()) {
            while(str.charAt(j)!='#') {
                j++;
            }
            int l = Integer.parseInt(str.substring(i,j));

            String s1 = str.substring(j+1,j+l+1);
            res.add(s1);

            j= j+l+1;
            i=j;
        }
        return res;
    }
}
