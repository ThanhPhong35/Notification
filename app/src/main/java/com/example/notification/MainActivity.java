package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private Button bt;
    private int notificationid=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notification builder = new Notification.Builder(getApplicationContext())
                        .setContentTitle("Thong bao")
                        .setContentText("Noi dung thong bao")
                        .setSmallIcon(R.drawable.baseline_bus_alert_24)
                        .setDefaults(NotificationCompat.DEFAULT_SOUND)
                        .setColor(Color.RED)
                        .build();
                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.notify(notificationid, builder);

            }
        });
    }

        private int getNotificationid(){
            int num = (int)new Date().getTime();
            return num;
        }

}