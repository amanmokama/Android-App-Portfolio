package com.example.aman.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button spotifyStreamer,superDuo,buildItBigger,xyzReader,capastone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spotifyStreamer = (Button)findViewById(R.id.spotifyStreamer);
        superDuo = (Button)findViewById(R.id.superDuo);
        buildItBigger = (Button)findViewById(R.id.buildItBigger);
        xyzReader = (Button)findViewById(R.id.XYZReader);
        capastone = (Button)findViewById(R.id.capastone);

        spotifyStreamer.setOnClickListener(this);
        superDuo.setOnClickListener(this);
        buildItBigger.setOnClickListener(this);
        xyzReader.setOnClickListener(this);
        capastone.setOnClickListener(this);

    }

    public void onClick(View v){

        if(v.getId() == R.id.spotifyStreamer){

            Toast.makeText(this,"opening Spotify Streamer",Toast.LENGTH_LONG).show();

        }else if(v.getId() == R.id.superDuo){

            Toast.makeText(this,"Super Duo",Toast.LENGTH_LONG).show();

        }else if(v.getId() == R.id.buildItBigger){

            Toast.makeText(this,"Build It Bigger",Toast.LENGTH_LONG).show();

        }else if(v.getId() == R.id.XYZReader){

            Toast.makeText(this,"XYZ Reader",Toast.LENGTH_LONG).show();

        }else if(v.getId() == R.id.capastone){

            Toast.makeText(this,"Capastone",Toast.LENGTH_LONG).show();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
