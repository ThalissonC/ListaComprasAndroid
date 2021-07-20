package br.com.listaCompras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import br.com.listaCompras.models.Compra;

public class MainActivity extends AppCompatActivity {

    Compra compra = new Compra();

    //Declara e recebe as variáveis


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compras);

        //CLASSE
//        Usuario usuario = new Usuario();
//        Compra compra = new Compra();


//        usuario.setUserName("THALISSON");
//        usuario.setPassword("123456");
//        usuario.save();

//        compra.setNome("Steak");
//        compra.setCategoria("Alimento");
//        compra.setQuantidade("1");
//        compra.setValor("9,90");
//        compra.setData("19-07-2021");
//        compra.save();


//        List<Usuario> usuarios = Usuario.listAll(Usuario.class);
//        List<Compra> compras = Compra.listAll(Compra.class);
//        Usuario.findById(Usuario.class, 1);




//



//        recebeText.setVisibility(View.INVISIBLE);

//        recebeText.setText(usuario.getUserName());

//        recebeText.setText(compra.getNome());

//        List<Usuario> usuario = Usuario.listAll(Usuario.class);
        Log.d("teste", "teste");

    }

//    public String addAlimento (){
//
//        recebe_addNomeCompras.getText().toString();
//        recebe_addCategoriaCompras.getText().toString();
//        recebe_addQuantidadeCompras.getText().toString();
//        recebe_addValorCompras.getText().toString();
//        recebe_addDataCompras.getText().toString();
//
//        compra.setNome(recebe_addNomeCompras.toString());
//        recebe_addNomeCompras.setText(compra.getNome());
//
//
//
//
//        return "adicionado com sucesso";
//    }





    public void adicionaAlimento (View view) {

            TextView recebeEditNomeCompras = findViewById(R.id.editNomeCompras);
            TextView recebeEditCategoriaCompras = findViewById(R.id.editCategoriaCompras);
            TextView recebeEditQuantidadeCompras = findViewById(R.id.editQuantidadeCompras);
            TextView recebeEditeditValorCompras = findViewById(R.id.editValorCompras);
            TextView recebeEditDataCompras = findViewById(R.id.editDataCompras);

            recebeEditNomeCompras.getText().toString();
            recebeEditCategoriaCompras.getText().toString();
            recebeEditQuantidadeCompras.getText().toString();
            recebeEditeditValorCompras.getText().toString();
            recebeEditeditValorCompras.getText().toString();
            recebeEditDataCompras.getText().toString();

            compra.setNome(recebeEditNomeCompras);
            compra.setCategoria(recebeEditCategoriaCompras);
            compra.setQuantidade(recebeEditQuantidadeCompras);
            compra.setValor(recebeEditeditValorCompras);
            compra.setData(recebeEditDataCompras);
            compra.save();

            List<Compra> compras = Compra.listAll(Compra.class);
            Log.d("Adição", "adicionado com sucesso");
        }

}
