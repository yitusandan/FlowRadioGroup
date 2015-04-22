package com.android.hellocsl.flowradiogroup;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.android.hellocsl.flowradiogroup.widget.FlowRadioGroup;


public class MainActivity extends ActionBarActivity implements FlowRadioGroup.OnCheckedChangeListener {
    private FlowRadioGroup mFlowRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFlowRadioGroup = (FlowRadioGroup) findViewById(R.id.radio_group);
        mFlowRadioGroup.setOnCheckedChangeListener(this);
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

    @Override
    public void onCheckedChanged(FlowRadioGroup group, int checkedId) {
        Toast.makeText(this, "on checkedId:" + checkedId, Toast.LENGTH_SHORT).show();
    }
}
