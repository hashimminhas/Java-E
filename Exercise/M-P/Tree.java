package sprint;

public class Tree {

    public static void tree(int height) {
        if (height <= 0) {
            return; // no output
        }

        int trunkHeight = Math.max(1, height / 3);

        int trunkWidth;
        if (height <= 3) {
            trunkWidth = 1;
        } else if (height <= 6) {
            trunkWidth = 3;
        } else if (height <= 9) {
            trunkWidth = 5;
        } else {
            trunkWidth = 7;
        }

        // Branches: rowNumber from 1..height
        // spacing = height - rowNumber
        // branchSymbols = 2 * rowNumber - 1
        for (int row = 1; row <= height; row++) {
            int spacing = height - row;
            int branchSymbols = 2 * row - 1;

            printRepeated(' ', spacing);

            if (row == 1) {
                // top is a single '^'
                System.out.print('^');
            } else {
                // branches are like /*****\
                System.out.print('/');
                printRepeated('*', branchSymbols - 2);
                System.out.print('\\');
            }

            System.out.println();
        }

        // Trunk centered under the widest branch line (width = 2*height - 1)
        int maxWidth = 2 * height - 1;
        int trunkPadding = (maxWidth - trunkWidth) / 2;

        for (int i = 0; i < trunkHeight; i++) {
            printRepeated(' ', trunkPadding);
            printRepeated('|', trunkWidth);
            System.out.println();
        }
    }

    private static void printRepeated(char ch, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(ch);
        }
    }
}
