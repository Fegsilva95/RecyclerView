package br.ufjf.dcc196.fabricioguidine.avistamentos;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface AvistamentoDAO {
    @Insert
    void criar(Avistamento novoAvistamento);

}
