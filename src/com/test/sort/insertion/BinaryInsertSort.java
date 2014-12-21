package com.test.sort.insertion;

public class BinaryInsertSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("折半插入排序排序功能实现》》》》");
		int[] arr = { 23, 54, 6, 2, 65, 34, 2, 67, 7, 9, 43 };

		BinaryInsertSort sort = new BinaryInsertSort();
		System.out.println("排序之前序列：");
		sort.printArr(arr);
		sort.binInsertSort(arr, 0, arr.length - 1);
		System.out.println("排序之后序列：");;
		sort.printArr(arr);
	}

	public void binInsertSort(int[] r, int low, int high) {

		for (int i = low + 1; i <= high; i++) {
			int temp = r[i]; // 保存待插入元素
			int hi = i - 1;
			int lo = low; // 设置初始区间
			while (lo <= hi) { // 折半确定插入位置
				int mid = (lo + hi) / 2;
				if (compare(temp, r[mid]))
					hi = mid - 1;
				else
					lo = mid + 1;
			}
			for (int j = i - 1; j > hi; j--)
				r[j + 1] = r[j]; // 移动元素
			r[hi + 1] = temp; // 插入元素
		}// for
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
