package hm_day4;
/*
    编写步骤：
        1. 定义getPerimeter方法用于计算矩形的周长,参数为(int length, int width),返回值为int类型
        2. 在getPerimeter方法中,使用公式: (length + width) * 2 计算矩形周长
        3. 返回计算出的周长
        4. 定义getArea方法用于计算矩形的面积,参数为(int length, int width),返回值为int类型
        5. 在getArea方法中,使用公式: length * width 计算矩形面积
        6. 返回计算出的面积
        7. 在main方法中定义2个int类型变量,length=20,width=8
        8. 在main方法中调用getPerimeter方法,传入参数length和width,并使用变量zc保存getPerimeter方法的返回值
        9. 在main方法中输出zc变量的值
        10. 在main方法中调用getArea方法,传入参数length和width,并使用变量area保存getArea方法的返回值
        11. 在main方法中输出area变量的值
 */
public class day4Test3 {
    public static void main(String[] args) {

        int zc = getPerimeter(20,8);
        int area = getArea(20,8);
        System.out.println("长方形周长：" + zc + "\n长方形面积：" + area);
    }
    public static int getPerimeter(int length, int width){
       int C = (length + width) * 2;
       return C;
    }
    public static int getArea(int length, int width){
        int S = length * width;
        return S;
    }
}
