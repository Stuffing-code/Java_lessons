package XoGame;

public class Field {
    static char[][] cells = new char[3][3];

    public Field() {
    }

    void setCells() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = '.';
            }

        }
    }

    void showCells() {
        for (char[] cell : cells) {
            System.out.println(cell);
        }
    }

    public void drowX(int x, int y) {
        cells[x][y] = 'X';
        showCells();
    }
    public void drowO(int x, int y) {
        cells[x][y] = 'O';
        showCells();
    }
}
