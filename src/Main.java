import java.util.Scanner;

/**
 * Created by Strashimir on 21-Oct-15.
 */
public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        boolean isWarped = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Starting point: ");
        System.out.print("x=");
        x = in.nextInt();
        System.out.print("y=");
        y = in.nextInt();
        System.out.println("Input commands:");
        String input;
        input = in.next();
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '>':
                    x = goLeftAndRight(false, isWarped, x);
                    break;
                case '<':
                    x = goLeftAndRight(true, isWarped, x);
                    break;
                case '^':
                    y = goUpAndDown(true, isWarped, y);
                    break;
                case 'V':
                    y = goUpAndDown(false, isWarped, y);
                    break;
                case '~':
                    isWarped = !isWarped;
                    break;
                default:
                    System.out.println("You fucked up, dude");
                    break;
            }
        }
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }

    public static int goLeftAndRight(boolean isLeft, boolean isWarped, int x) {//might have reference problems
        if (isWarped)
            isLeft = !isLeft;
        if (isLeft) x--;
        else x++;
        return x;
    }

    public static int goUpAndDown(boolean isUp, boolean isWarped, int y) {//might have reference problems
        if (isWarped)
            isUp = !isUp;
        if (isUp) y--;
        else y++;
        return y;
    }

}
