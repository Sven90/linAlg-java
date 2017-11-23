package linearAlgebra;

/**
 * this class represents a vector
 * @author sven
 */
public class Vector {
    
    // vector size
    int m;
    // vector itself "eventuell mit BigDecimal arbeiten"
    double[] vector;
    
    /**
     * initialize 0.0 vector with length m >= 1
     * @param m 
     */
    public Vector(int m) {
    
        if (m < 1) 
            throw new IllegalArgumentException("Vector length must be >= 1!");
        
        this.m = m;
        vector = new double[m];
    }
}
