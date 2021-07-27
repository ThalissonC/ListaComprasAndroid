package br.com.listaCompras.api.retrofit;

import br.com.listaCompras.api.services.CompraService;
import okhttp3.OkHttpClient;
//import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {

    private Retrofit retrofit;

    public RetrofitConfig() {
//        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//        interceptor.level(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder().build();

        this.retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.15.10:8080/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


    }

    public CompraService setCompraService() {
        return this.retrofit.create(CompraService.class);

    }

}
