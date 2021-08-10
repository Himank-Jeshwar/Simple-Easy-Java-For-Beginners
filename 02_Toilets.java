// AUTHOR - HIMANK JESHWAR
// DATE - 10/8/21

// In a village, there are 236 houses and 28% have toilets.Find and Display
// how many houses have no toilet.

// WARNING :
// while calculating houses that have toilet 
// DO NOT WRITE => double 0.28*houses; => Your Answer will be 169.72 
// which is decimal but you need integer
// ALSO DO NOT WRITE => int 28/100*houses; => Your Answer will be 0.
// INSTEAD WRITE THIS => 28*houses/100;
class Toilets
{
    public static void main(String[] args) 
    {   
        //declaration
        int houses=236;
        //calculation
        int haveToilet=28*houses/100;
        int noToilet=houses-haveToilet;
        //output
        System.out.print("Number of Houses with no toilet = "+noToilet);
    }
}