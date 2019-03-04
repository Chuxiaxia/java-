package hm_day6.hm_05_手机类练习;

public class Iphone {
    public String name;
    public double price;
    public String color;

    public void call(String name){
        System.out.println("给" + name + "打电话");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }
}
