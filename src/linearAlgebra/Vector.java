package linearAlgebra;

/**
 * this class represents a vector
 * @author sven
 */
public class Vector {
    
    // vector size
    private int m;
    // vector itself "eventuell mit BigDecimal arbeiten"
    private double[] vector;
    
    /**
     * default constructor m = 0 does mean that there is no vector, 
     * so vector = null makes sense
     */
    public Vector() {
        
        m = 0;
        vector = null;
    }
    
    /**
     * initialize zero vector with length m
     * @param m
     * @throws IllegalArgumentException 
     */
    public Vector(int m) throws IllegalArgumentException {
    
        if (m < 1) 
            throw new IllegalArgumentException("Vector length has to be >= 1!");
        
        this.m = m;
        vector = new double[m];
    }
    
    public String toString() {
         
        String s = "";
        
        return s;
    }
}
