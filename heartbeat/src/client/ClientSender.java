package client;

import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

import entity.Entity;

public class ClientSender {

    private ClientSender() {
    }

    Socket sender = null;
    private static ClientSender instance;

    public static ClientSender getInstance() {
        if (instance == null) {
            synchronized (ClientHeart.class) {
                instance = new ClientSender();
            }
        }
        return instance;
    }

    public void send() {
        try {
            sender = new Socket(InetAddress.getLocalHost(), 9090);
            while (true) {
                ObjectOutputStream out = new ObjectOutputStream(sender.getOutputStream());
                Entity obj = new Entity();
                obj.setName("Client001");
                obj.setType("A");
                out.writeObject(obj);
                out.flush();

                System.out.println("Heartbeat sent...");
                Thread.sleep(5000);
            }
        } catch (Exception e) {

        }
    }
}