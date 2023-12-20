package leetcode;

public class MedianOfTwoSortedArray {

	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {	    
	     int i=0;
	     int j=0;
	     int k=0;
	     int arr[]=new int[nums1.length+nums2.length];
	     while(i<nums1.length&&j<nums2.length) {
	    	 if(nums1[i]<nums2[j]) {
	    		 arr[k]=nums1[i];
	    		 i++;
	    		 k++;
	    	 }
	    	 else {
	    		 arr[k]=nums2[j];
	    		 k++;
	    		 j++;
	    	 }
	     }
	     while(i<nums1.length) {
	    	 arr[k]=nums1[i];
	    	 i++;
	    	 k++;
	     }
	     while(j<nums2.length) {
	    	 arr[k]=nums2[j];
	    	 j++;
	    	 k++;
	     }
	      int temp=arr.length;
	      if(arr.length==1) {
	    	  return (double)(arr[0]);
	      }
	      
	      else if(temp%2==1) {
	    	  return (double)(arr[temp/2]);
	      }
	      else {
	    	  return ((double)arr[temp/2]+(double)(arr[(temp-1)/2]))/2.0;
	      }
	    }
	
	public static void main(String[] args) {
		int[] n1= {};
		int[] n2= {1,2,3,4,5,6};
		double ans=findMedianSortedArrays(n1,n2);
		System.out.println(ans);

	}

}
