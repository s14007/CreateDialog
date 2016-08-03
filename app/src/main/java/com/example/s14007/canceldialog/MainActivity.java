package com.example.s14007.canceldialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = new EditText(MainActivity.this);
        editText.setHint("デフォルト値");

        final EditText editText1 = new EditText(MainActivity.this);
        editText1.setHint("デフォルト値");

        EditTextDialog dialogFragment = new EditTextDialog();
        dialogFragment.setCancelable(false);
//        dialogFragment.show(getFragmentManager(), "dialog_fragment");

        new AlertDialog.Builder(this)
                .setTitle("title")
                .setMessage("message")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.e("Log :", "pushed!");
                    }
                })
                .show();

    }
}
