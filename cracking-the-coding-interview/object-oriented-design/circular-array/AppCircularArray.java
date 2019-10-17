public class AppCircularArray {

    public static void main(String[] args) {
        int size = 10;
        CircularArray<String> array = new CircularArray<String>(size);
        for (int i = 0; i < size; ++i) {
            array.set(i, String.valueOf(i));
        }

        array.rotate(3);
        for (int i = 0; i < size; i++) {
            System.out.print(array.get(i)+"\n");
        }

        System.out.print(""+"\n");

        /*array.rotate(2);
        for (String s : array) {
            System.out.print(s+"\n");
        }*/
    }
}
