package BTH2_Do_Phuc_Tap_Cua_Thuat_Toan;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi: ");
        String inputString = scanner.nextLine();
        int[] frequentChar = new int[255];                            //{1}
        for (int i = 0; i < inputString.length(); i++) {              //{2}
            /* tìm vị trí tương ứng của kí tự trong mang ASCII */
            int ascii = inputString.charAt(i);                //{3}
            /* tăng giá trị tần suất */
            frequentChar[ascii] += 1;                                 //{4}
        }
        int max = 0;                                                  //{5}
        char character = (char) 255; /* empty character */            //{6}
        for (int j = 0; j < 255; j++) {                               //{7}
            if (frequentChar[j] > max) {                              //{8}
                max = frequentChar[j];                                //{9}
                character = (char) j;                                 //{10}
            }
        }
        System.out.println("Chữ cái xuất hiện nhiều nhất là '" + character + "' với tần suất là " + max + " lần");
    }
}
