public class Main {
    public static void main(String[] args) {
        String name = "Lazy";
        String status = "detected";
        int errorCode = 2;

        //Fix code below
        String formattedMessage = String.format("%s" + " employee %d! Error code: " + "%s", name, status, errorCode);
        System.out.printf("Result of work - %c", formattedMessage);
    }
}