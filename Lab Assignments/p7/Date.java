class Date
{
    int d;
    int m, y;

    private static final int[] daysPerMonth = // days in each month
    { 0,31,28,31,30,31,30,31,31,30,31,30,31 };

    public Date(int d, int m, int y) {
        setDay(d);
        setMonth(m);
        this.y = y;
    }
    
    public Date() {
        this.d = 1;
        this.m = 1;
        this.y = 1970;
    }
    
    public Date(int d) {
        setDay(d);
        this.m = 1;
        this.y = 1970;
    }
    
    public Date(int d, int m) {
        setDay(d);
        setMonth(m);
        this.y = 1970;
    }
    
    // public String toString2()
    // {
    //     return String.format("%2d - %2d - %4d ", getDay(), getMonth(), getYear());
    // }

    public void setDay( int d )
{
    // check if day in range for month
    if ( d > 0 && d <= daysPerMonth[ m ] )
        this.d = d;

    if ( m == 2 && d == 29 && ( y % 400 == 0 ||
        ( y % 4 == 0 && y % 100 != 0 ) ) )
        this.d = d;

    throw new IllegalArgumentException(
        "day out of range for the specified month and year" );

}

public void setMonth( int m )
{
    if ( m> 0 && m <= 12 ) //validate month
        this.m = m;
    else // month is invalid
        throw new IllegalArgumentException(" month must be 1-12" );
}

//     private int checkMonth( int testMonth )
// {
//     if ( testMonth > 0 && testMonth <= 12 ) //validate month
//         return testMonth;
//     else // month is invalid
//         throw new IllegalArgumentException(" month must be 1-12" );
// }// end method check month

// // utilty method to confirm proper day value based on month and year
// private int checkDay( int testDay )
// {
//     // check if day in range for month
//     if ( testDay > 0 && testDay <= daysPerMonth[ m ] )
//         return testDay;

//     if ( m == 2 && testDay == 29 && ( y % 400 == 0 ||
//         ( y % 4 == 0 && y % 100 != 0 ) ) )
//         return testDay;

//     throw new IllegalArgumentException(
//         "day out of range for the specified month and year" );
// }// end method check day

// public String toString()
// { 
//     return String.format( "%d-%d-%d", day, month, year );
// }

public void nextDay()
    {
        if (m == 12 && d == 31) {
            m = d = 1;
            y++;
        } else if (d == daysPerMonth[m]) {
            d = 1;
            m++;
        } else {
            d++;
        }
    }

    public void previousDay() {
        if(d==1 && m==1)
        {
            d = 31;
            m = 12;
            y--;
        }
        else if(d==1)
        {
            d = daysPerMonth[--m];
        }
        else
        {
            d--;
        }
    }

    public void printDate() {

        System.out.println(d+","+m+","+y);
    }

    public static void main(String[] args) {
        Date d1 = new Date(), d2 = new Date();
        
        System.out.print("Current Date : ");

        d1.printDate();
        d1.nextDay();

        System.out.print("Next Day : ");
        d1.printDate();
        d2.previousDay();
        System.out.print("Previous Day : ");
        d2.printDate();
        
    }
}