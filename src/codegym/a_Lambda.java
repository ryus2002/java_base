package codegym;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class a_Lambda {

	public static void main(String[] args) {

		// Lambda使用方式
		Comparator<Integer> com = (x, y) -> x+y;
		int result = com.compare(5, 2);
		System.out.print(result);
		
		// Lambda搭配forEach使用
//		List<String> list = new ArrayList<String>();
//		list.add("test1");
//		list.add("test2");
//		list.add("test3");
//		list.forEach(name -> System.out.println(name));
		
		// 使用靜態方法來定義函式介面實作
//		Comparator<Integer> com = Math::subtractExact;
//		int result = com.compare(5, 2);
//		System.out.println(result);

	}

}
