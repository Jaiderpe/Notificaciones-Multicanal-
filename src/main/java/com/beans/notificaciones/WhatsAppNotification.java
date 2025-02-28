package com.beans.notificaciones;

public class WhatsAppNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("📩 Enviando mensaje por WhatsApp: " + message);
    }

    @Override
    public void logMessage(String message) {
        System.out.println("✅ Mensaje registrado en el log de WhatsApp: " + message);
    }
}
