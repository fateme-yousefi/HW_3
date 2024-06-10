public class HandsOn {
    public static void main(String[] args) {
        String H = String.format("My Name Is %s" + " My Age is %s", "Fateme", "27");
        System.out.println(H);
        String H2 = H.toUpperCase();
        String H3 = H.replace("Fateme", "Dotin");
//        int H4 = H3.indexOf("Dotin");

        System.out.println(H3);
    }
}
