
public class ThrowsDemo2 {
        public void printMessage(String key) {
            String message = getDetails(key); System.out.println( message );
        }
        public String getDetails(String key) {
            try {
                return "data for " + key;
            } catch (NullPointerException err) {
                throw new NullPointerException( "null key in getDetails" );
            }
        }
    }
