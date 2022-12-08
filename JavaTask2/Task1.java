public class Main {
    
    public static void main(String[] args) {
        String str1 ="8301456";
        String str2 ="7fa61";
        System.out.println("First string:");
        System.out.println(str1);
        boolean res1 = test(str1);
        System.out.println(res1);
        System.out.println("\nSecond string:");
        System.out.println(str2);
        boolean res2 = test(str2);
        System.out.println(res2);                                
 }
     public static boolean test(String my_str) {
       for (int i = 0; i < my_str.length(); i++) {
           if (!Character.isDigit(my_str.charAt(i))) {
               return false;
           }
       }
       return true;
   }
}