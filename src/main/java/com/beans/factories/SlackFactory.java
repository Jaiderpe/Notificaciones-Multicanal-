package com.beans.factories;
import com.beans.notificaciones.Notification;
import com.beans.notificaciones.SlackNotification;

public class SlackFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SlackNotification();
    }
}
