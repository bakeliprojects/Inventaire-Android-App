package com.inventaire2.inventaire2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Fal on 27/07/2017.
 */

public class Remplissage extends AppCompatActivity{

    public static final String EXTRA_MESSAGE = "com.inventaire2.inventaire2.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.inventaire2.inventaire2.MESSAGE2";
    public static final String EXTRA_MESSAGE3 = "com.inventaire2.inventaire2.MESSAGE3";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remplissage_add);

        /** Called when the user taps the Send button */
        Button btnSendSMS = (Button) findViewById(R.id.button);

        btnSendSMS.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

            Intent intent = new Intent(Remplissage.this, MainActivity.class);
            EditText editText = (EditText) findViewById(R.id.editText3);
            EditText editText2 = (EditText) findViewById(R.id.editText4);
                EditText editText3 = (EditText) findViewById(R.id.editText);
            String message = editText.getText().toString();
            int message2 = Integer.parseInt(editText2.getText()
                    .toString());
                int message3 = Integer.parseInt(editText3.getText()
                        .toString());
            intent.putExtra(EXTRA_MESSAGE, message);
            intent.putExtra(EXTRA_MESSAGE2, message2);
                intent.putExtra(EXTRA_MESSAGE3, message3);
            startActivity(intent);

        }

    });
}
}
