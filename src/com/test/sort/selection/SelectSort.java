package com.test.sort.selection;


public class SelectSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ѡ������������ʵ�֡�������");
		int[] arr = { 23, 54, 6, 2, 65, 34, 2, 67, 7, 9, 43 };

		SelectSort sort = new SelectSort();
		System.out.println("����֮ǰ���У�");
		sort.printArr(arr);
		sort.selectSort(arr, 0, arr.length - 1);
		System.out.println("����֮�����У�");
		;
		sort.printArr(arr);
	}

	public void selectSort(int[] r, int low, int high) {
		for (int k = low; k < high - 1; k++) { // ��n-1��ѡȡ
			int min = k;
			for (int i = min + 1; i <= high; i++)
				// ѡ��ؼ�����С��Ԫ��
				if (compare(r[i], r[min]))
					min = i;
			if (k != min) {
				int temp = r[k]; // �ؼ�����С��Ԫ����Ԫ��r[k]����
				r[k] = r[min];
				r[min] = temp;
			}// end of if
		}// end of for(int k=0��

	}// end of selectSort

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
