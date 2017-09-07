package com.example.administrator.intenttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/9/7/007.
 */

public class another extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another);
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent=new Intent(another.this,MainActivity.class);//intent 显示启动
                Intent intent1 = getIntent();//intent1 获取数据
                String name = intent1.getStringExtra("name");
                Integer age = intent1.getIntExtra("age", 20);
                String tel = intent1.getStringExtra("tel");
                Toast.makeText(another.this, "name:" + name + "\nage：" + age + "\ntel:" + tel, Toast.LENGTH_LONG).show();
                intent1.putExtra("result", "name:\t" + name + " age:\t" + age + " tel:\t" + tel);
                setResult(0, intent1);//返回结果 返回码和数据
                finish();
            }
        });

    }
}
