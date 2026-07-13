package Week1_DesignPatternsAndPrinciples_HandsOn.One_Implementing_the_Singleton_Pattern;


class Logger {
    private static Logger inst;
    private Logger() {}

    public static Logger getInst() {
        if (inst == null) {
            inst = new Logger();
        }
        return inst;
    }

}
