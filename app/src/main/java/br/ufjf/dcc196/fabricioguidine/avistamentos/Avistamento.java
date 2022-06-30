package br.ufjf.dcc196.fabricioguidine.avistamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Avistamento {
    private String nome;
    private String especie;
    private Integer avistamento;

    public Avistamento(String nome, String especie, Integer avistamento) {
        this.nome = nome;
        this.especie = especie;
        this.avistamento = avistamento;
    }

    public Avistamento(String nome, String especie) {
        new Avistamento(nome, especie, 0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getAvistamento() {
        return avistamento;
    }

    public void setAvistamento(Integer avistamento) {
        this.avistamento = avistamento;
    }
}
