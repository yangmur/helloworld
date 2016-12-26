package jstty.test.com;

import java.util.ArrayList;

/**
 * ArrayListʹ�� :
 * ˵�������ΰ���������ArrayList���������
 * �÷�����a��ӵ�list�У�list.add("a");
 * �������£�
 */

public class ArrayListTest {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		//�����������
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println("˳����ӣ�"+list);
		
		/**
		 * ����2���ڵ�N�����ݺ������һ������
		 * �÷����ڵ�һ��Ԫ�غ�������ַ�"E"��list.add(1,"E");
		 * ע�⣺Arraylist�б������㹻�����ݣ�����ArrayList��û���κ����ݣ����ʱ��ʹ��ArrayList.add(1,"E");�ͻ����java.lang.IndexOutOfBoundsException�쳣
		 */
		//�ڵ�һ��Ԫ�غ�������Ԫ��"E"
		list.add(1,"E");
		System.out.println("�ڵ�һ��Ԫ�غ����E: "+list);
		//�ڵ�����Ԫ�غ����"F"
		list.add(3,"F");
		System.out.println("�ڵ�����Ԫ�غ����F��"+list);
		
		/**
		 * ����3����һ��ArrayList������������ӵ�����һ��ArrayList�� 
		 * �÷�����list2��ȫ��������ӵ�list1�У�list1.addAll(list2)��
		 */
		ArrayList<String> list2 = new ArrayList<String>();
		//������list2���������d,e,f
		list2.add("d");
		list2.add("e");
		list2.add("f");
		System.out.println("˳�����list2��" + list2);
		//��list2ȫ����ӵ�list��
		list.addAll(list2);
		System.out.println("��list2��ӵ�list�У�"+list);
	}
}



