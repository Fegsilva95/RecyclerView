package br.ufjf.dcc196.fabricioguidine.avistamentos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface AvistamentoDAO {
    @Insert
    void criar(Avistamento novoAvistamento);

    @Query("SELECT * FROM Avistamento")
    List<Avistamento> listarTodos();

    @Query("SELECT * FROM AVISTAMENTO WHERE id=:id LIMIT 1")
    Avistamento buscaPorId(Long id);

    @Update
    void save(Avistamento avistamento);

    @Delete
    void exluir(Avistamento avistamento);
}
