package com.example.github_project_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btnSearch;
    private TextView txtResult;
    private Spinner spnBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSearch = findViewById(R.id.button);
        txtResult = findViewById(R.id.textView);
        spnBooks = findViewById(R.id.spinner2);
// this is comment
       btnSearch.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String cat = spnBooks.getSelectedItem().toString();
               txtResult.setText(cat);
               Database db = new Database();
               List<Book> result = db.getBooks(cat);
                String str ="";
                for(Book b: result){
                    str+=b.getTitle() + "\n";
                }
                txtResult.setText(str);
           }
       });




    }
}