package com.kun.jun.androiddesignsuportlibrary.TeInLa;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.kun.jun.androiddesignsuportlibrary.R;

public class TeInLaActivity extends AppCompatActivity {

    TextInputLayout errorInputLayout, customErrorInputLayout;
    TextInputEditText errorEditText, customErrorEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_te_in_la);

        errorEditText = (TextInputEditText) findViewById(R.id.errorEditText);
        errorInputLayout = (TextInputLayout) findViewById(R.id.errorInputLayout);
        customErrorEditText = (TextInputEditText) findViewById(R.id.customErrorEditText);
        customErrorInputLayout = (TextInputLayout) findViewById(R.id.customErrorInputLayout);

        errorEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s.length() > errorInputLayout.getCounterMaxLength())
                    errorInputLayout.setError("Max character length is " + errorInputLayout.getCounterMaxLength());
                else
                    errorInputLayout.setError(null);

            }
        });

        customErrorEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s.length() > customErrorInputLayout.getCounterMaxLength())
                    customErrorInputLayout.setError("Max character length is " + customErrorInputLayout.getCounterMaxLength());
                else
                    customErrorInputLayout.setError(null);

            }
        });

    }
}
