package org.function.java;
import java.util.*;

/**
 * �����������ø��ຯ����
 * @author shengchuan
 *@version 1.0
 */

public class Main_01 
{
	public static void main(String[] args) 
	{
		Scanner num1=new Scanner(System.in);
		System.out.print("����һ�����֣�");
		int a=num1.nextInt();
		
		//���ó˷��б�
		ArrayTool.timeTable(a);
		
		int[] arr1={12,5,89,34,75,98,62,13,27,69};
		//ѡ���������
		ArrayTool.selectSort(arr1);
		//ð���������
		ArrayTool.buBbleSort(arr1);
		
		int[] arr2={1,14,23,45,48,65,74,78,120,136,158,196};
		//���ַ�����
		int index=ArrayTool.halfSearch(arr2,78);
		System.out.println(index);
		
		System.out.print("����һ�����֣�");
		int b=num1.nextInt();
		//ʮ����ת��Ϊʮ������
		ArrayTool.toH(b);
		num1.close();
		
	}

}
