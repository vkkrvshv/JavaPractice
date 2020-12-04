package rtu.mirea.lab10.task2;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair() {
        System.out.println(new VictorianChair(185).getAge());
        return new VictorianChair(185);
    }

    @Override
    public MagicChair createMagicChair() {
        MagicChair c2 = new MagicChair();
        c2.doMagic();
        return c2;
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        FunctionalChair c1 = new FunctionalChair();
        System.out.println(c1.sum(1,5));
        return c1;
    }

    public static void main(String[] args){
        ChairFactory factory1 = new ChairFactory();
        factory1.createFunctionalChair();
        factory1.createVictorianChair();
        factory1.createMagicChair();
    }
}
