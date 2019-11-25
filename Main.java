package Practice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        while (s1.hasNext()) {
            int num = s1.nextInt();// 输入的人数
            if (num == 0) {// 如果检测到输入的人数为0 则结束
                return;
            }
            int[] arr = new int[num];// 保存N个人的分数
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s1.nextInt();
            }
            int score = s1.nextInt();// 目标分数 输出击中目标分数的个数
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (score == arr[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}