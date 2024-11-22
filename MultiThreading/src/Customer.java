
public class Customer extends Thread{
    private String name;
    private Buffer buffer;

    public Customer(String name, Buffer buffer) {
        this.name = name;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while(true){
            if(buffer.getSize()>0){
                try {

                    buffer.removeProduct(name);
                    sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }



}
