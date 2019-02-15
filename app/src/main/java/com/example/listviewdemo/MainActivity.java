package com.example.listviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mainList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainList = (ListView)findViewById(R.id.class_schedule);

        final String[] theArray = getResources().getStringArray(R.array.array);
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, theArray);
        mainList.setAdapter(itemsAdapter);

        mainList.setOnItemClickListener (new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {

                Toast toast = Toast.makeText (getApplicationContext ( ),
                        "TOASTY TOASTY OH SO TOASTY!",
                        Toast.LENGTH_SHORT);
                toast.show ( );
            }
        });

        mainList.setOnItemLongClickListener (new AdapterView.OnItemLongClickListener ( ) {
            @Override
            public boolean onItemLongClick(AdapterView <?> parent, View view, int position, long id) {

                Toast toast = Toast.makeText (getApplicationContext (),
                        "TOASTY TOASTY NOW WERE EVEN MORE TOASTY OH SO TOASTY!!!!!!!!!",
                        Toast.LENGTH_SHORT);
                toast.show();
                return true;
            }
        });
    }
}
