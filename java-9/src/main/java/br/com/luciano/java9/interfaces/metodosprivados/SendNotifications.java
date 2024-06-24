package br.com.luciano.java9.interfaces.metodosprivados;

public interface SendNotifications {

    default void sendNotifications(){
        establishConnection();
        System.out.println("Sending multiples notifications");
    }

    default void sendNotification(){
        establishConnection();
        System.out.println("Sending multiples notification");
    }

    private void establishConnection(){
        System.out.println("Establishing a connection");
    }
}
