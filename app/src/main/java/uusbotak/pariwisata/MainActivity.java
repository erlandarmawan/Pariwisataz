package uusbotak.pariwisata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button wisata,Exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wisata= (Button) findViewById(R.id.pariwisata);
        Exit= (Button) findViewById(R.id.btnExit);


        wisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,List_Wisata.class);
                MainActivity.this.startActivity(intent);
            }
        });
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //perintah untuk mengakhiri aplikasi
                finish();
            }
        });

    }
}
