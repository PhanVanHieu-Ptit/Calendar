package com.example.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView txtTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTime = (TextView)  findViewById(R.id.textviewtime);

        // chon thu vien java.util
        Calendar calendar = Calendar.getInstance();

        txtTime.append(calendar.getTime()+"\n");
        txtTime.append(calendar.get(Calendar.DATE)+"\n");
        txtTime.append(calendar.get(Calendar.MONTH)+"\n");// thang khi goi mot minh no bi giam di 1, do bat dau tu 0
        txtTime.append(calendar.get(Calendar.YEAR)+"\n");

        SimpleDateFormat dinhDangNgay = new SimpleDateFormat("dd/MM/yyyy");// 12/08/2021
        txtTime.append(dinhDangNgay.format(calendar.getTime()) +"\n");

        txtTime.append(calendar.get(Calendar.HOUR)+"\n");
        txtTime.append(calendar.get(Calendar.HOUR_OF_DAY)+"\n");// dang 24 gio

        SimpleDateFormat dinhDangGio = new SimpleDateFormat("HH:mm:ss a");//19:40:30
        txtTime.append(dinhDangGio.format(calendar.getTime()));
    }
}