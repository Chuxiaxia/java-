package hm_day1;

public class Demo04Variable2 {

	public static void main(String[] args) {

		// 定义字节型变量(取值范围-128~127)
		byte b = 100;
		System.out.println(b);
		// 定义短整型变量(取值范围-32768~32767)
		short s = 200;
		System.out.println(s);
		// 定义整型变量(取值范围-2147483648~2147483647)
		int i = 300;
		System.out.println(i);
		// 定义长整型变量(取值范围-2的63次方~2的63次方-1)
		long l = 400000l;
		System.out.println(l);
		// 注意：long类型：随便写一个整数，默认是int类型的，如果希望随便写一个整数默认是long型的必须在数 据后加L或者l表示。

		// 定义单精度浮点型变量(取值范围-3.4028E38~3.4028E38)
		float f = 3.4f;
		System.out.println(f);
		// 注意：ﬂoat类型：随便写一个小数，默认是double类型的，如果希望这个小数是ﬂoat类型的，必须在数据 后加F或者f表示。

		// 定义双精度浮点型变量(取值范围-1.7977E308~1.7977E308)
		double d = -1.7;
		System.out.println(d);
		// 定义布尔型变量(true,false)
		boolean bool = true;
		System.out.println(bool);
		// 定义字符型变量(取值范围 0-65535)
		char c = 'a';
		System.out.println(c);
	}
}
