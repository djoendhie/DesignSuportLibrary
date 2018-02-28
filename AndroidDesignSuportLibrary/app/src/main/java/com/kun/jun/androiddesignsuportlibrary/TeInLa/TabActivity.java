package com.kun.jun.androiddesignsuportlibrary.TeInLa;

import android.content.Intent;
import android.support.design.widget.TabItem;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

import com.kun.jun.androiddesignsuportlibrary.MainActivity;
import com.kun.jun.androiddesignsuportlibrary.R;

public class TabActivity extends android.app.TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        TabHost tabHost = getTabHost();

        // Tab for Photos
        TabHost.TabSpec photospec = tabHost.newTabSpec("korban");
        // setting Title and Icon for the Tab
        photospec.setIndicator("korban", getResources().getDrawable(R.drawable.ic_menu_camera));
        Intent photosIntent = new Intent(this, KorbanTabActivity.class);
        photospec.setContent(photosIntent);

        // Tab for Songs
        TabHost.TabSpec songspec = tabHost.newTabSpec("korban1");
        songspec.setIndicator("korban1", getResources().getDrawable(R.drawable.ic_menu_gallery));
        Intent songsIntent = new Intent(this, KorbanTab1Activity.class);
        songspec.setContent(songsIntent);

        // Tab for Videos
        TabHost.TabSpec videospec = tabHost.newTabSpec("korban2");
        videospec.setIndicator("korban2", getResources().getDrawable(R.drawable.ic_menu_manage));
        Intent videosIntent = new Intent(this, KorbanTab2Activity.class);
        videospec.setContent(videosIntent);

        // Adding all TabSpec to TabHost
        tabHost.addTab(photospec);
        tabHost.addTab(songspec);
        tabHost.addTab(videospec);
    }

}