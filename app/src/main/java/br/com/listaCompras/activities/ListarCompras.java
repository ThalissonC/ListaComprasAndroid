package br.com.listaCompras.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import br.com.listaCompras.R;
import br.com.listaCompras.adapters.CompraAdapter;
import br.com.listaCompras.api.retrofit.RetrofitConfig;

import java.util.List;
import br.com.listaCompras.models.Compra;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListarCompras extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compra_lista);


        Call<List<Compra>> call = new RetrofitConfig().setCompraService().listarCompras();
        call.enqueue(new Callback<List<Compra>>() {
            @Override
            public void onResponse(Call<List<Compra>> call, Response<List<Compra>> response) {

                ListView listView = findViewById(R.id.usuario_lista_listview_lista);

                List<Compra> comprasList = response.body();
                Log.d("teste","teste");

                CompraAdapter adaptador = new CompraAdapter(ListarCompras.this,comprasList);
                listView.setAdapter(adaptador);

            }

            @Override
            public void onFailure(Call<List<Compra>> call, Throwable t) {
                Log.d("teste","teste");

            }


        });

    }

}
