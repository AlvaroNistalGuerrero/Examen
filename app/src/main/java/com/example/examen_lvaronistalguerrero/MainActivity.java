package com.example.examen_lvaronistalguerrero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    BigInteger cont = BigInteger.ZERO;
    TextView tiempo;
    private int incremento = 1;
    private Button mbAñadir;
    private ListView mListV;
    private EditText mEditT;
    private TextView vT;
    private List<String> mLista = new ArrayList<>();
    private ArrayAdapter<String> mAdapter;
    List<MainActivity> records = new ArrayList<MainActivity>();
    int t ;
    String seg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tiempo = (TextView) findViewById(R.id.tiempo);
        //segundero();
        //añadeTexto();
//        RecyclerView rv = findViewById(R.id.ranking);
//        rv.setLayoutManager(new LinearLayoutManager(this));
//        rv.setAdapter(new RecordsAdapter(getApplicationContext(),records));
////        jugadores.add(new Jugador("Ash","984", R.drawable.ash));

    }
    public String añadeTexto() {
        String text = " ";
        if (cont.compareTo(BigInteger.valueOf(1000)) >= 0) {
            BigInteger mil = BigInteger.valueOf(1000);
            BigInteger cantidad = cont.divide(mil);
            text = cantidad + " K";
        }
        if (cont.compareTo(new BigInteger("1000000")) >= 0 && cont.compareTo(new BigInteger("99999999999")) <= 0) {     // Si no
            BigInteger Mill = new BigInteger("1000000");
            BigInteger cantidad_2 = cont.divide(Mill);
            text = cantidad_2 + " Mill";
        }
        if (cont.compareTo(new BigInteger("1000000000000")) >= 0) {
            BigInteger Bill = new BigInteger("1000000000000");
            BigInteger cantidad_3 = cont.divide(Bill);
            text = cantidad_3 + " Bill";

        } else {
            text = cont.toString();
        }
        tiempo.setText(text);
        return text;
    }
    public void segundero(View v) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Handler handler = new Handler(Looper.getMainLooper());
        executor.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                cont = cont.add(BigInteger.valueOf(incremento));

                handler.post(() -> {
                    tiempo.setText(añadeTexto());
                });
            }
        });
   }
//    public void stop(View v) throws InterruptedException {
//        if(R.id.jugar == RESULT_OK)
//        añadeTexto().wait();

    //}


//    public void Add(View view) {
//
//        if (view.getId() == R.id.apuntarRecord) {
//            String text = mEditT.getText().toString().trim();
//            mLista.add(text);
//            mEditT.getText().clear();
//            mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mLista);
//            mListV.setAdapter(mAdapter);
//        }
//    }

}