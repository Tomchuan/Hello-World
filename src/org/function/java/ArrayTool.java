package org.function.java;
/**
 * 建立一个拥有查找，排序，进制转换功能的函数。
 * @author shengchuan
 *@version 1_1.0
 */

public class ArrayTool
{
	/**
	 * 获取一个乘法列表。
	 * @param t 接收一个int型的数。
	 */
	 public static  void timeTable(int t)
	 {
		for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"*"+i+"="+(i*j));
					System.out.print("\t");//空格
			}
			System.out.println();//换行
		}
	 }
	 
	 /**
	  * 选择排序，输入一个数组，输出一个从小到大排好序的数组
	  * @param arr 随机输入一个整型数组。
	  */
	 public static void selectSort(int[] arr)
	 {
		 for(int x=0;x<arr.length;x++)
		 {
			 for(int y=x+1;y<arr.length;y++)
				 if(arr[x]>arr[y])
				 {
					 int temp=arr[x];
					 arr[x]=arr[y];
					 arr[y]=temp;
				 }
		 }
		//打印数组
		 for (int i=0;i<arr.length;i++)
		 {
			 if(i==0)
			 {
				 System.out.print("排序后的数列是：[");
			 }
			 System.out.print(arr[i]+","); 
			 if(i==arr.length-1)
			 {
				 System.out.print("]");
			 }
		 }
		 System.out.println();
	 }
	 /**
	  * 冒泡排序，输入一个数组，输出一个从小到大排好序的数组。
	  * @param arr 随机输入一个整型数组。
	  */
	 public static void buBbleSort(int[] arr)
	 {
		 for(int x=arr.length-1;x>0;x--)
		 {
			 for(int y=0;y<x;y++)
				 if(arr[y]>arr[y+1])
				 {
					 int temp=arr[y];
					 arr[y]=arr[y+1];
					 arr[y+1]=temp;
				 }
		 }
		 //打印数组
		 for (int i=0;i<arr.length;i++)
		 {
			 if(i==0)
			 {
				 System.out.print("排序后的数列是：[");
			 }
			 System.out.print(arr[i]+","); 
			 if(i==arr.length-1)
			 {
				 System.out.print("]");
			 }
		 }
		 System.out.println();
	 }
	 /**
	  * 建立一个对有序数组进行二分法查找的函数，查找一个数是否在数组中。
	  * @param arr 输入一个整型数组变量。
	  * @param key 输入一个整型变量。
	  * @return 若该数在数组中返回在该数组中的位置，否则返回-1.
	  */
	 	public static int halfSearch(int[] arr,int key)
	 	{
	 		int max, min, mid;
	 		min=0;
	 		max=arr.length-1;
	 		while(min<=max)    //这个等于号很重要
	 		{
	 			mid=(max+min)/2;   //或者（max+min)>>1;
	 			if(key>arr[mid])
	 				min =mid+1;
	 			else if(key<arr[mid])
	 				max =mid-1;
	 			else 
	 				return mid;
	 		}
	 		return -1;
	 	}
	 	
	 	/**
	 	 * 建立一个十进制数转换为十六进制数的函数
	 	 * @param num 输入一个整型的整型变量。
	 	 */
	 	public static void toH(int num)
	 	{
	 		//定义一个对应关系表。
	 		char[] ch={'0','1','2','3',
	 		           '4','5','6','7',
	 		           '8','9','A','B',
	 		           'C','D','E','F'};
	 		//定义一个数组，临时容器
	 		char[] arr=new char[8];
	 		int pos=arr.length;
	 		
	 		while(num!=0)
	 		{
	 			int temp=num&15;
	 			arr[--pos]=ch[temp];
	 			num =num>>>4;
	 		}
	 		for(int x=pos;pos<arr.length;x++)
	 		{
	 			System.out.print(arr[x]);
	 		}
	 		
	 	}
}
