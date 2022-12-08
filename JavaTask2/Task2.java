public class Joining {

    public static void main(String args[]) {
       String s = "String";
       int count = 3;
       for (int i = 1; i <= count; i++) {
         s = s.concat("String");
       }
       System.out.println(s);
    }
 }