package app.webview.vrnmocawan;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class TreeUnderMessagingNotifcations extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        show(remoteMessage.getNotification().getTitle(),remoteMessage.getNotification().getBody());
    }
    public void show(String title, String msg)
    {




        Intent i =new Intent(getApplicationContext(),MainActivity.class);
        PendingIntent contentIntent =
                PendingIntent.getActivity(this, 1,i, PendingIntent.FLAG_UPDATE_CURRENT );


        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "my notification");
        builder .setVibrate(new long[] { 1000, 1000, 1000, 1000, 1000 });

        //LED
        builder.setLights(Color.RED, 3000, 3000);
        Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(alarmSound);
        builder .setSmallIcon(R.drawable.ic_launcher_background)

                .setContentTitle(title).setAutoCancel(true)
                .setContentText(msg)
                .setStyle(new NotificationCompat.BigTextStyle()
                        .bigText(msg))
                .setAutoCancel(true)
                .setContentIntent(contentIntent)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat manager= NotificationManagerCompat.from(getApplicationContext());
        manager.notify(999,builder.build());
    }


}
