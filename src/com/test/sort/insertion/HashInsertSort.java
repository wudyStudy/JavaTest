package com.test.sort.insertion;

public class HashInsertSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("希尔排序功能实现》》》》");
		
		int[] arr = { 23, 54, 6, 2, 65, 34, 2, 67, 7, 9, 43 };
		int[] delta = {5,3,1};

		HashInsertSort sort = new HashInsertSort();
		System.out.println("排序之前序列：");
		sort.printArr(arr);
		sort.shellSort(arr, 0, arr.length - 1,delta);
		System.out.println("排序之后序列：");
		sort.printArr(arr);
	}

	public void shellSort(int[] r, int low, int high, int[] delta) {
		for (int k = 0; k < delta.length; k++)
			shellInsert(r, low, high, delta[k]); // 一趟步长为delta[k]的直接插入排序
	}

	private void shellInsert(int[] r, int low, int high, int deltaK) {
		for (int i = low + deltaK; i <= high; i++)
			if (compare(r[i], r[i - deltaK])) { // 小于时，需将r[i] 插入有序表
				int temp = r[i];
				int j = i - deltaK;
				for (; j >= low && compare(temp, r[j]); j = j - deltaK)
					r[j + deltaK] = r[j]; // 记录后移 [j];
				r[j + deltaK] = temp; // 插入到正确位置
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
