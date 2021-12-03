package javaSingleton;

public class JavaApplicationSingleton {
    
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s.getTime());
        System.out.println(s.dateFormat());
    }
    
}
