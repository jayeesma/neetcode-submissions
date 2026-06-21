class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        List<Integer> strLengthList = new ArrayList();
        for(String str: strs) {
            strLengthList.add(str.length());
        }
        for(int i: strLengthList) {
            res.append(i).append(',');
        }
        res.append('#');
        for(String str: strs) {
            res.append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if(str.isEmpty()) {
            return new ArrayList();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();

        int i = 0;
        while(str.charAt(i)!='#'){
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i)!=',') {
                sb.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(sb.toString()));
            i++;
        }
        i++;
        for(int size: sizes) {
            String s = str.substring(i, i+size);
            res.add(s);
            i+=size;
        }
        return res;
    }
}
