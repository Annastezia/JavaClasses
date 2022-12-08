public class Test {

    public static void main(String args[]) {
       String s = "Учение - свет!";
       char result1 = s.charAt(3);
       char result2 = s.charAt(10);
       System.out.println("Третий символ строки - " + result1);
       System.out.println("Десятый символ строки - " + result2);
    }
 }

 public class Test {

    public static void main(String args[]) {
       String str1 = "Я буду хорошим строителем!";
       String str2 = "Я буду хорошим программистом!";
       String str3 = "Я буду хорошим доктором!";
 
       int result = str1.compareTo(str2);
       System.out.println(result);
       
       result = str2.compareTo(str3);
       System.out.println(result);
      
       result = str3.compareTo(str1);
       System.out.println(result);
    }
 }

 public class Test {

    public static void main(String args[]) {
       String str1 = "Я буду хорошим программистом!";
       String str2 = "Я Буду Хорошим Программистом!";
       String str3 = "Я буду хорошим дворником!";
 
       int result = str1.compareToIgnoreCase(str2);
       System.out.println(result);
       
       result = str2.compareToIgnoreCase(str3);
       System.out.println(result);
      
       result = str3.compareToIgnoreCase(str1);
       System.out.println(result);
    }
 }

 public class Test {

    public static void main(String args[]) {
       String s = "Я стану программистом!";
       s = s.concat(" Очень хорошим программистом!");
       
       System.out.println(s);
    }
 }

 public class Test {

    public static void main(String args[]) {
       String str1 = "Добро пожаловать на ProgLang.su";
       String str2 = "Сайт для изучения программирования";
       StringBuffer str3 = new StringBuffer("Добро пожаловать на ProgLang.su");
       StringBuffer str4 = new StringBuffer("Добро пожаловать");
 
       boolean  result = str1.contentEquals(str3);
       System.out.println("Строка \"Добро пожаловать на ProgLang.su\" равна строке буфера \"Добро пожаловать на ProgLang.su\"? \n" + result);
       
       result = str2.contentEquals(str3);
       System.out.println("Строка \"Сайт для изучения программирования\" равна строке буфера \"Добро пожаловать на ProgLang.su\"? \n" + result);
       
       result = str1.contentEquals(str4);
       System.out.println("Строка \"Добро пожаловать на ProgLang.su\" равна строке буфера \"Добро пожаловать\"? \n" + result);
    }
 }

 public class Test {

    public static void main(String args[]) {
       char[] Str1 = {'п', 'р', 'и', 'в', 'е', 'т', ' ', 'м', 'и', 'р'};
       String Str2 = "";
 
       Str2 = Str2.copyValueOf(Str1);
       System.out.println("Возвращаемая строка: " + Str2);
 
       Str2 = Str2.copyValueOf(Str1, 2, 6);
       System.out.println("Возвращаемая строка: " + Str2);
    }
 }

 public class Test{

    public static void main(String args[]){
       String Str = new String("Добро пожаловать на ProgLang.su");
       boolean retVal;
 
       retVal = Str.endsWith("ProgLang.su");
       System.out.println("Возвращаемое значение: " + retVal);
 
       retVal = Str.endsWith("ProgLang");
       System.out.println("Возвращаемое значение: " + retVal);
    }
 }

 public class Test {

    public static void main(String args[]) {
       String Str1 = "Добро пожаловать на ProgLang.su";
       String Str2 = Str1;
       String Str3 = new String("Сайт для изучения программирования");
       String Str4 = new String("ДОБРО ПОЖАЛОВАТЬ НА PROGLANG.SU");
       boolean retVal;
 
       retVal = Str1.equalsIgnoreCase(Str2);
       System.out.println("Строка Str1 равна строке Str2? Ответ: " + retVal );
 
       retVal = Str1.equalsIgnoreCase(Str3);
       System.out.println("Строка Str1 равна строке Str3? Ответ: " + retVal );
       
       retVal = Str1.equalsIgnoreCase(Str4);
       System.out.println("Строка Str1 равна строке Str4? Ответ: " + retVal );
    }
 }

 import java.io.*;

public class Test{
   public static void main(String args[]){
      String Str1 = new String("Добро пожаловать на ProgLang.su");
      String Str2 = new String("ДОБРО ПОЖАЛОВАТЬ НА PROGLANG.SU");

      System.out.print("Каноническое представление Str1: " );
      System.out.println(Str1.intern());

      System.out.print("Каноническое представление Str2: " );
      System.out.println(Str2.intern());
   }
}

import java.io.*;

public class Test {

   public static void main(String args[]){
      String Str1 = new String("Добро пожаловать на ProgLang.su");
      String Str2 = new String("ProgLang.su" );

      System.out.print("Длина строки \"Добро пожаловать на ProgLang.su\" - " );
      System.out.println(Str1.length());

      System.out.print("Длина строки \"ProgLang.su\" - " );
      System.out.println(Str2.length());
   }
}

import java.io.*;

public class Test {

   public static void main(String args[]){
      String Str = new String("Добро пожаловать на ProgLang.su");

      System.out.print("Возвращаемое значение: ");
      System.out.println(Str.substring(5));

      System.out.print("Возвращаемое значение: ");
      System.out.println(Str.substring(5, 15));
   }
}

import java.io.*;

public class Test {

   public static void main(String args[]){
      String Str = new String("Добро пожаловать на ProgLang.su");

      System.out.print("Возвращаемое значение: ");
      System.out.println(Str.toCharArray());
   }
}

import java.io.*;

public class Test {

   public static void main(String args[]){
      String Str = new String("   Добро пожаловать на ProgLang.su   ");

      System.out.print("Возвращаемое значение: ");
      System.out.println(Str.trim());
   }
}