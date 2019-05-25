package com.danny.attendancemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class TeacherLogin extends AppCompatActivity {
    EditText userId,password;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);
        userId=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);
        button=(Button)findViewById(R.id.button3);
    }
    public void doOnClick(View view){
        String user=userId.getText().toString().trim();
        String pass=password.getText().toString().trim();
        if(user.equals("abc")&&pass.equals("abc")){
            Intent intent=new Intent(TeacherLogin.this,TeacherActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(TeacherLogin.this, "Wrong Password", Toast.LENGTH_SHORT).show();
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
        startActivity(new Intent(TeacherLogin.this,MainActivity.class));
        return super.onOptionsItemSelected(item);

    }
}
