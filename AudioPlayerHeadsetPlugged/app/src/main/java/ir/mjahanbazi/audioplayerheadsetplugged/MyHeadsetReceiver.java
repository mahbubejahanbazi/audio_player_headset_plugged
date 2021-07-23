package ir.mjahanbazi.audioplayerheadsetplugged;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyHeadsetReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        MainActivity activity = (MainActivity) context;
        if (activity.audioPlayer.isPlaying()) {
            activity.audioPlayer.pauseAudio();
        }
    }
}
