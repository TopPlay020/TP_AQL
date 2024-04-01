package Exercice1;
public class Calculatrice {
    public static final int DISABLE = 0;
    public static final int ENABLE = 1;
    public int additionner(int a, int b) {
        result = a + b ;
        return result;
    }

    public int getState(){
        return ENABLE;
    }
    private int result ;
}
