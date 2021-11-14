public class ThrowsDemo {
    public void getDetails(String key) {
        try{
            if(key == null)
                throw new NullPointerException( "null key in getDetails" );
        } catch (NullPointerException err) {
            System.out.println(err);
        }
        // do something with the key
    }
}
