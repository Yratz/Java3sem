import java.util.Scanner;

public class ThrowsDemo4 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        printDetails( key );
    }
    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            System.out.println(e);
        }
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}
