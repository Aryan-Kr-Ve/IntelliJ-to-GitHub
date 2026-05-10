import java.util.Random;
interface Shared_contents {
    int No = 0, Yes = 1, Maybe = 2;
}
class Questions implements Shared_contents {
    Random ran = new Random();
    int ask() {
        int prob = ran.nextInt(100);
        if (prob < 30)
            return No;
        else if (prob < 50)
            return Yes;
        else
            return Maybe;
    }
}
public class Switch01 implements Shared_contents {
    static void answer(int result) {
        switch (result) {
            case No:
                System.out.println("NO");
                break;
            case Yes:
                System.out.println("YES");
                break;
            case Maybe:
                System.out.println("MAYBE");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
    public static void main(String[] args) {
        Questions obj = new Questions();
        for (int i = 0; i < 4; i++) {
            int result = obj.ask();
            answer(result);
        }
    }
}