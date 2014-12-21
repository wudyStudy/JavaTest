package com.test.sort.insertion;

public class StraightInsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ֱ�Ӳ�������������ʵ�֡�������");
		int[] arr = { 23, 54, 6, 2, 65, 34, 2, 67, 7, 9, 43 };

		StraightInsertionSort sort = new StraightInsertionSort();
		System.out.println("����֮ǰ���У�");
		sort.printArr(arr);
		sort.insertSort(arr, 0, arr.length - 1);
		System.out.println("����֮�����У�");
		sort.printArr(arr);
	}

	public void insertSort(int[] r, int low, int high) {
		for (int i = low + 1; i <= high; i++)
			if (compare(r[i], r[i - 1])) { // С��ʱ���轫r[i]���������
				int temp = r[i];
				r[i] = r[i - 1];
				int j = i - 2;
				for (; j >= low && compare(temp, r[j]); j--)
					r[j + 1] = r[j]; // ��¼����
				r[j + 1] = temp; // ���뵽��ȷλ��
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
