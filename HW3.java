import com.sun.org.apache.bcel.internal.Const;

import java.lang.reflect.Type;

public class HW3 {
    public static void main(String[] args) {
        String a = "XIIL";
        int i = 0;
        int z = 0;
        int n = a.length();
        for (int b = 0; b < n; b++) {
            char y = a.charAt(i);
            if (y == 'I') {
                z += 1;
            } else if (y == 'V') {
                z += 5;
            } else if (y == 'X') {
                z += 10;
            } else if (y == 'L') {
                z += 50;
            } else if (y == 'C') {
                z += 100;
            } else if (y == 'D') {
                z += 500;
            } else {
                z += 1000;
            }
            i += 1;
        }
        System.out.println(z);
    }
}