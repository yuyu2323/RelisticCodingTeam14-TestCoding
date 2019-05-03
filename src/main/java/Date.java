import java.util.StringTokenizer;

public class Date {
    private int year;
    private int month;
    private int day;
    private String date = "";

    Calculation cal = new Calculation();

    Date(String date) {

        StringTokenizer st = new StringTokenizer(date);
        String[] array = new String[st.countTokens()];

        int i = 0;
        while (st.hasMoreElements()) {
            array[i++] = st.nextToken();
        }

        if(verification(array))
        this.date = cal.setDate(year, month, day);
    }

    public Boolean verification(String[] array){

        if(array.length != 3){
            System.out.println("잘못된 설정");
            return false;
        }

        else {
            this.year = Integer.parseInt(array[0]);
            this.month = Integer.parseInt(array[1]);
            this.day = Integer.parseInt(array[2]);

            if (year < 2007) {
                System.out.println("잘못된 년도 설정");
                return false;
            }

            if (month < 1 || month > 12) {
                System.out.println("잘못된 월 설정");
                return false;
            }

            if (day < 1 || day > cal.monthday[month]) {
                System.out.println("잘못된 날짜 설정");
                return false;
            }
        }

        return true;
    }

    public String getDate() {
        return date;
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
}
