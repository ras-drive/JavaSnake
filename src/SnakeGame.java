public class SnakeGame {
    public static void main(String[] args) {
        if (args.length > 0) {
            new GameFrame(args[0]);
        } else {
            new GameFrame(" ");
        }

    }
}
