package com.test.sort.selection;


public class HeapSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("������������ʵ�֡�������");
		int[] arr = {10, 54, 6, 2, 65, 34, 2, 67, 7, 9, 43 };

		HeapSort sort = new HeapSort();
		System.out.println("����֮ǰ���У�");
		sort.printArr(arr);
		sort.heapSort(arr);
		System.out.println("����֮�����У�");
		sort.printArr(arr);
	}

	public void heapSort(int[] r) {
		int n = r.length - 1;
		for (int i = n / 2; i >= 1; i--)
			// ��ʼ������
			heapAdjust(r, i, n);
		for (int i = n; i > 1; i--) { // ��������Ѷ�Ԫ�ز�����r[1..i-1]Ϊ�¶�
			int temp = r[1]; // �����Ѷ���ѵ�Ԫ��
			r[1] = r[i];
			r[i] = temp;
			heapAdjust(r, 1, i - 1); // ����
		}
	}

	// ��֪r[low..high]�г�r[low]֮�⣬����Ԫ�ؾ�����ѵĶ���
	private void heapAdjust(int[] r, int low, int high) {
		int temp = r[low];
		for (int j = 2 * low; j <= high; j = j * 2) { // �عؼ�֮�ϴ��Ԫ�����½���ɸѡ

			// jָ��ؼ�֮�ϴ��Ԫ��
			if (j < high && compare(r[j], r[j + 1]))
				j++;
			// ��temp���亢�Ӷ�������뵽low��ָλ��
			if (!compare(temp, r[j]))
				break;
			r[low] = r[j];
			low = j; // ����ɸѡ
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
