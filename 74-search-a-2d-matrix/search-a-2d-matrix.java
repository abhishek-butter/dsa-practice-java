class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0;
        int right=matrix.length * matrix[0].length-1 ;
        int rowsize=matrix[0].length;
        while(left<=right){
            int mid=left+(right-left)/2;
            
            
            if(matrix[mid/rowsize][mid%rowsize]==target)return true;
            else if(matrix[mid/rowsize][mid%rowsize]<target){
                left=mid+1;
            }
            else right=mid-1;
        }
        return false;
        
    }
}