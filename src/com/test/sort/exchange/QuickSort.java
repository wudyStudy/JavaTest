package com.test.sort.exchange;

public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("��������������ʵ�֡�������");
		int[] arr = { 23, 54, 6, 2, 65, 34, 2, 67, 7, 9, 43 };

		QuickSort sort = new QuickSort();
		System.out.println("����֮ǰ���У�");
		sort.printArr(arr);
		sort.quickSort(arr, 0, arr.length - 1);
		System.out.println("����֮�����У�");;
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
		int pivot = r[low]; // ʹ��r[low]��Ϊ����Ԫ��
		while (low < high) { // �����˽�������ɨ��
			while (low < high && !compare(r[high], pivot))
				high--;
			r[low] = r[high]; // ����pivotС��Ԫ������Ͷ�
			while (low < high && compare(r[low], pivot))
				low++;
			r[high] = r[low]; // ����pivot���Ԫ������߶�

		}
		r[low] = pivot; // ��������
		return low; // ��������Ԫ��λ��
	}

	public boolean compare(int paramA, int paramB) {
		if (paramA < paramB) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * ���δ�ӡ������Ԫ��
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
