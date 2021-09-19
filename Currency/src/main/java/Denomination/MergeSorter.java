package Denomination;

public class MergeSorter {
    // partitioning the arrays
    public void sort(int []denomination, int left, int right){
      if (left<right){
            int mid =left +(right-left)/2;
            sort(denomination, left, mid);
            sort(denomination, mid+1, right);
            // calling the merge array to merge the elements
            mergeSort(denomination, left, mid, right);
            }
   }
   
    public void mergeSort(int[]denomination, int left, int mid, int right){
            int n1 = mid- left+1;  
            int [] L = new int[n1];
            int n2 = right-mid; 
            int []R= new int[n2];
            for(int i=0; i<n1; i++)
                    L[i]= denomination[left+i];
            for(int i=0; i<n2; i++)
                    R[i] = denomination[mid+1+i];
   
   
            int i=0, j=0;
            int k = left;
            while(i<n1 && j<n2){
                if (L[i]< R[j]){
                    denomination[k++] = L[i++];
                }
                else {
                    denomination[k++] =R[j++];
                }
              }
            while(i<n1){
                denomination[k++] = L[i++];
            }
            while( j<n2){
                denomination[k++] = R[j++];
            }
    }
}