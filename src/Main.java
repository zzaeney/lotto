import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] balls = new int[7];
        for (int i = 0; i < 7; i++) {
            balls[i] = new Random().nextInt(44) + 1;
            for (int j = 0; j < i; j++) {
                if (balls[i] == balls[j]) {
                    System.out.println("중복입니다! 다시 뽑을게요~");
                    balls[i] = new Random().nextInt(44) + 1;
                }
            }
            System.out.println("당신의 운좋은 번호는? " + balls[i] + "!");
        }
    }
}
