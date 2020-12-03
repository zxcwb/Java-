package 字符串和数组.数组.练习;

public class Fourth2 {
    public static void main(String[] args) {
        int arr1[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        hudiao(arr1);
    }

    public static void hudiao(int[][] array){
        System.out.println("互调前的二维数组：");
        showArray(array);
        int array2[][] = new int[array.length][array.length];
        for (int i = 0;i<array.length;i++){
            for (int j = 0;j<array[i].length;j++){
                array2[i][j] = array[j][i];
            }
        }
        System.out.println("互调后的二维数组：");
        showArray(array2);
    }

    public static void showArray(int[][] array){
        for (int i = 0;i<array.length;i++){
            for (int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
                System.out.println();
        }
    }
}
