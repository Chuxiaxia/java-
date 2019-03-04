package hm_day7.Test8;

public class MyData {
    int year;
    int month;
    int day;

    public MyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void showDate(){
        System.out.println("日期：" + year + "年" + month + "月" + day + "日");

    }
    public void isBi(){
        if (year % 100 == 0 && year % 400 == 0){
            System.out.println(year + "是闰年");
        }else if (year % 100 != 0 && year % 4 == 0){
            System.out.println(year + "是闰年");
        }else {
            System.out.println(year + "不是闰年");
        }
    }

}
