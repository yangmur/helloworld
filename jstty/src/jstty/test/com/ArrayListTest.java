package jstty.test.com;

import java.util.ArrayList;

/**
 * ArrayList使用 :
 * 说明：依次按照书序向ArrayList中添加数据
 * 用法：将a添加到list中，list.add("a");
 * 例子如下：
 */

public class ArrayListTest {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		//依次添加数据
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println("顺序添加："+list);
		
		/**
		 * 方法2：在第N个数据后面添加一个数据
		 * 用法：在第一个元素后面添加字符"E"，list.add(1,"E");
		 * 注意：Arraylist中必须有足够的数据，例如ArrayList中没有任何数据，这个时候使用ArrayList.add(1,"E");就会出现java.lang.IndexOutOfBoundsException异常
		 */
		//在第一个元素后面增加元素"E"
		list.add(1,"E");
		System.out.println("在第一个元素后面加E: "+list);
		//在第三个元素后面加"F"
		list.add(3,"F");
		System.out.println("在第三个元素后面加F："+list);
		
		/**
		 * 方法3：将一个ArrayList中所有数据添加到另外一个ArrayList中 
		 * 用法：将list2中全部数据添加到list1中，list1.addAll(list2)；
		 */
		ArrayList<String> list2 = new ArrayList<String>();
		//依次在list2中添加数据d,e,f
		list2.add("d");
		list2.add("e");
		list2.add("f");
		System.out.println("顺序添加list2：" + list2);
		//将list2全部添加到list中
		list.addAll(list2);
		System.out.println("将list2添加到list中："+list);
	}
}



