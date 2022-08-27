@credit: deepakgitprojet [LPU STUDENT]
license: MIT license & General purpose license
FAIR USE

import java.util.*;
class Firstclass {
    public static void main(String[] args) {
        System.out.println("As you want to use my calculater you have to wirte your name");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(" hii " + a + " enter any two  your digits please");
        Scanner cs = new Scanner(System.in);
        int q = cs.nextInt();
        System.out.println("kindle enter yout second value");
        Scanner ms = new Scanner(System.in);
        int w = ms.nextInt();
        int sum = q + w;
        int diff = q - w;
        int div = q / w;
        int mut = q * w;
        Scanner xz = new Scanner(System.in);
        System.out.println(" press 1 for sum \n press 2 for substract \n press 3 for divide \n press 4 for multiply");
        int r = xz.nextInt();
        switch (r) {
            case 1:
                System.out.println(sum);
                break;
            case 2:
                System.out.println(diff);
                break;
            case 3:
                System.out.println(div);
                break;
            case 4:
                System.out.println(mut);
                break;
            default:
                System.out
                        .println("invalid command");
        }
    }
}
