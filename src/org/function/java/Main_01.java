package org.function.java;
import java.util.*;

/**
 * 主函数，调用各类函数。
 * @author shengchuan
 *@version 1.0
 */

public class Main_01 
{
	public static void main(String[] args) 
	{
		Scanner num1=new Scanner(System.in);
		System.out.print("输入一个数字：");
		int a=num1.nextInt();
		
		//调用乘法列表
		ArrayTool.timeTable(a);
		
		int[] arr1={12,5,89,34,75,98,62,13,27,69};
		//选择排序输出
		ArrayTool.selectSort(arr1);
		//冒泡排序输出
		ArrayTool.buBbleSort(arr1);
		
		int[] arr2={1,14,23,45,48,65,74,78,120,136,158,196};
		//二分法查找
		int index=ArrayTool.halfSearch(arr2,78);
		System.out.println(index);
		
		System.out.print("输入一个数字：");
		int b=num1.nextInt();
		//十进制转换为十六进制
		ArrayTool.toH(b);
		num1.close();
		
	}

}
