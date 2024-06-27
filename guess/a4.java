package guess;

public class a4 {
    public static void main(String[] args){
    String str1 = new String("open");
    String str2 = new String("source");
    String str3 = new String("opengenus");

    str3 = str1;
    str2 = str3;
    str1 = str2;
        // str2 and str3 can be garbage collected;

    };
    
}
