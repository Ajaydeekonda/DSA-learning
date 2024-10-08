import java.util.Arrays;

public class mergeTwoSorted {
    public static int [] arr;
        public static void main(String[] args) {

        int []arr1 ={4,5,6};
        int [] arr2 = {1,2,7};
        System.out.println(Arrays.toString(merge(arr1, arr2, arr)));


    }
    

    static int [] merge(int [] arr1, int [] arr2,int [] arr)
    {
        int n1 = arr1.length, n2 = arr2.length;
        int e = n1 + n2 - 1;
        arr = new int[e+1];
        int i =0,j=0;
        int k=0;
        while (i < n1 && j < n2) { 
			if (arr1[i] <= arr2[j]) { 
				arr[k] = arr1[i]; 
				i++; 
			} 
			else { 
				arr[k] = arr2[j]; 
				j++; 
			} 
			k++; 
		} 

		// Copy remaining elements of L[] if any 
		while (i < n1) { 
			arr[k] = arr1[i]; 
			i++; 
			k++; 
		} 

		// Copy remaining earr1ements of R[] if any 
		while (j < n2) { 
			arr[k] = arr2[j]; 
			j++; 
			k++; 
		} 

        return arr;
	} 

    
}
