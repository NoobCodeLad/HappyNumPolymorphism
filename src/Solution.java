import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {

        Parent p = new Parent();
        Scanner sc = new Scanner(System.in);
        p.startElement = sc.nextInt(); // Take input lower value
        p.endElement = sc.nextInt(); // Take input upper value
        ChildOne prime = new ChildOne();
        ChildTwo happy = new ChildTwo();
        prime.Prime(p.startElement,p.endElement);
        System.out.println();
        happy.Happy(p.startElement,p.endElement);
    }

    public static class Parent {

        public int startElement;
        public int endElement;

    }

    public static class ChildOne extends Parent {

        public void Prime(int a, int b) {
            int i, j, flag;
            for (i = a; i <= b; i++) {
                if (i == 1 || i == 0)
                    continue;
                flag = 1;
                for (j = 2; j <= i / 2; ++j) {
                    if (i % j == 0) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1)
                    System.out.print(i + " ");
            }

        }

    }

    public static class ChildTwo extends Parent {

        public void Happy(int a, int b) {
            for (int i = a; i <= b; i++) {

                int j, num, sum = 0;
                num = i;
                while (sum != 1 && sum != 4) {
                    sum = 0;
                    while (num > 0) {
                        j = num % 10;
                        sum += (j * j);
                        num = num / 10;
                    }
                    num = sum;
                }

                if (sum == 1)
                    System.out.print(i + " ");

            }
        }
    }
}
