import java.io.IOException;
import java.util.HashMap;

public class HashingFunction {

    public static void main(String[] args) throws IOException {

        Hash<Integer> hash=new Hash<>();
        for (int i = 0; i <100; i++) {
            hash.add(i);
        }
        hash.display();
    }
}
