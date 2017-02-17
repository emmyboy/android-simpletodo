package com.codepath.emeka.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    int position;
    String editedata;
    EditText dataText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        position = getIntent().getIntExtra("position", -1);
        editedata = getIntent().getStringExtra("dataPayload");
        dataText = (EditText) findViewById(R.id.editItemText);
        dataText.setText(editedata);
    }

    public void onEditItem(View v) {
        Intent submitEdit = new Intent();

        submitEdit.putExtra("position", position);
        submitEdit.putExtra("dataPayload", dataText.getText().toString());

        setResult(RESULT_OK, submitEdit);
        finish();
    }
}
