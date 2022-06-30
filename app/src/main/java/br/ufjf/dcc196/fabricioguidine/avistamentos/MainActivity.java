package br.ufjf.dcc196.fabricioguidine.avistamentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerAvistamento;
    private AvistamentoAdapter avistamentoAdapter;
    List<Avistamento> avistamentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        avistamentos = new ArrayList<Avistamento>(){{
            add (new Avistamento("Bem-te-vi","Pitangus sulphuratus"));
            add (new Avistamento("Martim-pescador","Megaceryle torquata"));
            add (new Avistamento("João-de-barro", "Furnarius rufus"));
        }};

        recyclerAvistamento = findViewById(R.id.recyclerAvistamento);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerAvistamento.setLayoutManager(layoutManager);

        AvistamentoAdapter.OnAvistamentoCLickListener listener = new AvistamentoAdapter.OnAvistamentoCLickListener() {
            @Override
            public void onAvistamentoClick(View source, int position) {
                Avistamento avistamento = avistamentos.get(position);
                avistamento.setAvistamento(avistamento.getAvistamento()+1);
                avistamentoAdapter.notifyItemChanged(position);
            }
        };

        avistamentoAdapter = new AvistamentoAdapter(avistamentos,listener);
        recyclerAvistamento.setAdapter(avistamentoAdapter);
    }
}