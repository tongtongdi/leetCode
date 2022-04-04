package test;

/**
 * @Description:
 * @Date: 2019/4/10
 * @Author 王通 菲菲 生了个小宝宝。
 * @Version 1.0
 */

public class OutPutLing {
    public static void main(String[] args) {
        int n = 10;
        char[][] number = new char[10][10];
        for(int i=0;i<n;i++){
            int j=0;
            for(j=0;j<n-i-1;j++){
                number[i][j] = ' ';
            }
            while (j<n){
                number[i][j++] = '*';
            }
        }
        for (int q = 0;q<number.length;q++){
            for(int m = 0;m<number.length;m++){
                System.out.print(number[q][m]);
            }
            System.out.println();
        }

    }
}
