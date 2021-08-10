// AUTHOR - HIMANK JESHWAR
// DATE = 10/8/21

// Math.pow() is used to return a value of the first argument raised to
// the power of second argument.
// eg= double m=Math.pow(n,5) n is a number that is multiplied 5 times as mentioned 
// in second argument (n x n x n x n x n)
// Math.pow() always gives a answer in double

class Program5
{
    public static void main(String[] args) 
    {
        ///declaring...
        int a=3;
        int b=5;
        int c=8;
        //calculating...
        double ax=Math.pow(a,3);
        double bx=Math.pow(b,3);
        double cx=Math.pow(c,3);
        //printing...
        System.out.println("Cube of "+a+" is "+ax);   
        System.out.println("Cube of "+b+" is "+bx);
        System.out.print("Cube of "+c+" is "+cx);
    
    }
}