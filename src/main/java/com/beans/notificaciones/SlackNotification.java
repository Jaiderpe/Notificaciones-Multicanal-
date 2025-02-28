package com.beans.notificaciones;

public class SlackNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("📩 Enviando mensaje por Slack: " + message);
    }

    @Override
    public void logMessage(String message) {
        System.out.println("✅ Mensaje registrado en el log de Slack: " + message);
    }
}
