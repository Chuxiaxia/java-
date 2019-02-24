package hm_day4;

/*
    定义getChar方法，能够将数字，根据ASCII码表，转换为对应的字符并返回，只转换大小写字母和数字字 符
    编写步骤：
        1. 定义getChar方法,参数为(int num),返回值char类型
        2. 在getChar方法中,将传入的参数num转成char类型变量ch
        3. 在getChar方法中判断ch是否是小写字母.如果是返回ch
        4. 在getChar方法中判断ch是否是大写字母.如果是返回ch
        5. 在getChar方法中判断ch是否是数字字符.如果是返回ch
        6. 其他情况返回' '
        7. 在main方法中调用getChar方法,传入一个数字.使用aChar变量接收getChar方法的返回值
        8. 输出aChar变量
 */

public class day4Test4 {
    public static void main(String[] args) {

        char aChar =  getChar(100);
        System.out.println("转成的字符为："+aChar);
    }
    public static char getChar(int num){
        char ch = (char) num;
        if (ch > 'a' && ch < 'z'){
            return ch;
        }else if (ch > 'A' && ch < 'B'){
            return ch;
        }else if(ch > '0' && ch < '9'){
            return ch;
        }else {
            return ' ';
        }

    }
}
