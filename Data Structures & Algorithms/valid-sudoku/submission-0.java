class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rowSet = new HashSet();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                if (rowSet.contains(board[i][j])) {
                    return false;
                }
                rowSet.add(board[i][j]);
            }
        }

        for (int j = 0; j < 9; j++) {
            HashSet<Character> columnSet = new HashSet();
            for (int i = 0; i < 9; i++) {
                if (board[i][j] == '.') continue;
                if (columnSet.contains(board[i][j])) {
                    return false;
                }
                columnSet.add(board[i][j]);
            }
        }


        for (int block = 0; block < 9; block++) {
            HashSet<Character> threeSqSet = new HashSet();
            for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
                for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
                    if (board[i][j] == '.') continue;
                    if (threeSqSet.contains(board[i][j])) {
                        return false;
                    }
                    threeSqSet.add(board[i][j]);
                }
            }
        }
        return true;
    }
}