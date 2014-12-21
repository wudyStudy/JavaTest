package com.test.sort.exchange;


public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("冒泡排序排序功能实现》》》》");
		int[] arr = { 23, 54, 6, 2, 65, 34, 2, 67, 7, 9, 43 };

		BubbleSort sort = new BubbleSort();
		System.out.println("排序之前序列：");
		sort.printArr(arr);
		sort.bubbleSort(arr, 0, arr.length - 1);
		System.out.println("排序之后序列：");;
		sort.printArr(arr);
	}

	public void bubbleSort(int[] r, int low, int high) {
		int n = high - low + 1;
		for (int i = 1; i < n; i++)
			for (int j = low; j <= high - i; j++)
				if (!compare(r[j], r[j + 1])) {
					int temp = r[j];
					r[j] = r[j + 1];
					r[j + 1] = temp;
				}

	}// end of bubbleSort

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
