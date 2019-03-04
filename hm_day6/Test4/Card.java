package hm_day6.Test4;
/*
    属性：
           花色
           点数
    构造器：
        有参构造器
    成员方法：
        showCard方法：打印牌面信息
 */
public class Card {
    public String hs;
    public String ds;

    public Card(String hs1, String ds1){
        hs = hs1;
        ds = ds1;
    }
    public void showCard(){
        System.out.println(hs + ds);
    }

}
