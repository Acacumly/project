package Practice;
import java.util.*;

public class Score{
    private static int[] createA(String string) {
        String[] strings = string.split(" ");
        int[] Array = new int[strings.length];
        for (int i = 0;i < Array.length;i++){
            Array[i] = Integer.parseInt(strings[i]);
        }
        return Array;
    }

    private static double getQBS(int i) {
        if(i <= 100 && i >= 90){
            return 4.0;
        }else if(i <= 89 && i >= 85){
            return 3.7;
        }else if(i <= 84 && i >= 82){
            return 3.3;
        }else if(i <= 81 && i >= 78){
            return 3.0;
        }else if(i <= 77 && i >= 75){
            return 2.7;
        }else if(i <= 74 && i >= 72){
            return 2.3;
        }else if(i <= 71 && i >= 68){
            return 2.0;
        }else if(i <= 67 && i >= 64){
            return 1.5;
        }else if(i <= 63 && i >= 60){
            return 1.0;
        }else {
            return 0.0;
        }
    }

    private static void getQBS(Scanner scanner){
        int number = Integer.parseInt(scanner.nextLine());
        String string1 = scanner.nextLine();
        int[] classore = createA(string1);
        String string2 = scanner.nextLine();
        int[] score = createA(string2);
        double[] core = new double[number];
        for(int i = 0;i < number;i++){
            core[i] = getQBS(score[i]);
        }
        for(int i = 0;i < core.length;i++){
            core[i] = core[i] * classore[i];
        }
        double sum = 0;
        for(int i = 0;i < core.length;i++){
            sum += core[i];
        }
        int sumcore = 0;
        for(int i = 0;i < classore.length;i++){
            sumcore += classore[i];
        }
        double GPA = sum/sumcore;
        System.out.printf("%.2f",GPA);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getQBS(scanner);
    }
}

