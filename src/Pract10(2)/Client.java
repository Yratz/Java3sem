public class Client implements Chair{
    public Chair chair;
    public void sit() {
        System.out.println("You are sit...");
    }

    public void setChair(Chair ch) {
        chair = ch;
    }
}
