package com.test.sort.merge;


public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("归并排序排序功能实现》》》》");
		int[] arr = { 23, 54, 6, 2, 65, 34, 2, 67, 7, 9, 43 };

		MergeSort sort = new MergeSort();
		System.out.println("排序之前序列：");
		sort.printArr(arr);
		sort.mergeSort(arr, 0, arr.length - 1);
		System.out.println("排序之后序列：");;
		sort.printArr(arr);
	}

	private void merge(int[] a, int p, int q, int r) {
		int[] b = new int[r - p + 1];
		int s = p;
		int t = q + 1;
		int k = 0;
		while (s <= q && t <= r)
			if (compare(a[s], a[t]))
				b[k++] = a[s++];
			else

				b[k++] = a[t++];
		while (s <= q)
			b[k++] = a[s++];
		while (t <= r)
			b[k++] = a[t++];
		for (int i = 0; i < b.length; i++)
			a[p + i] = b[i];
	}

	public void mergeSort(int[] r, int low, int high) {
		if (low < high) {
			mergeSort(r, low, (high + low) / 2);
			mergeSort(r, (high + low) / 2 + 1, high);
			merge(r, low, (high + low) / 2, high);
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
