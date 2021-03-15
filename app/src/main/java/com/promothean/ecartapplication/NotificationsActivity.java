package com.promothean.ecartapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.promothean.ecartapplication.adapter.NotificationAdapter;
import com.promothean.ecartapplication.model.Notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationsActivity extends AppCompatActivity {
    private static final String TAG = "NotificationsActivity";
    private Toolbar toolBar;
    private LinearLayout layoutNoNotifications;
    private RecyclerView recyclerNotifications;
    private NotificationAdapter notificationAdapter;
    private List<Notification> notifications;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        toolBar = findViewById(R.id.toolBar);
        layoutNoNotifications = findViewById(R.id.layoutNoNotifications);
        recyclerNotifications = findViewById(R.id.recyclerNotifications);

        recyclerNotifications.setVisibility(View.GONE);
        layoutNoNotifications.setVisibility(View.VISIBLE);

        setSupportActionBar(toolBar);
        toolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        loadNotifications();
    }

    private void loadNotifications() {
        notifications = new ArrayList<>();

        notifications.add(new Notification("New Notifcation", "Notification Content", "13/03/2021"));
        notifications.add(new Notification("New Notifcation", "Notification Content", "13/03/2021"));
        notifications.add(new Notification("New Notifcation", "Notification Content", "13/03/2021"));
        notifications.add(new Notification("New Notifcation", "Notification Content", "13/03/2021"));
        notifications.add(new Notification("New Notifcation", "Notification Content", "13/03/2021"));
        notifications.add(new Notification("New Notifcation", "Notification Content", "13/03/2021"));
        notifications.add(new Notification("New Notifcation", "Notification Content", "13/03/2021"));
        notifications.add(new Notification("New Notifcation", "Notification Content", "13/03/2021"));
        notifications.add(new Notification("New Notifcation", "Notification Content", "13/03/2021"));
        notifications.add(new Notification("New Notifcation", "Notification Content", "13/03/2021"));

        notificationAdapter = new NotificationAdapter(NotificationsActivity.this, notifications);
        recyclerNotifications.setAdapter(notificationAdapter);
        layoutNoNotifications.setVisibility(View.GONE);
        recyclerNotifications.setVisibility(View.VISIBLE);
    }
}