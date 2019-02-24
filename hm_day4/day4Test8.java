package hm_day4;

 //华氏度 = (9.0/5) * 摄氏度 + 32
public class day4Test8 {
     public static void main(String[] args) {
         double h = h(30.0);
         System.out.print("---" + "华氏度为：" + h + "°\n");

         double s = s(86.0);
         System.out.print("---" + "摄氏度为：" + s + "°\n");
     }

     public static double h(double s){
         double h = (9.0/5) * s + 32;
         System.out.print("摄氏度为：" + s + "°");
         return h;
     }

     public static double s(double h){
         double s= (h - 32)/ (9.0/5);
         System.out.print("华氏度为：" + h + "°");
         return s;
     }
}
