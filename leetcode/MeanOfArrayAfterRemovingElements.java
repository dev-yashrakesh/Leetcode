package leetcode;

public class MeanOfArrayAfterRemovingElements {

	 public static double trimMean(int[] arr) {
	        double l=arr.length*(0.05);
	        mergeSort(arr,0,arr.length-1);
	        int j=0;
	        double sum=0;
	        for(int i=(int)l;i<arr.length-l;i++) {
	        	sum=sum+arr[i];
	        	j++;
	        }
	        double len=arr.length-2*l;
	        sum=sum/len;
	        return sum;
	    }
	
	 public static void mergeSort(int arr[],int l,int r) {
		 if(l<r) {
			 int m=l+(r-l)/2;
			 mergeSort(arr,l,m);
			 mergeSort(arr,m+1,r);
			 
			 merge(arr,l,r,m);
		 }
	 }
	 
	 public static void merge(int arr[],int l,int r,int m) {
		 int n1=m-l+1;
		 int n2=r-m;
		
		 int[] L=new int[n1];
		 for(int i=0;i<n1;i++) {
			 L[i]=arr[l+i];
		 }
		 int[] R=new int[n2];
		 for(int j=0;j<n2;j++) {
			 R[j]=arr[m+1+j];
		 }
		 
		 int i=0,j=0,k=l;
		 while(i<n1&&j<n2) {
			 if(L[i]<R[j]) {
				 arr[k]=L[i];
				 i++;
				 k++;
			 }
			 else {
				 arr[k]=R[j];
				 j++;
				 k++;
			 }
		 }
		 
		 while(i<n1) {
			 arr[k]=L[i];
			 i++;
			 k++;
		 }
		 while(j<n2) {
			 arr[k]=R[j];
			 j++;
			 k++;
		 }
	 }
	 
	public static void main(String[] args) {
		int[] n1= {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
		System.out.println(trimMean(n1));

	}

}
