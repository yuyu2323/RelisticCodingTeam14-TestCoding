public class Calculation {

    String[] week = {"Mon","Tue","Wen","Thur","Fri","Sat","Sun"};
    int[] monthday = {31,28,31,30,31,30,31,31,30,31,30,31};

    public int leapYear(int year){
    }

    public int totalDate(int year, int month, int day){
        int i = 0;

        return i;
    }

    public boolean isleapYear(int year){

        return true;

    }

    public String setDate(int year, int month, int day){

        int totday = totalDate(year,month,day);

        return week[totday%7];
    }

}