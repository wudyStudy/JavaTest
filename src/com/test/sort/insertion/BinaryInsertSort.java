package com.test.sort.insertion;

public class BinaryInsertSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�۰��������������ʵ�֡�������");
		int[] arr = { 23, 54, 6, 2, 65, 34, 2, 67, 7, 9, 43 };

		BinaryInsertSort sort = new BinaryInsertSort();
		System.out.println("����֮ǰ���У�");
		sort.printArr(arr);
		sort.binInsertSort(arr, 0, arr.length - 1);
		System.out.println("����֮�����У�");;
		sort.printArr(arr);
	}

	public void binInsertSort(int[] r, int low, int high) {

		for (int i = low + 1; i <= high; i++) {
			int temp = r[i]; // ���������Ԫ��
			int hi = i - 1;
			int lo = low; // ���ó�ʼ����
			while (lo <= hi) { // �۰�ȷ������λ��
				int mid = (lo + hi) / 2;
				if (compare(temp, r[mid]))
					hi = mid - 1;
				else
					lo = mid + 1;
			}
			for (int j = i - 1; j > hi; j--)
				r[j + 1] = r[j]; // �ƶ�Ԫ��
			r[hi + 1] = temp; // ����Ԫ��
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
