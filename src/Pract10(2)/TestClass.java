public class TestClass {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();
        Chair c1 = factory.createVictorianChair(7);
        MagicChair c2 = factory.createMagicalChair();
        Chair c3 = factory.createFunctionalChair();
        Chair client1 = new Client();
        System.out.println(c1.getAge());
        c2.doMagic();

    }
}
