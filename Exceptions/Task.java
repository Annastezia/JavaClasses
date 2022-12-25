import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dir1 = "src/array1.txt";
        String dir2 = "src/array2.txt";
        String dir3 = "src/array3.txt";
        String dir4 = "src/array4.txt";
        String dir5 = "src/noIntArray.txt";
        System.out.println("Files checking and adding to array:");
        ArrayList<String> dirs = fill(dir1, dir2, dir3, dir4, dir5);
        System.out.println("\nArray:");
        System.out.println(dirs);
        System.out.println("\nWorking process:");
        doTheJob(dirs.get(0), dirs.get(1));
        doTheJob(dirs.get(0), dirs.get(2));
        doTheJob(dirs.get(1), String.copyValueOf(dirs.get(1).toCharArray()));
    }

    private static void doTheJob(String arr1, String arr2) {
        try {
            int[] num1 = convert(arr1.split(","));
            int[] num2 = convert(arr2.split(","));
            if (num1 == null || num2 == null) {
                throw new RuntimeException("Can`t finish the job!");
            }
            int[] resultNumbers = devArray(num1, num2);
            print(resultNumbers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void print(int[] resultNumbers) {
        for (int num : resultNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int[] convert(String[] strArr) {
        int[] numArr = new int[strArr.length];
        try {
            for (int i = 0; i < strArr.length; i++) {
                numArr[i] = Integer.parseInt(strArr[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Can`t convert string to int value!");
            return null;
        } finally {
            System.out.println("Conversion done.");
        }
        return numArr;
    }

    private static int[] devArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays lengths are not equal, can`t calculate!");
        }
        for (int i = 0; i < result.length; i++) {
            if (arr2[i] == 0) {
                throw new ArithmeticException("Can`r divide by zero");
            }
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }

    private static ArrayList<String> fill(String... values) {
        ArrayList<String> dirs = new ArrayList<>();
        for (String value : values) {
            try {
                dirCheck(value);
                FileReader reader = new FileReader(value);
                Scanner scan = new Scanner(reader);
                dirs.add(scan.nextLine());
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
        return dirs;
    }

    private static void dirCheck(String path) throws Exception {
        File file = new File(path);
        if (file.exists()) {
            System.out.printf("File %s exists.\n", path);
            fileCheck(file);
        } else {
            throw new FileNotFoundException("No file found!");
        }
    }

    private static void fileCheck(File file) throws Exception {
        FileReader reader = new FileReader(file);
        Scanner scan = new Scanner(reader);
        if (!(scan.hasNext())) {
            throw new Exception("File is empty");
        }
    }
}
