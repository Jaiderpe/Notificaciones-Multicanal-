# Notificaciones-Multicanal-
. 🚀  

---

### 📌 **README.md - Notificaciones con Abstract Factory**  

```md
# 📩 Sistema de Notificaciones con Abstract Factory

🚀 **Proyecto en Java** que implementa el **Patrón Abstract Factory** para gestionar el envío de notificaciones en **WhatsApp, Telegram y Slack**.  
Permite al usuario seleccionar el tipo de notificación sin necesidad de conocer la implementación interna.  

---

## 🛠️ **Tecnologías Utilizadas**
- ☕ **Java** (JDK 8+)
- 🏭 **Patrón Abstract Factory**
- 📂 **Estructura Modular y Escalable**

---

## 📁 **Estructura del Proyecto**
```
📦 NotificationSystem
│── 📁 src/               # Código fuente
│   ├── 📁 factories/     # Fábricas de notificaciones
│   ├── 📁 notifications/ # Implementaciones de notificaciones
│   ├── 📁 client/        # Código del cliente
│── 📁 bin/               # Archivos compilados
│── 📄 README.md          # Descripción del proyecto
│── 📄 .gitignore         # Ignorar archivos innecesarios
```

---

## 🎯 **Características**
✅ Soporte para **WhatsApp, Telegram y Slack**  
✅ **Extensible**: Fácil de agregar nuevos servicios  
✅ **Interfaz única** para todas las notificaciones  
✅ **Registro de mensajes** en un log  

---

## 💻 **Ejemplo de Uso**
### 1️⃣ **Ejecutar el Programa** en la terminal:
```sh
javac -d bin src/client/NotificationClient.java
java -cp bin client.NotificationClient
```

### 2️⃣ **Seleccionar un Servicio**
```sh
Seleccione el servicio de notificación (WHATSAPP, TELEGRAM, SLACK): 
```
➡ **Ejemplo:**
```sh
WHATSAPP
```

### 3️⃣ **Ingresar el Mensaje**
```sh
Escriba el mensaje que desea enviar:
Hola desde WhatsApp
📩 Enviando mensaje por WhatsApp: Hola desde WhatsApp
✅ Mensaje registrado en el log de WhatsApp: Hola desde WhatsApp
```

---

## 🏗️ **Cómo Agregar un Nuevo Servicio**
1. Crear una nueva clase en `notifications/`, por ejemplo:  
   ```java
   public class EmailNotification implements Notification { ... }
   ```
2. Crear una nueva fábrica en `factories/`:  
   ```java
   public class EmailFactory implements NotificationFactory { ... }
   ```
3. Modificar `NotificationClient.java` para incluir el nuevo servicio.

---

## 🏆 **Contribuciones**
¡Las contribuciones son bienvenidas! Si quieres mejorar este proyecto, abre un **Pull Request** o envía una **Issue**. 🚀  

📧 **Contacto:** [TuEmail@ejemplo.com](mailto:TuEmail@ejemplo.com)  

---

## ⚖️ **Licencia**
Este proyecto está bajo la licencia **MIT**. ¡Úsalo con libertad! 🎉  

---
💡 **Si te gustó el proyecto, dale una ⭐ en GitHub!** 🚀  
```

---


