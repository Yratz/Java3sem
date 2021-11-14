import java.util.Scanner;

public class ThrowsDemo5 {
    public void getKey() {
        boolean true_string = false;
        while (!true_string) {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            try {
                true_string = true;
                printDetails(key);
            } catch (Exception err) {
                true_string = false;
                System.out.println(err);
            }
        }
    }
    private void printDetails(String key) throws Exception {

        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}
