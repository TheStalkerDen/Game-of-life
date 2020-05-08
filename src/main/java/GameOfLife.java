import java.util.Random;

class GameOfLife {
    private boolean[][] matrix;
    private int rows;
    private int cols;

    public GameOfLife(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        matrix = new boolean[cols][rows];
    }

    void Step(){
        Random random = new Random();
        int row = random.nextInt(rows);
        int col = random.nextInt(cols);
        matrix[col][row] = !matrix[col][row];
    }

    void setMatrix(boolean[][] matrix){
        this.matrix = matrix;
    }

    boolean[][] getMatrix(){
        return matrix;
    }

}
