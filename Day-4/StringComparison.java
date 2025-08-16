public class StringComparison {
    public static void main(String[] args) {
        String str1 ="Java";
        String str2 = "Java";
        String str3 = new String("Java");
        
        // Comparing "refernces"
        System.err.println("Comparing str1 and str2 using ==  " 
        + (str1 == str2));

        
        System.err.println("Comparing str1 and str2 using ==  " 
        + (str1 == str3));
    }
    
}
