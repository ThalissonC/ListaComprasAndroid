package br.com.listaCompras.api.services;

import java.util.List;

import br.com.listaCompras.models.Compra;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface CompraService {
//    @POST("account/register/")
//    Call<Compra> registrar(@Body Compra compra);
//
//
//    @POST("account/login/")
//    Call<Compra> logar(@Body Compra compra);

    @GET("api/alimentos/")
    Call<List<Compra>> listarCompras();


}
