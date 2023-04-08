package com.cwl.arrays;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int a[] = { 8, 2, 4, 9, 8, 0, 2, 5, 3, 6 };
		System.out.println(containsDuplicate(a)?"duplicate available":"distinct available");
	}

	public static boolean containsDuplicate(int a[]) {
		
		for (int i = 0,count=0;i < a.length; i++,count=0) {
			for (int j = 0; j < a.length; j++) {
              if(a[i]==a[j])count++;
			}
			if(count>1)return true;
		}
		return false;
	}

}
