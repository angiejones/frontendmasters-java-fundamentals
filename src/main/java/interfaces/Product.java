package interfaces;

public interface Product {

    String getName();
    void setName(String name);

    default double getPrice(){
        return 50;
    }
    default void setPrice(double price){}
}
