package hm_day8.Test5;

public class Test5 {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("666","傅红雪");
        l.work();
        System.out.println("---------------------------------------------");
        Tutor t = new Tutor("668","顾棋");
        t.work();
        System.out.println("---------------------------------------------");
        Maintainer m = new Maintainer("686","庖丁");
        m.work();
        System.out.println("---------------------------------------------");
        Buyer b = new Buyer("888","景甜");
        b.work();
        System.out.println("---------------------------------------------");
    }
}
