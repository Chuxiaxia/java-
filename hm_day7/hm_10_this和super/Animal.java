package hm_day7.hm_10_this和super;

public class Animal {
    int num1 = 10;
    public void eat(){
        System.out.println("动物在吃...");
    }
    public Animal(){

    }
    public Animal(String s){

    }
}

class Cat extends Animal{
    int num1 = 200;
    public void eat(){
        System.out.println("喵喵喵~");
    }

    public Cat() {
        this("喵~");
        System.out.println("喵喵喵喵");
    }

    public Cat(String s) {
        System.out.println("喵喵喵喵");
    }
    public void test(){
        System.out.println(num1);
        System.out.println(this.num1);
        System.out.println(super.num1);

        eat();
        this.eat();
        super.eat();
    }
}
