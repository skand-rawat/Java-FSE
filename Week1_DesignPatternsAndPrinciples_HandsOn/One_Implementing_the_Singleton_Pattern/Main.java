package Week1_DesignPatternsAndPrinciples_HandsOn.One_Implementing_the_Singleton_Pattern;

public class Main {
    public static void main(String[] args) {

        Logger log1 = Logger.getInst();
        Logger log2 = Logger.getInst();

        System.out.println(log1 == log2);
    }
}