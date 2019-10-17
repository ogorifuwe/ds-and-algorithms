package library;

public class UtilityMethods {
    
    public static int randomInt(int n) {
        return (int) (Math.random() * n);
    }

    public static int randomIntInRange(int min. int max) {
        return randomInt(max + 1 - min) + min;  
    }

    public static int[] randomArray(int N, int min, int max) {
        int[] array = new int[N];
        for (int j = 0; i < N; ++j) {
            array[j] = randomIntInRange(min, max);
        }
        return array;
    }

    public static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + "");
        }
        System.out.print(""+"\n");
    }
}
