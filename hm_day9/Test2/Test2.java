package hm_day9.Test2;

public class Test2 {
    public static void main(String[] args) {
        //多态  父类 变量名 = new 子类（）;
        Animal c = new Cat("🐱", "10.0kg");
        Animal d = new Dog("🐕", "10.0kg");
        d.eat();
        c.eat();
        if (d instanceof Dog){
            Dog d1 = (Dog)d;
            d1.lookHome();
        }
        if (c instanceof Cat){
            Cat c1 = (Cat) c;
            c1.catchMouse();
        }
    }

}
