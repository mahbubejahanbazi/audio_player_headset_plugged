package ir.mjahanbazi.audioplayerheadsetplugged;


import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    public MyAudioPlayer audioPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        audioPlayer = findViewById(R.id.activity_main_audio_player);
        audioPlayer.setAudio(R.raw.audio_file_example);
        IntentFilter receiverFilter = new IntentFilter(Intent.ACTION_HEADSET_PLUG);
        MyHeadsetReceiver receiver = new MyHeadsetReceiver();
        registerReceiver(receiver, receiverFilter);
    }

}
