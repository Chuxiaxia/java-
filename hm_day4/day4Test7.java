package hm_day4;

public class day4Test7 {
    public static void main(String[] args) {
        System.out.println(10.1 + "-->" + getNum(10.1));
        System.out.println(10.4 + "-->" + getNum(10.4));
        System.out.println(10.5 + "-->" + getNum(10.5));
        System.out.println(10.9 + "-->" + getNum(10.9));
    }
    public static int getNum(double n){
        int d = (int)(n + 0.5);
        return d;
    }
}
