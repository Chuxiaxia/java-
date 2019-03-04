package hm_day9.hm_04_instanceof关键字;
/*
目标:能够使用instanceof关键字

讲解:
    instanceof关键字作用: 用于判断一个变量是否属于某种类型(属于某各类)
    instanceof关键字格式: 变量名 instanceof 类型(类名)
                        如果变量是右边的这种类型,返回true
                        如果变量不是右边的这种类型,返回false

    instanceof使用场景: 在向下转型前做类型判断
    instanceof注意事项: 如果没有继承关系不能判断的

小结:
    强制转换可能会失败,只有对象 new 的时候是什么类型才能转成什么类型
    instanceof关键字作用: 用于判断一个变量是否属于某种类型(属于某各类)
    instanceof注意事项: 如果没有继承关系不能instanceof判断的
 */
public class Demo {
    public static void main(String[] args) {
        Person p = new Student();

        // 向下转型:由父类转成子类
        // 子类 变量名 = (子类)父类变量;
        // 只有对象 new 的时候是什么类型才能转成什么类型
        if (p instanceof Student){
            Student s = (Student) p;
            s.eat();
            s.study();
        }else {
            System.out.println("p不是学生");
        }

    }
}
