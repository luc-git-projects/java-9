package br.com.luciano.java9.interfaces.metodosprivados;

public class SendNotificationsMain {
    public static void main(String[] args) {
        SendNotifications sendNotifications = new SendNotificationsImpl();
        sendNotifications.sendNotification();
        sendNotifications.sendNotifications();
    }
}
