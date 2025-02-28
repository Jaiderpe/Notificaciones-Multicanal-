package com.beans.client;
import com.beans.factories.NotificationFactory;
import com.beans.factories.WhatsAppFactory;
import com.beans.factories.TelegramFactory;
import com.beans.factories.SlackFactory;
import com.beans.notificaciones.Notification;
import java.util.Scanner;


public class NotificationClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que elija el tipo de notificación
        System.out.println("Seleccione el servicio de notificación (WHATSAPP, TELEGRAM, SLACK): ");
        String type = scanner.nextLine().trim().toUpperCase();

        try {
            NotificationFactory factory = getNotificationFactory(type);
            Notification notification = factory.createNotification();

            // Enviar y registrar el mensaje
            System.out.println("Escriba el mensaje que desea enviar:");
            String message = scanner.nextLine();
            notification.sendMessage(message);
            notification.logMessage(message);
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static NotificationFactory getNotificationFactory(String type) {
        switch (type) {
            case "WHATSAPP": return new WhatsAppFactory();
            case "TELEGRAM": return new TelegramFactory();
            case "SLACK": return new SlackFactory();
            default: throw new IllegalArgumentException("Servicio no soportado. Usa WHATSAPP, TELEGRAM o SLACK.");
        }
    }
}