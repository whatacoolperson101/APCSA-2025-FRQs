public boolean clearPair(int row, int col) {
    int target = puzzle[row][col];
    for (int r = row; r < puzzle.length; r++) {
        int startCol = (r == row) ? col + 1 : 0;
        for (int c = startCol; c < puzzle[0].length; c++) {
            int val = puzzle[r][c];
            if (val != 0 && (val == target || val + target == 10)) {
                puzzle[row][col] = 0;
                puzzle[r][c] = 0;
                return true;
            }
        }
    }
    return false;
}
