package linearAlgebra;

/**
 * this class represents a matrix
 * @author sven
 */
public class Matrix {
    
    // rows, cols
    private int m, n;
    // matrix itself
    private double[][] matrix;
    
    /**
     * default constructor m = n = 0 does mean that there is no matrix, 
     * so matrix = null makes sense
     */
    public Matrix() {
        
        m = n = 0;
        matrix = null;
    }
    
    /**
     * initialize zero matrix with m rows and n columns
     * @param m
     * @param n
     * @throws IllegalArgumentException 
     */
    public Matrix(int m, int n) throws IllegalArgumentException {
        
        if (m < 1 || n < 1)
            throw new IllegalArgumentException("Row and Column length have to be >= 1");
        
        this.m = m;
        this.n = n;
        matrix = new double[m][n];
    }
    
    @Override public String toString() {
         
        String s = "";
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                s = s + matrix[i][j] + " ";
            }
            s = s + "|";
        }
        
        return s;
    } 
}
