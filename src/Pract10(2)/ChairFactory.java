public class ChairFactory implements AbstractChairFactory {

    public VictorianChair createVictorianChair(int a){
        return new VictorianChair(a);
    }
    public MagicChair createMagicalChair(){
        return new MagicChair();
    }
    public FunctionalChair createFunctionalChair(){
        return  (new FunctionalChair());
    }
}
