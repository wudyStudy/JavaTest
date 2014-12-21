package com.test.sort.exchange;

public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("快速排序排序功能实现》》》》");
		int[] arr = { 23, 54, 6, 2, 65, 34, 2, 67, 7, 9, 43 };

		QuickSort sort = new QuickSort();
		System.out.println("排序之前序列：");
		sort.printArr(arr);
		sort.quickSort(arr, 0, arr.length - 1);
		System.out.println("排序之后序列：");;
		sort.printArr(arr);
	}

	public void quickSort(int[] r, int low, int high) {
		if (low < high) {
			int pa = partition(r, low, high);
			quickSort(r, low, pa - 1);
			quickSort(r, pa + 1, high);
		}
	}

	private int partition(int[] r, int low, int high) {
		int pivot = r[low]; // 使用r[low]作为枢轴元素
		while (low < high) { // 从两端交替向内扫描
			while (low < high && !compare(r[high], pivot))
				high--;
			r[low] = r[high]; // 将比pivot小的元素移向低端
			while (low < high && compare(r[low], pivot))
				low++;
			r[high] = r[low]; // 将比pivot大的元素移向高端

		}
		r[low] = pivot; // 设置枢轴
		return low; // 返回枢轴元素位置
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
