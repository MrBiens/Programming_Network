import java.util.ArrayList;
import java.util.HashMap;

public class Buffer {
    //size max
    private int capacity;
    private ArrayList<String> products = new ArrayList<>();

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return products.size();
    }

    public void addProduct_map(String productName){
        System.out.println("----------------------------");
        System.out.println("Nhà sản xuất đã thêm sản phẩm: "+productName);
        products.add(productName);
        System.out.println("Số lượng sản phẩm hiện tại đang có là: "+products.size());
    }

    public void removeProduct(String customer){
        System.out.println("----------------------------");
        System.out.println("Khách hàng:" +customer+" đã mua sản phẩm :"+products.getFirst());
        products.removeFirst();
    }




}
