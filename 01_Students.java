// AUTHOR - HIMANK JESHWAR
// DATE - 10/8/21

// 63% students have dropped out of a school Lockdown I and one-fourth of the 
// remaining dropped out in Lockdown II. If the total strength of the school
// was 400,how many is left now?

// WARNING FOR BEGINNERS (Please Read This):

// For declaring 63 percent students who dropped out in Lockdown I,
// you have to convert it into a value by multiplying the percentage with the
// total number of students i.e, 400.
// DO NOT WRITE => int 63/100*totstud; or double 0.63*totstud;
// CORRECT METHOD => int 63*totstud/100

// For declaring 1/4 of the remaining students who dropped out in Lockdown II,
// you have to also convert it into a value by multiplying it with the remaining
// after Lockdown I 
// DO NOT WRITE => int 1/4*rm_after_l1;
// INSTEAD WRITE => int rm_after_l1/4; or int 1*rm_after_l1/4;
class Students
{
    public static void main(String[] args) 
    {
        //declaration
        int totStud=400;
        //calculation
        int l1=63*totStud/100;
        int rm_after_l1=totStud-l1;
        int l2=rm_after_l1/4;
        int remaining=rm_after_l1-l2;
        //output
        System.out.print("Students Remaining after Lockdown 1 and 2 = "+remaining);    
    }
}