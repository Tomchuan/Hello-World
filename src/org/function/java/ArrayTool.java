package org.function.java;
/**
 * ����һ��ӵ�в��ң����򣬽���ת�����ܵĺ�����
 * @author shengchuan
 *@version 1_1.0
 */

public class ArrayTool
{
	/**
	 * ��ȡһ���˷��б�
	 * @param t ����һ��int�͵�����
	 */
	 public static  void timeTable(int t)
	 {
		for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"*"+i+"="+(i*j));
					System.out.print("\t");//�ո�
			}
			System.out.println();//����
		}
	 }
	 
	 /**
	  * ѡ����������һ�����飬���һ����С�����ź��������
	  * @param arr �������һ���������顣
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
		//��ӡ����
		 for (int i=0;i<arr.length;i++)
		 {
			 if(i==0)
			 {
				 System.out.print("�����������ǣ�[");
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
	  * ð����������һ�����飬���һ����С�����ź�������顣
	  * @param arr �������һ���������顣
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
		 //��ӡ����
		 for (int i=0;i<arr.length;i++)
		 {
			 if(i==0)
			 {
				 System.out.print("�����������ǣ�[");
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
	  * ����һ��������������ж��ַ����ҵĺ���������һ�����Ƿ��������С�
	  * @param arr ����һ���������������
	  * @param key ����һ�����ͱ�����
	  * @return �������������з����ڸ������е�λ�ã����򷵻�-1.
	  */
	 	public static int halfSearch(int[] arr,int key)
	 	{
	 		int max, min, mid;
	 		min=0;
	 		max=arr.length-1;
	 		while(min<=max)    //������ںź���Ҫ
	 		{
	 			mid=(max+min)/2;   //���ߣ�max+min)>>1;
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
	 	 * ����һ��ʮ������ת��Ϊʮ���������ĺ���
	 	 * @param num ����һ�����͵����ͱ�����
	 	 */
	 	public static void toH(int num)
	 	{
	 		//����һ����Ӧ��ϵ��
	 		char[] ch={'0','1','2','3',
	 		           '4','5','6','7',
	 		           '8','9','A','B',
	 		           'C','D','E','F'};
	 		//����һ�����飬��ʱ����
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
