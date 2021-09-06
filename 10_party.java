class Groups
{
    public static void main(String[] args) 
    {
        // declare
        int total = 42;
        int kids = 8;
        // calculate
        int without_kids=total-kids;
        int women = 40*without_kids/100;
        int men = without_kids-women;
        // output
        System.out.println("Number of Men = "+men);
        System.out.println("Number of Women = "+women);
    }
}