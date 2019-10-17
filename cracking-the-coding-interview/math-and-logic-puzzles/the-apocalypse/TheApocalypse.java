public class TheApocalypse {
    
    public static void main(String[] args) {
        double ratio = runNFamilies(1000000001);
        System.out.print(ratio+"\n");    
    }

    private static double runNFamilies(int n) {
        int girls = 0;
        int boys = 0;

        for (int i = 0; i < n; ++i) {
            int[] genders = runOneFamily();
            girls += genders[0];
            boys += genders[1];
        }

        return girls / (double) (girls + boys); 
    }

    private static int[] runOneFamily() {
        java.util.Random random = 
                        new java.util.Random();
        int girls = 0;
        int boys = 0;

        while (girls == 0) {    // until we have a girl
            if (random.nextBoolean()) { // girl
                girls += 1;
            } else {
                boys +=1;
            }
        }
        int[] gender = {girls, boys};

        return gender;
    }
}
