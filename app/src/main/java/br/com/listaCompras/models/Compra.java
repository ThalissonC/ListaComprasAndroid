package br.com.listaCompras.models;

import android.widget.TextView;

import com.orm.SugarRecord;

public class Compra extends SugarRecord {
    private TextView nome;
    private TextView categoria;
    private TextView quantidade;
    private TextView valor;
    private TextView data;

    public Compra() {

    };

    public TextView getNome() {
        return nome;
    }

    public void setNome(TextView nome) {
        this.nome = nome;
    }

    public TextView getCategoria() {
        return categoria;
    }

    public void setCategoria(TextView categoria) {
        this.categoria = categoria;
    }

    public TextView getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(TextView quantidade) {
        this.quantidade = quantidade;
    }

    public TextView getValor() {
        return valor;
    }

    public void setValor(TextView valor) {
        this.valor = valor;
    }

    public TextView getData() {
        return data;
    }

    public void setData(TextView data) {
        this.data = data;
    }
}
