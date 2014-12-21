package com.test.sort.insertion;

public class StraightInsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("直接插入排序排序功能实现》》》》");
		int[] arr = { 23, 54, 6, 2, 65, 34, 2, 67, 7, 9, 43 };

		StraightInsertionSort sort = new StraightInsertionSort();
		System.out.println("排序之前序列：");
		sort.printArr(arr);
		sort.insertSort(arr, 0, arr.length - 1);
		System.out.println("排序之后序列：");
		sort.printArr(arr);
	}

	public void insertSort(int[] r, int low, int high) {
		for (int i = low + 1; i <= high; i++)
			if (compare(r[i], r[i - 1])) { // 小于时，需将r[i]插入有序表
				int temp = r[i];
				r[i] = r[i - 1];
				int j = i - 2;
				for (; j >= low && compare(temp, r[j]); j--)
					r[j + 1] = r[j]; // 记录后移
				r[j + 1] = temp; // 插入到正确位置
			}
	}

	public boolean compare(int paramA, int paramB) {
		if (paramA < paramB) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 依次打印出数组元素
	 */
	public void printArr(int[] arr) {
		if (arr != null) {
			for (int temp : arr) {
				System.out.print(temp + "   ");
			}
			System.out.println();
		}
	}
}
