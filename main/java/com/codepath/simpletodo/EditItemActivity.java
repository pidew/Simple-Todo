package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity

{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        setTitle("Edit");
        EditText editTextBox = (EditText) findViewById(R.id.editText);
        String editToText = getIntent().getStringExtra("text");
        editTextBox.setText(editToText);
        editTextBox.setSelection(editToText.length());
    }

    public void editSubmission(View v)
    {
        EditText editTextBox = (EditText)findViewById(R.id.editText);
        Intent datachange = new Intent();
        datachange.putExtra("newtext", editTextBox.getText().toString());
        datachange.putExtra("position", getIntent().getIntExtra("position", 0));
        setResult(RESULT_OK,datachange);
        finish();
    }
}
