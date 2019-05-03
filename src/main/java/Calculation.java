public class Calculation {

    String[] week = {"Mon","Tue","Wen","Thur","Fri","Sat","Sun"};
    int[] monthday = {31,28,31,30,31,30,31,31,30,31,30,31};

    public int leapYear(int year){
        if(year == 2007)
            return 0;
        else{
            int leapnumber = (year/4 - 501) - (year/100 -20) + (year/400 - 5);
            return leapnumber;
        }
    }

    public int totalDate(int year, int month, int day){
        int i = 0;
        int leap = leapYear(year);

        i += (year-2007)*365 + leap;
        /***************************************/
        if(month > 2)
            if(isleapYear(year))
                i += 1;

        for(int j = 0; j < month-1; j++)
            i += monthday[j];
         /***************************************/

         i += day - 1;

        return i;
    }

    public boolean isleapYear(int year){

        if(year%4 == 0 && (year%100 != 0) || year%400 == 0){
        return true;
        }
        else{
            return false;
        }

    }

    public String setDate(int year, int month, int day){

        int totday = totalDate(year,month,day);

        return week[totday%7];
    }

}
