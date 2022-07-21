package br.ufjf.dcc196.fabricioguidine.avistamentos;

import android.content.Context;
import java.util.List;
import android.content.SharedPreferences;

import java.util.ArrayList;

public class AvistamentoRepository {
    private Context context;
    private SharedPreferences preferences;
    private List<Avistamento> avistamentos;
    private final String PREFERENCES_NAME = "avistamentos_preferences";

    public AvistamentoRepository(Context context){
        this.context = context;
        preferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
        avistamentos = new ArrayList<Avistamento>();
    }

    public void addAvistamento(Avistamento avistamento){
        avistamentos.add(avistamento);
    }

    public Avistamento getAvistamento(int position){
        return avistamentos.get(position);
    }

    public List<Avistamento> getAvistamentos(){
        return avistamentos;
    }

}
