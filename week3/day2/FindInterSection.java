package week3.day2;


import java.util.List;
import java.util.ArrayList;

public class FindInterSection {

	public static void main(String[] args) {
		   int[] arr1 = new int[]{3,2,11,4,6,7};
		   int[] arr2 = new int[]{1,2,8,4,9,7};
		   getIntersection(arr1, arr2);
		}

		public static Object[] getIntersection(int[] arr1, int[] arr2) {
		   List<Integer> list = new ArrayList<Integer>();
		   
		   for (int i = 0; i < arr1.length; i++) {
		       for (int j = 0; j < arr2.length; j++) {
		           if (arr1[i] == arr2[j]) {
		               list.add(arr1[i]);
		           }
		       }
		   }
		   return list.toArray();
		}

}
