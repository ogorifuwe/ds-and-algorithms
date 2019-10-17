public class PaintFill {

    static enum Color { Black, White, Red, Yellow, Green }

    static String printColor(Color c) {
        switch(c) {
            case Black: 
                return "B";
            case White: 
                return "W";
            case Red:
                return "R";
            case Yellow:
                return "Y";
            case Green:
                return "G";
        }
        return "X";
    }

    static void printScreen(Color[][] screen) {
        for (int r = 0; r < screen.length; ++r) {
            for (int c = 0; c < screen[0].length; ++c) {
                System.out.print(printColor(screen[r][c]));
            }
            System.out.print("\n");
        }
    }

    static int randomInt(int n) {
        return (int) (Math.random() * n);
    }

    static boolean paintFill(Color[][] screen, int r, int c, Color ncolor) {
        if (screen[r][c] == ncolor) return false;
        return paintFill(screen, r, c, screen[r][c], ncolor);
    }

    static boolean paintFill(Color[][] screen, int r, int c, Color ocolor,
                                                        Color ncolor) {
        if (r < 0 || r >= screen.length || c < 0 || c >= screen[0].length) {
            return false;
        }

        if (screen[r][c] == ocolor) {
            screen[r][c] = ncolor;
            paintFill(screen, r-1, c, ocolor, ncolor);  // up
            paintFill(screen, r+1, c, ocolor, ncolor);  // down
            paintFill(screen, r, c-1, ocolor, ncolor);  // left
            paintFill(screen, r, c+1, ocolor, ncolor);  // right
        }
        return true;
    }

    public static void main(String[] args) {
        int N = 10;
        Color[][] screen = new Color[N][N];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                screen[i][j] = Color.Black;
            }
        }
        for (int i = 0; i < 100; ++i) {
            screen[randomInt(N)][randomInt(N)] = Color.Green;
        }
        printScreen(screen);
        paintFill(screen, 2, 2, Color.White);
        System.out.print("\n");
        printScreen(screen);
    }
}
