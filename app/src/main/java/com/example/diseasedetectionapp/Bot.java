package com.example.diseasedetectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.smartnsoft.directlinechatbot.DirectLineChatbot;

import org.jetbrains.annotations.NotNull;

public class Bot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bot);
        final DirectLineChatbot chatbot = new DirectLineChatbot("nX~9-ey7k~eGJJDBU9BpxLaRiHteAS6_7x");
        chatbot.setDebug(true);
        chatbot.setUser("Khushboo");

        chatbot.start(new DirectLineChatbot.Callback()
        {
            @Override
            public void onStarted()
            {
                chatbot.send("Hello");
            }

            @Override
            public void onMessageReceived(@NotNull String message)
            {
                Log.d("CHATBOT", message);
            }
        });
    }
}