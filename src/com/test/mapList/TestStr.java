package com.test.mapList; 

public class TestStr {
	
	public static void main(String []args){
		String str = "(1)Head(2)<NEW><REF>OD_M_G_SWITCHDATA(1)Records(2)SvcCont[](3)<NEW><NEST>OD_M_G_SWITCHDATA";
		String []strArr = str.split("\\(" + 1 + "\\)");
		System.out.println(strArr.length);
		for(int i=0;i<strArr.length;i++){
			System.out.println("strArr["+i+"]==="+strArr[i]);
		}
		System.out.println("CESHI");
		System.out.println(str.subSequence(0, str.indexOf('H')));
		
	}

}
