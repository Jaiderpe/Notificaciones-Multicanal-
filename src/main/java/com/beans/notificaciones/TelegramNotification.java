package com.beans.notificaciones;


public class TelegramNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("📩 Enviando mensaje por Telegram: " + message);
    }

    @Override
    public void logMessage(String message) {
        System.out.println("✅ Mensaje registrado en el log de Telegram: " + message);
    }
}