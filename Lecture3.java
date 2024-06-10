import java.lang.reflect.Array;
import java.util.Arrays;

public class Lecture3 {
    public static void main(String[] args) {
        byte myAge = 27;
        char myType ='a';
        final int birthYear = 1996;

        myAge= 28;
//        birthYear = 1995;
        System.out.println(myAge);

        String str1 = "Hello Dotin !!!";
        String str2 = "Hello dotin !!!";
        String st3 = "Hello Dotin !!!";
        String str4 = new String("Hello Dotin !!!");
        String str5 = new String("Hello Dotin !!!");

        System.out.println(str1.length());
        System.out.println(str1.charAt(4));
//        آخرین حرف
        System.out.println(str1.charAt(str1.length()-1));
        System.out.println(str1.substring(5,8));
        String s="Hi";
        System.out.println(str1+s);
        System.out.println(str1.concat(s));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.indexOf('e'));
        System.out.println(str1.indexOf("Dotin"));
        System.out.println(str1.indexOf('o',5));
        System.out.println(str1.replace("Hello","Hi"));

        String s2 = String.format("    My Name Is %s" +"\n"+ "My age is %d", "Fateme", 27);
        System.out.println(s2);

        System.out.println(s2.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.trim());
        String s3 = "Hello, to, ali";
        String[] s4 = s3.split(",");
        System.out.println(Arrays.toString(s4));

        StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("  ")
                .append("to")
                .append(" all")
        ;
        System.out.println(sb);

    }
}
