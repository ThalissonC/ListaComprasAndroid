package br.com.listaCompras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import br.com.listaCompras.api.retrofit.RetrofitConfig;
import br.com.listaCompras.models.Compra;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView editNomeCompras;
    TextView editCategoriaCompras;
    TextView editQuantidadeCompras;
    TextView editValorCompras;
    TextView editDataCompras;


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




//        editNomeCompras.setVisibility(View.INVISIBLE);
//        editCategoriaCompras.setVisibility(View.INVISIBLE);
//        editQuantidadeCompras.setVisibility(View.INVISIBLE);
//        editValorCompras.setVisibility(View.INVISIBLE);
//        editDataCompras.setVisibility(View.INVISIBLE);


//



//        recebeText.setVisibility(View.INVISIBLE);

//        recebeText.setText(usuario.getUserName());

//        recebeText.setText(compra.getNome());

//        List<Usuario> usuario = Usuario.listAll(Usuario.class);
        Log.d("teste", "teste");

        Call<List<Compra>> call = new RetrofitConfig().setCompraService().listarAlimentos();
        call.enqueue(new Callback<List<Compra>>() {

            @Override
            public void onResponse(Call<List<Compra>> call, Response<List<Compra>> response) {

                List<Compra> comprasList = response.body();
                Log.d("teste", "teste");
            }

            @Override
            public void onFailure(Call<List<Compra>> call, Throwable t) {
                Log.d("teste", "teste");

            }
        });

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





//    public void adicionaAlimento (View view) {
//
//            TextView recebeEditNomeCompras = findViewById(R.id.editNomeCompras);
//            TextView recebeEditCategoriaCompras = findViewById(R.id.editCategoriaCompras);
//            TextView recebeEditQuantidadeCompras = findViewById(R.id.editQuantidadeCompras);
//            TextView recebeEditeditValorCompras = findViewById(R.id.editValorCompras);
//            TextView recebeEditDataCompras = findViewById(R.id.editDataCompras);
//
//            recebeEditNomeCompras.getText().toString();
//            recebeEditCategoriaCompras.getText().toString();
//            recebeEditQuantidadeCompras.getText().toString();
//            recebeEditeditValorCompras.getText().toString();
//            recebeEditeditValorCompras.getText().toString();
//            recebeEditDataCompras.getText().toString();
//
//            compra.setNome(recebeEditNomeCompras);
//            compra.setCategoria(recebeEditCategoriaCompras);
//            compra.setQuantidade(recebeEditQuantidadeCompras);
//            compra.setValorUnitario(recebeEditeditValorCompras);
//            compra.setData(recebeEditDataCompras);
//            compra.save();
//
//            List<Compra> compras = Compra.listAll(Compra.class);
//            Log.d("Adição", "adicionado com sucesso");
//        }

    @Override
    protected void onStart(){
        Log.d("CicloDeVida","onStart - a activity começou a executar");
//        setInvisible();
        super.onStart();

    }

    @Override
    protected void onResume(){
        Log.d("CicloDeVida","onResume - Estado de interação com a tela");

        super.onResume();
    }

    @Override
    protected void onPause(){
        Log.d("CicloDeVida","onPause - A Activity começou a encerrar");

        super.onPause();
    }

    @Override
    protected void onStop(){
        Log.d("CicloDeVida","onStop - A Activity Não está mais visivel");

        super.onStop();
    }

    @Override
    protected void onDestroy(){
        Log.d("CicloDeVida","onDestroy - A Activity foi destruida");


        super.onDestroy();
    }



//    String recebeEditNomeCompras = editNomeCompras.getText().toString();
//    String recebeEditCategoriaCompras = editCategoriaCompras.getText().toString();
//    String recebeEditQuantidadeCompras = editQuantidadeCompras.getText().toString();
//    String recebeEditValorCompras = editValorCompras.getText().toString();
//    String recebeEditDataCompras = editDataCompras.getText().toString();

    public String setInvisible() {


         return "TEXT VIEWS INVISIVEIS";
    }

    public void inicializandoComponentes(View view){


        TextView recebeEditNomeCompras = findViewById(R.id.editNomeCompras);
        TextView recebeEditCategoriaCompras = findViewById(R.id.editCategoriaCompras);
        TextView recebeEditQuantidadeCompras = findViewById(R.id.editQuantidadeCompras);
        TextView recebeEditValorCompras = findViewById(R.id.editValorCompras);
        TextView recebeEditDataCompras = findViewById(R.id.editDataCompras);

        recebeEditNomeCompras.getText().toString();
        recebeEditCategoriaCompras.getText().toString();
        recebeEditQuantidadeCompras.getText().toString();
        recebeEditValorCompras.getText().toString();
        recebeEditDataCompras.getText().toString();

        String novoNomeCompras = "Steak";
        recebeEditNomeCompras.setText(novoNomeCompras);

        String novoCategoriaCompras = "Alimento";
        recebeEditCategoriaCompras.setText(novoCategoriaCompras);

        String novoQuantidadeCompras = "1";
        recebeEditQuantidadeCompras.setText(novoQuantidadeCompras);

        String novoValorCompras = "8.90";
        recebeEditValorCompras.setText(novoValorCompras);

        String novoDataCompras = "06-06-21";
        recebeEditDataCompras.setText(novoDataCompras);

//        String novaMensagem = "teste";
//        recebeEditNomeCompras.setText(novaMensagem);
    }



}
