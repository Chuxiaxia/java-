package hm_day1;

public class Demo04Variable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// ★定义字节型变量(取值范围-128~127) 占用字节数：1
		byte a = 100;
		System.out.println(a);

		// 定义短整型变量(取值范围-32768~32767) 占用字节数：2
		Short b = 200;
		System.out.println(b);

		// 定义整型变量(取值范围-2147483648~2147483647) 占用字节数：4
		int c = 300;
		System.out.println(c);

		// 定义长整型变量(取值范围-2的63次方~2的63次方-1) 占用字节数：8
		long d = 400L;
		long e = 500l;
		System.out.println(d);
		System.out.println(e);
		// 注意：long类型：随便写一个整数，默认是int类型的，如果希望随便写一个整数默认是long型的必须在数 据后加L或者l表示。

		// 定义单精度浮点型变量(取值范围-3.4028E38~3.4028E38) 占用字节数：4
		float f = 3.4f;
		float g = -3.4F;
		System.out.println(f);
		System.out.println(g);
		// 注意：ﬂoat类型：随便写一个小数，默认是double类型的，如果希望这个小数是ﬂoat类型的，必须在数据 后加F或者f表示。

		// 定义双精度浮点型变量(取值范围-1.7977E308~1.7977E308) 占用字节数：8
		double h = 1.7;
		System.out.println(h);

		// 定义布尔型变量(true,false) 占用字节数：1
		boolean i = true;
		boolean j = false;
		System.out.println(i);
		System.out.println(j);

		// 定义字符型变量(取值范围 0-65535) 占用字节数：2
		char k = 'a';
		System.out.println(k);
	}

}
