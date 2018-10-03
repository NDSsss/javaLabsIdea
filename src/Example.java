import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {

        ArrayList<String> strings  = new ArrayList<>();
        for (int i= 0; i<10; i++){
            strings.add(String.valueOf(i));
        }
        for (int i = 0; i< strings.size();i++) {
            System.out.print(strings.get(i)+"\n");
        }

    }
}
