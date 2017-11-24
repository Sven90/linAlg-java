package linearAlgebra;

/**
 * this class represents a matrix
 * @author sven
 */
public class Matrix {
    
    // rows, cols
    int m, n;
    // matrix itself
    double[][] matrix;
    
    public Matrix(int m, int n) throws IllegalArgumentException {
        
        if (m < 1 || n < 1)
            throw new IllegalArgumentException("Row and Column length have to be >= 1");
        
        this.m = m;
        this.n = n;
        matrix = new double[m][n];
    }
}
