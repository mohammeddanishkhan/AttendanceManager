package com.danny.attendancemanager;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class SubjectList extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       try{
           setContentView(R.layout.activity_subject_list);
           lv=(ListView)findViewById(R.id.listView);
           String arr[]=new String[7];
           for(int i=0;i<7;i++){
               arr[i]="CS0"+(i+1);
           }
           ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arr);
           lv.setAdapter(arrayAdapter);
           lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
               @Override
               public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                   Intent intent=new Intent(SubjectList.this,AttendanceActivity.class);
                   intent.putExtra("position",position+"");
                   startActivity(intent);
               }
           });
       }catch(Exception e){
           Log.e("Exception is" ,e.toString());
       }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //firebaseAuth.signOut();
        finish();
        startActivity(new Intent(SubjectList.this,MainActivity.class));
        return super.onOptionsItemSelected(item);

    }

}
