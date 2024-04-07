import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 创建存款数组变量和余额变量，并进行赋值
        int[] deposits = new int[3];
        int balance = 0;

        // 利用while循环，实现多次键盘录入数组，并计算最终余额
        int i = 0;
        while (i < 3) {
            System.out.print("请输入第 " + (i + 1) + " 次存款金额：");
            deposits[i] = sc.nextInt();
            balance += deposits[i];
            i++;
        }

        // 利用for循环，求存款中最大数
        int maxDeposit = deposits[0];
        for (int j = 1; j < deposits.length; j++) {
            if (deposits[j] > maxDeposit) {
                maxDeposit = deposits[j];
            }
        }

        // 存款中的提示语句
        System.out.println("存款成功！您的最终余额为：" + balance);
        System.out.println("存款中的最大金额为：" + maxDeposit);

        sc.close(); // 关闭Scanner对象
    }
}
