
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int [] bigArray = new int [20];
        int [] smallArray1 = new int [10];
        int [] smallArray2 = new int [10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i < bigArray.length; i++)
        {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }

        smallArray1 = Arrays.copyOfRange(bigArray, 0, 9);
        smallArray2 = Arrays.copyOfRange(bigArray, 10, 20);

        for (int i=0; i < smallArray2.length; i++)
        {
            System.out.println(smallArray2[i]);
        }
    }
}
