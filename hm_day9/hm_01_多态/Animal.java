package hm_day9.hm_01_多态;

public class Animal {
    public void eat(){
        System.out.println("动物在吃");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("🐕吃骨头");
    }
    public void lookHome(){
        System.out.println("🐕看家");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("🐱吃🐟");
    }
    public void catchMouse(){
        System.out.println("🐱抓🐀");
    }
}
