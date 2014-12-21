package com.test.sort.selection;


public class SelectSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("简单选择排序排序功能实现》》》》");
		int[] arr = { 23, 54, 6, 2, 65, 34, 2, 67, 7, 9, 43 };

		SelectSort sort = new SelectSort();
		System.out.println("排序之前序列：");
		sort.printArr(arr);
		sort.selectSort(arr, 0, arr.length - 1);
		System.out.println("排序之后序列：");
		;
		sort.printArr(arr);
	}

	public void selectSort(int[] r, int low, int high) {
		for (int k = low; k < high - 1; k++) { // 作n-1趟选取
			int min = k;
			for (int i = min + 1; i <= high; i++)
				// 选择关键字最小的元素
				if (compare(r[i], r[min]))
					min = i;
			if (k != min) {
				int temp = r[k]; // 关键字最小的元素与元素r[k]交换
				r[k] = r[min];
				r[min] = temp;
			}// end of if
		}// end of for(int k=0…

	}// end of selectSort

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
