public class ThreeA {
    public static final int SIZE = 3;
    public static void main(String[] args){
        for(int line = 1; line <= SIZE; line++){
            //contents of each line
            // /
            for (int slash = 1; slash <= (-4 * line + 4 * SIZE); slash++){
                System.out.print("/");
            }
            // *
            for (int star = 1; star <= (8 * line - 8); star++){
                System.out.print("*");
            }

            // \
            for (int slash = 1; slash <= (-4 * line + 4 * SIZE); slash++){
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
