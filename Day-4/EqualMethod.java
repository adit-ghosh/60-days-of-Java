public class EqualMethod {
    public static void main(String[] args) {
        String str1 ="Java";
        String str2 = "Java";
        String str3 = new String("Java");
        
        //Comparing the strings using equals() and equalsIgnoreCase()
        System.err.println("Comparing str1 and str2 using equals(): "
         + (str1.equals(str2)));

        System.err.println("Comparing str1 and str2 using equals(): "
         + (str1.equals(str3)));


        System.err.println("Comparing str1 and str2 using equalsIgnoreCase(): "
         + (str1.equalsIgnoreCase(str2)));

        System.err.println("Comparing str1 and str2 using equalsIgnoreCase(): "
         + (str1.equalsIgnoreCase(str3)));

        
    }
    
}
