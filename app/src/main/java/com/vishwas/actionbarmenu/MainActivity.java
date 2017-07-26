package com.vishwas.actionbarmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
          /*
            In here using MenuInflater
                This class is used to instantiate menu XML files into Menu objects.
        */
        /*
            public MenuInflater getMenuInflater ()
        */
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.com:
                // Creating toast for Computer
                Toast.makeText(MainActivity.this, "You've clicked on Computer",
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.game:
                // Creating toast for Gamepad
                Toast.makeText(MainActivity.this, "You've clicked on Gamepad",
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.camera:
                // Creating toast for Camera
                Toast.makeText(MainActivity.this, "You've clicked on Camera",
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.vid:
                // Creating toast for Video
                Toast.makeText(MainActivity.this, "You've clicked on Video",
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.mail:
                // Creating toast for Email
                Toast.makeText(MainActivity.this, "You've clicked on Email",
                        Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
