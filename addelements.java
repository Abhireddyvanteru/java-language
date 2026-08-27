import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n%2==0){
            int[] arr1 = new int[n];
            for(int i=0; i<n; i++){
                arr1[i] = sc.nextInt();
            }
            int[] arr2 = new int[m];
            for(int j=0; j<m; j++){
                arr2[j] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.println(arr1[i]+arr2[m-1-j]);
                }
            }
        }
        else{
            System.out.println("Odd size");
        }
    }
}