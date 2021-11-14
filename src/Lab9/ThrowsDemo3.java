import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo3 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
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
        if(Objects.equals(key, "")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}
