package com.phong.hoctoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Xuất hiện dòng thông báo dưới màn hình dùng Toast
    public void XuLyToastShort(View view) {
        Toast t = Toast.makeText(MainActivity.this, "Toast Short", Toast.LENGTH_SHORT);
        t.show();
    }
    //Đây là viết tắt vì ko có tương tác nên nhất thiết ko cần phải khai báo biến t
    public void XuLyToastLong(View view) {
        Toast.makeText(MainActivity.this, "Toast Long", Toast.LENGTH_LONG).show();
    }
}
