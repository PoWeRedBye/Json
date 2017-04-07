package com.example.maxim_ozarovskiy.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public String jsonStr = "{\n" +
            "  \"User\":{\n" +
            "    \"Name\":\"UserName\",\n" +
            "    \"SurName\":\"Surname\",\n" +
            "    \"Date\":4654564546\n" +
            "  },\n" +
            "  \"Settings\":{\n" +
            "    \"isPushEnabled\":true,\n" +
            "    \"isSeenForOthers\":false\n" +
            "  },\n" +
            "  \"Friends\":[\n" +
            "    123,\n" +
            "    124,\n" +
            "    200\n" +
            "    ]\n" +
            "}";


    public MainActivity() throws JSONException {
        JSONObject reader = new JSONObject(jsonStr);
        JSONObject user = reader.getJSONObject("User");
        String name = user.getString("Name");
        String surname = user.getString("SurName");
        String date = user.getString("Date");
        JSONObject settings = reader.getJSONObject("Settings");
        Boolean isPushEnabled = settings.getBoolean("isPushEnabled");
        Boolean isSeenForOthers = settings.getBoolean("isSeenForOthers");
        JSONArray friends = reader.getJSONArray("Friends");

        JSONObject writer = new JSONObject();
        writer.put("Name", name);
        writer.put("SurName", surname);
        writer.put("Date", date);
        writer.put("isPushEnabled", isPushEnabled);
        writer.put("isSeenForOthers", isSeenForOthers);
        writer.put("Friends", friends);

        Log.i("GSON",  "Name: " + name + "\nSurName: " + surname + "\nDate: " + date + "\nisPushEnabled: " + isPushEnabled + "\nisSeenForOthers: " + isSeenForOthers + "\nFriends: " + friends);

        



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
