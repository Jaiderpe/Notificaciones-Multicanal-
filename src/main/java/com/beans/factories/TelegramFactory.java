package com.beans.factories;
import com.beans.notificaciones.Notification;
import com.beans.notificaciones.TelegramNotification;

public class TelegramFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new TelegramNotification();
    }
}