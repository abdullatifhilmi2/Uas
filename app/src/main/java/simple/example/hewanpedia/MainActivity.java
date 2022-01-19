package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnBurung,btnUlar,btnBuaya;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

        Button btnProfilKami = findViewById(R.id.btn_buka_profil);
        btnProfilKami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

    }

    private void inisialisasiView() {
        btnBurung = findViewById(R.id.btn_buka_ras_burung);
        btnUlar = findViewById(R.id.btn_buka_ras_ular);
        btnBuaya = findViewById(R.id.btn_buka_ras_buaya);
        btnBurung.setOnClickListener(view -> bukaGaleri("Burung"));
        btnUlar.setOnClickListener(view -> bukaGaleri("Ular"));
        btnBuaya.setOnClickListener(view -> bukaGaleri("Buaya"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity burung");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}