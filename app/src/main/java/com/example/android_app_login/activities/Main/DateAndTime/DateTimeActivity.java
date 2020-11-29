package com.example.android_app_login.activities.Main.DateAndTime;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.widget.EditText;

import com.example.android_app_login.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class DateTimeActivity extends AppCompatActivity {

    // Defining Variables Class
    EditText date_in;
    EditText time_in;
    EditText date_time_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);

        // Set toolbar title
        this.setTitle("DateTime Examples");

        // Set arrow back on top toolbar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // Assign variable to view elements (.xml)
        date_in = findViewById(R.id.date_input);
        time_in = findViewById(R.id.time_input);
        date_time_in = findViewById(R.id.date_time_input);

        // Set InputType
        date_time_in.setInputType(InputType.TYPE_NULL);
        time_in.setInputType(InputType.TYPE_NULL);
        date_in.setInputType(InputType.TYPE_NULL);

        // Show Dialog when click on TextView
        date_in.setOnClickListener(v -> showDateDialog(date_in));
        time_in.setOnClickListener(v -> showTimeDialog(time_in));
        date_time_in.setOnClickListener(v -> showDateTimeDialog(date_time_in));


    }

    private void showDateTimeDialog(final EditText date_time_in) {
        final Calendar calendar = Calendar.getInstance();
        DatePickerDialog.OnDateSetListener dateSetListener = (view, year, month, dayOfMonth) -> {
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month);
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

            TimePickerDialog.OnTimeSetListener timeSetListener = (vi, hourOfDay, minute) -> {
                calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
                calendar.set(Calendar.MINUTE, minute);

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                        "yy-MM-dd HH:mm");
                date_time_in.setText(simpleDateFormat.format(calendar.getTime()));
            };

            new TimePickerDialog(DateTimeActivity.this, timeSetListener,
                    calendar.get(Calendar.HOUR_OF_DAY),
                    calendar.get(Calendar.MINUTE),
                    false).show();
        };
        new DatePickerDialog(DateTimeActivity.this, dateSetListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)).show();
    }

    private void showTimeDialog(final EditText time_in) {

        final Calendar calendar = Calendar.getInstance();

        TimePickerDialog.OnTimeSetListener timeSetListener = (view, hourOfDay, minute) -> {
            calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
            calendar.set(Calendar.MINUTE, minute);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
            time_in.setText(simpleDateFormat.format(calendar.getTime()));
        };
        new TimePickerDialog(DateTimeActivity.this, timeSetListener,
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                false).show();
    }

    private void showDateDialog (final EditText date_in) {
        final Calendar calendar = Calendar.getInstance();
        DatePickerDialog.OnDateSetListener dateSetListener = (view, year, month, dayOfMonth) -> {
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month);
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd");
            date_in.setText(simpleDateFormat.format(calendar.getTime()));
        };
        new DatePickerDialog(DateTimeActivity.this, dateSetListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)).show();

    }
}