import java.lang.*;
enum Secret {
    STAR, CRASH, START
}
public class Main {

    public static void main(String[] args) {
        Secret[] constants = Secret.values();
        int count = 0;
        for (int i = 0; i < constants.length; ++i) {
            if (constants[i].toString().startsWith("STAR")) {
                ++count;
            }
        }
        System.out.println(count);

    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/
