package br.com.listaCompras.models;

import android.view.View;
import android.widget.TextView;

import com.orm.SugarRecord;

import org.w3c.dom.Text;

public class Usuario extends SugarRecord {
    private String userName;
    private String password;
    private String nome;
    private boolean estadoCivil;
    private String dataDeNascimento;


    public Usuario() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
