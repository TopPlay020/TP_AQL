package Exercice2;

public class Order {
    static final int NORMAL_TYPE = 0;
    static final int VIP_TYPE = 1;

    int type;
    String detail;
    public Order(int type , String detail){
        this.type = type;
        this.detail = detail;
    }
}
