package br.com.luciano.java9.interfaces.metodosprivadosestaticos;

import br.com.luciano.java9.interfaces.metodosprivados.SendNotificationsImpl;

public class SendNotificationsMain {
    public static void main(String[] args) {
        SendNotifications.sendNotification();
        SendNotifications.sendNotifications();
    }
}
