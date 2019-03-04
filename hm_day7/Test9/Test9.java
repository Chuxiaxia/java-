package hm_day7.Test9;

public class Test9 {
    public static void main(String[] args) {
        //book1
        Book book1 = new Book();
        book1.setNumber(0001);
        book1.setName("Xey");
        book1.setCoding("353091935");
        book1.setPrice(521.0);
        book1.setData("2004-4-24");
        //book2
        Book book2 = new Book();
        book2.setNumber(0002);
        book2.setName("JavaEE");
        book2.setCoding("1235465486");
        book2.setPrice(23.0);
        book2.setData("2015-5-2");
        //book3
        Book book3 = new Book();
        book3.setNumber(0003);
        book3.setName("JavaEE");
        book3.setCoding("387648797524");
        book3.setPrice(1111.0);
        book3.setData("2017-1-1");
        double max;
        if (book1.getPrice() > book2.getPrice()){
            if (book1.getPrice() > book3.getPrice()){
                System.out.println("最贵的书是：" + book1.getNumber() + "," + book1.getName() + "," + book1.getCoding() + "," + book1.getPrice() + "," + book1.getData());
            } else {
                System.out.println("最贵的书是：" + book3.getNumber() + "," + book3.getName() + "," + book3.getCoding() + "," + book3.getPrice() + "," + book3.getData());
            }
        }else {
            if (book2.getPrice() > book3.getPrice()){
                System.out.println("最贵的书是：" + book2.getNumber() + "," + book2.getName() + "," + book2.getCoding() + "," + book2.getPrice() + "," + book2.getData());
            } else {
                System.out.println("最贵的书是：" + book3.getNumber() + "," + book3.getName() + "," + book3.getCoding() + "," + book3.getPrice() + "," + book3.getData());
            }
        }



    }
}
