public class SynchronizedSingletonBlock {
    static private SynchronizedSingletonBlock synchronizedSingletonBlock;

    private SynchronizedSingletonBlock(){}

    public static SynchronizedSingletonBlock getInstance(){
        if(synchronizedSingletonBlock==null){
            synchronized (SynchronizedSingletonBlock.class){
                if(synchronizedSingletonBlock == null){
                    synchronizedSingletonBlock = new SynchronizedSingletonBlock();
                }
            }
        }
        return synchronizedSingletonBlock;
    }
}
