import java.util.Scanner;

public class Question13 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int[][] sudokuGrid = new int[9][9];

        System.out.println("Enter the grid, one row per line:");


        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                sudokuGrid[i][j] = scanner.nextInt();
            }
        }

        int[] boxesLocations = { 0, 3, 6 };
        for(int r : boxesLocations){
            for(int c : boxesLocations){
                int[] box = box(sudokuGrid, r, c);

                if(!hasAllNine(box)){
                    System.out.println("Invalid solution");
                    return;
                }
            }
        }

        for(int i = 0; i < sudokuGrid.length; i++){
            int[] row = row(sudokuGrid, i);
            int[] col = column(sudokuGrid, i);

            if(!hasAllNine(row) || !hasAllNine(col)){
                System.out.println("Invalid solution");
                return;
            }
        }

        System.out.println("Valid solution");


    }

    static boolean hasAllNine(int[] values){
        boolean[] seens = { false, false, false, false, false, false, false, false, false };

        for(int number : values){
            if(seens[number - 1]) return false;

            seens[number - 1] = true;
        }

        for(boolean seen : seens){
            if(!seen) return false;
        }

        return true;
    }

    static int[] row(int[][] grid, int r){
        int[] row = new int[grid[r].length];

        for(int col = 0; col < grid[r].length; col++){
            row[col] = grid[r][col];
        }

        return row;
    }

    static int[] column(int[][] grid, int c){
        int[] column = new int[grid.length];

        for(int row = 0; row < grid.length; row++){
            column[row] = grid[row][c];
        }

        return column;
    }

    static int[] box(int[][] grid, int r, int c){
        int[] box = new int[9];
        int boxIndex = 0;

        for(int row = r; row < r + 3; row++){
            for(int col = c; col < c + 3; col++){
                box[boxIndex] = grid[row][col];
                boxIndex++;
            }
        }

        return box;
    }
}
