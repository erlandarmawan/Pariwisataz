package uusbotak.pariwisata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List_Wisata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__wisata);
        String[] mobileArray = {"Cipanas", "Sanghyang Taraje", "Talaga Bodas", "Darajat", "Candi Cangkuang", "Pantai Santolo"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_tampil_wisata, mobileArray);
        ListView listView = (ListView) findViewById(R.id.list_wisata);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent mIntent = new Intent(view.getContext(), cipanas.class);
                    startActivityForResult(mIntent, 0);
                } else if (position == 1) {
                    Intent mIntent = new Intent(view.getContext(), sanghyang_taraje.class);
                    startActivityForResult(mIntent, 1);
                } else if (position == 2) {
                    Intent mIntent = new Intent(view.getContext(), talaga_bodas.class);
                    startActivityForResult(mIntent, 2);
                } else if (position == 3) {
                    Intent mIntent = new Intent(view.getContext(), darajat.class);
                    startActivityForResult(mIntent, 3);
                } else if (position == 4) {
                    Intent mIntent = new Intent(view.getContext(), candi_cangkuang.class);
                    startActivityForResult(mIntent, 4);
                } else if (position == 5) {
                    Intent mIntent = new Intent(view.getContext(), pantai_santolo.class);
                    startActivityForResult(mIntent, 5);
                }



            }
        });
    }
}

