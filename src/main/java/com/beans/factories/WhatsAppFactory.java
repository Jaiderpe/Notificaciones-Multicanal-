package com.beans.factories;
import com.beans.notificaciones.Notification;
import com.beans.notificaciones.WhatsAppNotification;

public class WhatsAppFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new WhatsAppNotification();
    }
}
