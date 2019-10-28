public class StringManip {
    public String trimConcat(String str1, String str2) {
        String i = str1.trim();
        String j = str2.trim();
        return i.concat(j);
    }

    public Integer getIndexNull(String str, char c) {
        int i = str.indexOf(c);
        if (i == -1) {
            return null;
        } else {
            return i;
        }
    }
    public Integer getIndexOrNull(String str, String str1){
        int i = str.indexOf(str1);
        if(i == -1){
            return null;
        } else {
            return i;
        }
    }
}