package leetcode;

public class ContainDuplicate {

public static boolean containsDuplicate(int[] nums) {
        mergesort(nums,0,nums.length-1);
        for(int i=0;i<nums.length-1;i++) {
        	if(nums[i]==nums[i+1]) {
        		return true;
        	}
        }
        return false;
    }
	
public static void mergesort(int[] arr,int l,int r) {
	if(l<r) {
		int mid=l+(r-l)/2;
		mergesort(arr,l,mid);
		mergesort(arr,mid+1,r);
		merge(arr,l,r,mid);
	}
}

public static void merge(int[] arr,int l,int r,int m) {
	int n1=m-l+1;
	int n2=r-m;
	
	int[] L=new int[n1];
	int[] R=new int[n2];
	
	for(int i=0;i<n1;i++) {
		L[i]=arr[l+i];
	}
	
	for(int j=0;j<n2;j++) {
		R[j]=arr[m+1+j];
	}
	
	int i=0,j=0,k=l;
	
	while(i<n1&&j<n2) {
		if(L[i]<=R[j]) {
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
		k++;
		i++;
	}
	
	while(j<n2) {
		arr[k]=R[j];
		j++;
		k++;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
