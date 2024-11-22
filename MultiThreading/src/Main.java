public class Main {

    public static void main(String[] args) {
        String main = "\"Đây là main\"";
        System.out.println(main);
        Buffer buffer = new Buffer(10);

        Customer customer = new Customer("Lan",buffer);
        customer.start();

        Products products = new Products("Product",buffer);
        products.start();

        //"Đây là main"
        //----------------------------
        //Nhà sản xuất đã thêm sản phẩm: Product
        //----------------------------
        //Số lượng sản phẩm hiện tại đang có là: 1
        //Khách hàng:Lan đã mua sản phẩm :Product
        //----------------------------
        //Nhà sản xuất đã thêm sản phẩm: Product
        //Số lượng sản phẩm hiện tại đang có là: 1
        //----------------------------
        //Nhà sản xuất đã thêm sản phẩm: Product
        //Số lượng sản phẩm hiện tại đang có là: 2
        //----------------------------
        //Nhà sản xuất đã thêm sản phẩm: Product
        //Số lượng sản phẩm hiện tại đang có là: 3
        //----------------------------
        //Nhà sản xuất đã thêm sản phẩm: Product
        //Số lượng sản phẩm hiện tại đang có là: 4
        //----------------------------
        //Nhà sản xuất đã thêm sản phẩm: Product
        //Số lượng sản phẩm hiện tại đang có là: 5
        //----------------------------
        //Nhà sản xuất đã thêm sản phẩm: Product
        //Số lượng sản phẩm hiện tại đang có là: 6
        //----------------------------
        //Nhà sản xuất đã thêm sản phẩm: Product
        //Số lượng sản phẩm hiện tại đang có là: 7
        //----------------------------
        //Nhà sản xuất đã thêm sản phẩm: Product
        //Số lượng sản phẩm hiện tại đang có là: 8
        //----------------------------
        //Nhà sản xuất đã thêm sản phẩm: Product
        //Số lượng sản phẩm hiện tại đang có là: 9
        //----------------------------
        //Nhà sản xuất đã thêm sản phẩm: Product
        //Số lượng sản phẩm hiện tại đang có là: 10


        // tức là điều kiện của hàm consume đúng lúc sai mà lúc này hàm main đã kết thúc tiến trình tuần tự của mình (lúc if buffer .size < 0) nên nó dừng lại,
        // còn hàm products buffer.size < max nên nó vẫn hoạt động.
        // =>  thời gian hoạt động của hàm main hạn chế nên nếu kéo dài thời gian hoạt động thì products.size sẽ >0 (do nó vừa kịp tạo) nên sẽ kéo dài thêm
        // VD nếu main có for( 1000 ) thì kq sẽ khác

    }
}