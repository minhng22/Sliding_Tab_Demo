package com.example.administrator.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class SubActivity1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_activity1);

        Button btn=(Button) findViewById(R.id.btntrove);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                finish();
            }
        });
    }

    @Override

    protected void onResume() {

        super.onResume();

        Toast.makeText(this, "Action 1 onResume", Toast.LENGTH_LONG).show();

    }

    @Override

    protected void onPause() {

        super.onPause();

        Toast.makeText(this, "Action 1 onPause", Toast.LENGTH_LONG).show();

    }

    @Override

    protected void onStop() {

        super.onStop();

        Toast.makeText(this, "Action 1 onStop", Toast.LENGTH_LONG).show();

    }

    @Override

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Action 1 onDestroy", Toast.LENGTH_LONG).show();

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
