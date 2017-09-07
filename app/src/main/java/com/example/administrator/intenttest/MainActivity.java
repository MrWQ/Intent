package com.example.administrator.intenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();//intent 隐式启动
                intent.setAction("android.intent.action.VIEW");
                intent.putExtra("name", "Wq");
                intent.putExtra("age", 20);
                intent.putExtra("tel", "1361109986");
                startActivityForResult(intent, 0);//设置请求码 和数据
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 0) {//严谨的话：if(requestCode==0 &&resultCode ==0)
            String result = data.getStringExtra("result");
            Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();

        }
    }
}
