package com.example.katalogolahraga;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"Persija","Persib bandung","Persebaya","Borneo","Persela","Arema","Persik","Persipura","Madura United"};
    String mDescription[] = {"Persija description", "Persib bandung description", "Persebaya description","Borneo description","Persela description","Arema description","Persik description","Persipura description","Madura United description"};
    int images[] = {R.drawable.persebaya,R.drawable.persipura,R.drawable.persipura,R.drawable.persipura,R.drawable.persebaya,R.drawable.persija,R.drawable.persija,R.drawable.persipura,R.drawable.persebaya};
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this,mTitle,mDescription,images);
        listView.setAdapter(adapter);
        

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Persija Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Persib Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Persebaya Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Borneo Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Persela Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Arema Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Persik Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Persipura Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Madura Description", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int Imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = Imgs;


        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);


            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);


            return row;

        }
    }
}