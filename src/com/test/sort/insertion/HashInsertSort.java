package com.test.sort.insertion;

public class HashInsertSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ϣ��������ʵ�֡�������");
		
		int[] arr = { 23, 54, 6, 2, 65, 34, 2, 67, 7, 9, 43 };
		int[] delta = {5,3,1};

		HashInsertSort sort = new HashInsertSort();
		System.out.println("����֮ǰ���У�");
		sort.printArr(arr);
		sort.shellSort(arr, 0, arr.length - 1,delta);
		System.out.println("����֮�����У�");
		sort.printArr(arr);
	}

	public void shellSort(int[] r, int low, int high, int[] delta) {
		for (int k = 0; k < delta.length; k++)
			shellInsert(r, low, high, delta[k]); // һ�˲���Ϊdelta[k]��ֱ�Ӳ�������
	}

	private void shellInsert(int[] r, int low, int high, int deltaK) {
		for (int i = low + deltaK; i <= high; i++)
			if (compare(r[i], r[i - deltaK])) { // С��ʱ���轫r[i] ���������
				int temp = r[i];
				int j = i - deltaK;
				for (; j >= low && compare(temp, r[j]); j = j - deltaK)
					r[j + deltaK] = r[j]; // ��¼���� [j];
				r[j + deltaK] = temp; // ���뵽��ȷλ��
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
