package br.com.listaCompras.activities;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import br.com.listaCompras.R;
import br.com.listaCompras.api.retrofit.RetrofitConfig;
import br.com.listaCompras.models.Compra;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    //Declara e recebe as variáveis

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.compras);


        //CLASSE
//
//        Compra compra = new Compra();
//        compra.setNome("Steak");
//        compra.setCategoria("Alimento");
//        compra.setQuantidade("1");
//        compra.setValor("9,90");
//        compra.setData("19-07-2021");
//        compra.save();

        Log.d("teste", "teste");

        Call<List<Compra>> call = new RetrofitConfig().setCompraService().listarCompras();
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





    public String setInvisible() {


         return "TEXT VIEWS INVISIVEIS";
    }
}
