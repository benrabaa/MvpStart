package com.example.mvpstart.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvpstart.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {
    private final MainContract.MvpPresenter presenter = new MainPresenter(this);

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.result);
        final EditText editText = findViewById(R.id.input);
        final Button button = findViewById(R.id.submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.showCorrectText(editText.getText().toString());
            }
        });
    }

    @Override
    public void renderGreaterThan100() {
        textView.setText("Greater than 100");
        Toast.makeText(getBaseContext(), "Greater than 100", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void renderResult(int result) {
        textView.setText("" + result);
    }
}
