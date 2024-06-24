package br.com.luciano.java9.interfaces.metodosprivadosestaticos;

public interface SendNotifications {

    static void sendNotifications(){
        establishConnection();
        System.out.println("Sending multiples notifications");
    }

    static void sendNotification(){
        establishConnection();
        System.out.println("Sending multiples notification");
    }

    private static void establishConnection(){
        System.out.println("Establishing a connection");
    }
}
