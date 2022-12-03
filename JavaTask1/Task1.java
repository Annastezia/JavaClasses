/*
 * Отображение таблицы истинности для логических операций
 */

public class Main{
	public static void main(String[] args) {
		System.out.println("Таблица истинности P и Q");
		System.out.println("P Q  R");
    out(false,false);
    out(false,true);
    out(true,false);
    out(true,true);
	}
	public static void out(boolean p, boolean q){
        System.out.println((p ? "1 " : "0 ") + (q ? "1 " : "0 ") + (p&&q ? " 1" : " 0"));
    }
}