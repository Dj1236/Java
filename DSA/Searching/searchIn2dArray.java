package DSA.Searching;

public class searchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}};
        int target = 8;
        System.out.println(search(arr,target));

    }
    static int search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==target){
                    return i;
                }
            }
            }
            return -1;
    }
    
}
