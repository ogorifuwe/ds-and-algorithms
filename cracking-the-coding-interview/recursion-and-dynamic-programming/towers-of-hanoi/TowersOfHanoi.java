public class TowersOfHanoi {

    public static void main(String[] args) {
        int n = 3;
        Tower[] towers = new Tower[3];
        for (int i = 0; i < 3; ++i) {
            towers[i] = new Tower(i);
        }

        towers[0].setName("source");
        towers[1].setName("destination");
        towers[2].SetName("buffer");

        /* load up tower */
        int m = 5;
        for (int i = m-1; i >= 0; --i) {
            towers[0].add(i);
        }
        towers[0].print();
        towers[0].moveDisks(m, towers[2], towers[1]);
        towers[1].print();
        

        

    }
}
