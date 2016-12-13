package date;

import java.util.Date;
import java.util.Scanner;

public final class BirthdayWithJavaUtilDate implements BirthdayCalculator<Date> {

    @Override
    public Date parseDate(String str) {
        // TODO - return with the parsed date; format is: yyyy-MM-dd
       String [] result= str.split("-");
        try {
            int year = Integer.parseInt(result[0])-1900;
            int month = Integer.parseInt(result[1])-1;
            int day = Integer.parseInt(result[2]);
            return new Date(year, month,day);
        }
        catch(Exception e) {

        }

        return null;
    }

    @Override
    public String printMonthAndDay(Date date) {
        // TODO - return the date formatted: month & day (MM. dd.)
        if(date!=null){
            return String.format("%2d. %2d.",date.getMonth()+1,date.getDate());
        }
        return null;
    }

    @Override
    public boolean isAnniversaryToday(Date date) {
        // TODO - return with true if today is the same month+day as date
        Date actDate=new Date();
        if((actDate.getMonth()==date.getMonth())&(actDate.getDate()==date.getDate())){
            return true;
        }
        return false;
    }

    @Override
    public int calculateAgeInYears(Date birthday) {
        // TODO - return how many years age the input date 'birthday' was
        Date actDate=new Date();
        int yeardiff=actDate.getYear()-birthday.getYear();
        int monthdiff=actDate.getMonth()-birthday.getMonth();
        int daydiff=actDate.getDate()-birthday.getDate();

        if(yeardiff>0){
            if(monthdiff>=0){

                if(daydiff>=0){
                    return yeardiff;
                }
                else{
                    return yeardiff-1;
                }
            }
            else{
                return yeardiff;
            }
        }
        else {
            return 0;
        }
        //if((actDate.getYear()-birthday.getYear())>0){
        //    return (actDate.getMonth()-birthday.getMonth()>=0)? actDate.getYear()-birthday.getYear():actDate.getYear()-birthday.getYear()-1;
        //}
        //else{
        //    return actDate.getYear()-birthday.getYear();
        //}
        //
        //return -1;
    }

    @Override
    public int calculateDaysToNextAnniversary(Date date) {
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
        int daysto=0;
        Date actDate=new Date();
        Date dummyDate=new Date(actDate.getYear(),date.getMonth(),date.getDate());
        long diff=actDate.getTime()-dummyDate.getTime();
        long daydiff=(diff / (1000 * 60 * 60 * 24));
        daysto=(int)(daydiff>0?daydiff-1:daydiff==0?0:364+(daydiff-1));

        return daysto;
        //return daydiff>=0?daydiff:daydiff==0?364:365+daydiff;
        //return (int)( (dummyDate.getTime() - date.getTime()) / (1000 * 60 * 60 * 24));
    }

    public static void main(String[] args) {
        new BirthdayWithJavaUtilDate().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        Date birthdayDate = parseDate(birthdayStr);
        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        }
        else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");

}
