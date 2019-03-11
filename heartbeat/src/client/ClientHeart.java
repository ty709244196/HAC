package client;

public class ClientHeart extends Thread {

    @Override
    public void run() {

        try {
            while (true) {
                ClientSender.getInstance().send();
                synchronized (ClientHeart.class) {
                	//this.wait(5000);
                    Thread.sleep(2000);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * main function
     * 
     * @param args
     */
    public static void main(String[] args) {
        ClientHeart client = new ClientHeart();
        client.start();
    }

}