

import java.util.List;

public class pizza {

    private String size;
    private String crust;
    private String sauce;
    private List<String> toppings;

    public pizza() {
        size = "";
        crust = "";
        sauce = "";
        List<String> toppings = null;
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size + ", crust" + crust + ", sau ce=" + sauce + ", toppings" + toppings + "]";
    }
}