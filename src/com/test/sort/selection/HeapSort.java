package com.test.sort.selection;


public class HeapSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("堆排序排序功能实现》》》》");
		int[] arr = {10, 54, 6, 2, 65, 34, 2, 67, 7, 9, 43 };

		HeapSort sort = new HeapSort();
		System.out.println("排序之前序列：");
		sort.printArr(arr);
		sort.heapSort(arr);
		System.out.println("排序之后序列：");
		sort.printArr(arr);
	}

	public void heapSort(int[] r) {
		int n = r.length - 1;
		for (int i = n / 2; i >= 1; i--)
			// 初始化建堆
			heapAdjust(r, i, n);
		for (int i = n; i > 1; i--) { // 不断输出堆顶元素并调整r[1..i-1]为新堆
			int temp = r[1]; // 交换堆顶与堆底元素
			r[1] = r[i];
			r[i] = temp;
			heapAdjust(r, 1, i - 1); // 调整
		}
	}

	// 已知r[low..high]中除r[low]之外，其余元素均满足堆的定义
	private void heapAdjust(int[] r, int low, int high) {
		int temp = r[low];
		for (int j = 2 * low; j <= high; j = j * 2) { // 沿关键之较大的元素向下进行筛选

			// j指向关键之较大的元素
			if (j < high && compare(r[j], r[j + 1]))
				j++;
			// 若temp比其孩子都大，则插入到low所指位置
			if (!compare(temp, r[j]))
				break;
			r[low] = r[j];
			low = j; // 向下筛选
		}
		r[low] = temp;
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
