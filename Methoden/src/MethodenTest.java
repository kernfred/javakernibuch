public class MethodenTest {
    public static void main(String[] args) {
        int[][] field = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        int lenght = 10;
        int height = 10;


        for (int i = 0; i < height; i++) {
            for (int j = 0; j < lenght; j++) {
                System.out.print(field[i][j] + " | ");
            }
            System.out.println();

        }
        for (int i = 0; i < height; i++) {
            int temp = 0;
            for (int j = 0; j < lenght; j++) {
                if (i == 0 && j == 0){
                    if (field[i][(j + 1)] == 1){
                        temp++;
                    }
                    if (field[(i + 1)][j] == 1){
                        temp++;
                    }
                    if (field[(i + 1)][(j + 1)] == 1){
                        temp++;
                    }
                } else if (i == 0 && j > 0  && j < 10) {
                    if (j < 9) {
                        if (field[(i)][(j - 1)] == 1) {
                            temp++;
                        }
                        if (field[i][(j + 1)] == 1) {
                            temp++;
                        }
                        if (field[(i + 1)][(j - 1)] == 1) {
                            temp++;
                        }
                        if (field[(i + 1)][j] == 1) {
                            temp++;
                        }
                        if (field[(i + 1)][(j + 1)] == 1) {
                            temp++;
                        }
                    } else {
                        if (field[(i)][(j - 1)] == 1) {
                            temp++;
                        }
                        if (field[(i + 1)][(j - 1)] == 1) {
                            temp++;
                        }
                        if (field[(i + 1)][j] == 1) {
                            temp++;
                        }
                    }
                } else if (i > 0 && j == 0 && i < 9){
                    if (field[(i - 1)][j] == 1){
                        temp++;
                    }
                    if (field[(i - 1)][(j + 1)] == 1){
                        temp++;
                    }
                    if (field[i][(j + 1)] == 1){
                        temp++;
                    }
                    if (field[(i + 1)][j] == 1){
                        temp++;
                    }
                    if (field[(i + 1)][(j + 1)] == 1){
                        temp++;
                    }
                }else if (i == 9 && j == 9){
                    if (field[i][(j - 1)] == 1) {
                        temp++;
                    }
                    if (field[(i - 1)][(j - 1)] == 1) {
                        temp++;
                    }
                    if (field[(i - 1)][j] == 1) {
                        temp++;
                    }
                }else if (i == 9 && j < 9 && j >= 0){
                    if (j > 0) {

                    if (field[(i - 1)][(j - 1)] == 1) {
                        temp++;
                    }
                    if (field[(i - 1)][j] == 1) {
                        temp++;
                    }
                    if (field[(i - 1)][(j + 1)] == 1) {
                        temp++;
                    }
                    if (field[i][(j - 1)] == 1) {
                        temp++;
                    }
                    if (field[i][(j + 1)] == 1) {
                        temp++;
                    }
                    } else {
                        if (field[(i - 1)][j] == 1) {
                            temp++;
                        }
                        if (field[(i - 1)][(j + 1)] == 1) {
                            temp++;
                        }
                        if (field[i][(j + 1)] == 1) {
                            temp++;
                        }
                    }
                } else if (i < 9 && j == 9 && i > 0){
                    if (field[(i - 1)][(j - 1)] == 1) {
                        temp++;
                    }
                    if (field[(i - 1)][j] == 1) {
                        temp++;
                    }
                    if (field[i][(j - 1)] == 1) {
                        temp++;
                    }
                    if (field[(i + 1)][(j - 1)] == 1) {
                        temp++;
                    }
                    if (field[(i + 1)][j] == 1) {
                        temp++;
                    }
                }
                else {
                    if (field[(i - 1)][(j - 1)] == 1) {
                        temp++;
                    }
                    if (field[(i - 1)][j] == 1) {
                        temp++;
                    }
                    if (field[(i - 1)][(j + 1)] == 1) {
                        temp++;
                    }
                    if (field[i][(j - 1)] == 1) {
                        temp++;
                    }
                    if (field[i][(j + 1)] == 1) {
                        temp++;
                    }
                    if (field[(i + 1)][(j - 1)] == 1) {
                        temp++;
                    }
                    if (field[(i + 1)][j] == 1) {
                        temp++;
                    }
                    if (field[(i + 1)][(j + 1)] == 1) {
                        temp++;
                    }

                }
                if ()
            }
        }
    }

}