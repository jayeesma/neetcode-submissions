class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs) {
            sb.append("%");
            sb.append(s.length());
            sb.append("!");
            sb.append(s);
        }
        System.out.println("Encoded:::"+sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        
        List<String> list = new ArrayList();
        int i =0;
        int length = 0;
        while(i<str.length()) {
            
                int j=i+1;
                StringBuilder strBui = new StringBuilder();
                while(j<str.length() && str.charAt(j)!='!') {
                    strBui.append(str.charAt(j));
                    j++;
                }
                length = Integer.parseInt(strBui.toString());
                System.out.println("length::"+length);

                StringBuilder lsb = new StringBuilder();
                if(length==0) {
                    list.add("");
                    i=j+1;
                    continue;
                }
                int k=0;
                j++;
                while(j<str.length() && k<length) {
                    lsb.append(str.charAt(j));
                    j++;
                    k++;
                }
                list.add(lsb.toString());
                i=j;
            

        }
        return list;
    }
}


