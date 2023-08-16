
class Recursion { 
    static void recTest(int test) 
    { 
        if (test < 1) 
            return; 
  
        else { 
            System.out.printf("%d ", test); 
  
            // Statement 2 
            recTest(test - 1); 
  
            System.out.printf("%d ", test); 
            return; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int test = 3; 
        recTest(test); 
    } 
} 