package Arrays_Hashing;

import java.util.HashSet;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        // a sudoku can only be solved
        // if 1-9 appear in every row
        // 1-9 appear in every col
        // 1-9 appear in every box
        // keep record of each appearance and check if it's valid'
        // scenario where it's false break out loop'
        // use a hashset to store all posisble outcomes

        HashSet<String> set = new HashSet<>();

        for(int i = 0 ; i< board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                char cellValue = board[i][j];
                if(cellValue != '.'){
                    String rowKey = "row" + i+ cellValue;
                    String colKey = "col" + j+cellValue;
                    String boardKey = "box" + (i/3) + " "+ (j/3)+ cellValue;

                    if(set.contains(rowKey) ||
                            set.contains(colKey)){
                        return false;
                    }else{
                        set.add(rowKey);
                        set.add(colKey);

                    }
                    if(set.contains(boardKey)){
                        return false;
                    }else{
                        set.add(boardKey);
                    }

                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(board));

    }

}
