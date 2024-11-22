
public class Products extends Thread{
    private String name;
    private Buffer buffer;

    public Products(String name, Buffer buffer) {
        this.name = name;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while(true){
            if(buffer.getSize()<buffer.getCapacity()){
                try {
                    buffer.addProduct_map(name);
                    sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }



}
