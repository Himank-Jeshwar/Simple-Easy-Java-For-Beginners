// AUTHOR - HIMANK JESHWAR
// DATE-10/8/21

// An average income of 4 weeks is Rs.3545 and when it is done for 5 weeks
// the new average comes Rs.3280.Find and Display last week's income

// TIP:-
// To get the income of the fifth week you should get the total of 4 weeks and 5
// 5 weeks and then  substract the total of 4 weeks from 5 weeks total/ 
class Income
{
    public static void main(String[] args) 
    {
        //declaration
        double avg_inc4= 3545.0;
        double avg_inc5= 3280.0;
        //calculation
        double total_inc4=avg_inc4*4;
        double total_inc5=avg_inc5*5;
        double lw_inc=total_inc5-total_inc4;
        //output
        System.out.print("Last Week's Income = Rs."+lw_inc);   
    }
}