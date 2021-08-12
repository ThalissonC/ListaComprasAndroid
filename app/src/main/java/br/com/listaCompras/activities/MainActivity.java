package br.com.listaCompras.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.listaCompras.R;
//import br.com.listaCompras.models.AtributosCompra;
import br.com.listaCompras.models.Compra;

import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {


    //Declara e recebe as variáveis

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.compras);

        Compra compra = new Compra();

        // ### Edit Texts dos campos para adição de um novo Item
        EditText indentificaNome = findViewById(R.id.editNomeCompras);
        EditText indentificaCategoria = findViewById(R.id.editCategoriaCompras);
        EditText indentificaQuantidade = findViewById(R.id.editQuantidadeCompras);
        EditText indentificaValor = findViewById(R.id.editValorCompras);
        EditText indentificaData = findViewById(R.id.editDataCompras);



//        ListView indentificaListaCompras = (ListView) findViewById(R.id.listaItensCompra);

        // ### Gera os dados dos campos de edição de texto da parte de adição de itens a lista de compras
        String nomeDigitado = indentificaNome.getText().toString();
        String categoriaDigitada = indentificaCategoria.getText().toString();
        String quantidadeDigitada = indentificaQuantidade.getText().toString();
        String valorDigitado = indentificaValor.getText().toString();
        String dataDigitada = indentificaData.getText().toString();

        // ### Text Views que recebem os textos adicionados
        TextView indentificaNomeLista = (TextView) findViewById(R.id.nomeCompras);
        TextView indentificaQtdLista = (TextView) findViewById(R.id.qtdCompras);
        TextView indentificaCategoriaLista = (TextView) findViewById(R.id.categoriaCompras);

        // ### Text Views que são os labels de cada item na lista
        TextView indentificaLabelNomeCompras = findViewById(R.id.labelNomeCompras);
        TextView indentificaLabelQuantidadeCompras = findViewById(R.id.labelQuantidadeCompras);
        TextView indentificaLabelCategoriaCompras = findViewById(R.id.labelCategoriaCompras);

        Button identificaBotaoFechar = findViewById(R.id.closeItemButton);

        // Exibir lista de intes ********
        Button listaButton = (Button) findViewById(R.id.exibirListaCompras);
        listaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button buttonExibirLista = findViewById(R.id.exibirListaCompras);

                indentificaNomeLista.setVisibility(VISIBLE);
                indentificaQtdLista.setVisibility(VISIBLE);
                indentificaCategoriaLista.setVisibility(VISIBLE);

                indentificaLabelNomeCompras.setVisibility(VISIBLE);
                indentificaLabelQuantidadeCompras.setVisibility(VISIBLE);
                indentificaLabelCategoriaCompras.setVisibility(VISIBLE);

                buttonExibirLista.setVisibility(View.GONE);

                indentificaNomeLista.setText(Compra.findById(Compra.class, 1).toString());
                indentificaQtdLista.setText(compra.getQuantidade());
                indentificaCategoriaLista.setText(compra.getCategoria());
//                Compra.find(Compra.class, "nome = ? and quantidade = ? and categoria = ?", compra.getNome(), compra.getQuantidade(), compra.getCategoria());


            }
        });

        // Exibir campos para adição de itens
        Button addButton = (Button) findViewById(R.id.addItemCompras);
        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                indentificaLabelNomeCompras.setVisibility(View.GONE);
                indentificaLabelQuantidadeCompras.setVisibility(View.GONE);
                indentificaLabelCategoriaCompras.setVisibility(View.GONE);

                indentificaNomeLista.setVisibility(View.GONE);
                indentificaQtdLista.setVisibility(View.GONE);
                indentificaCategoriaLista.setVisibility(View.GONE);

                EditText indentificaNome = findViewById(R.id.editNomeCompras);
                EditText indentificaCategoria = findViewById(R.id.editCategoriaCompras);
                EditText indentificaQuantidade = findViewById(R.id.editQuantidadeCompras);
                EditText indentificaValor = findViewById(R.id.editValorCompras);
                EditText indentificaData = findViewById(R.id.editDataCompras);
                Button indentificaButtonSalvar = findViewById(R.id.btComprasConfirmar);

                indentificaNome.setVisibility(VISIBLE);
                indentificaCategoria.setVisibility(VISIBLE);
                indentificaQuantidade.setVisibility(VISIBLE);
                indentificaValor.setVisibility(VISIBLE);
                indentificaData.setVisibility(VISIBLE);
                indentificaButtonSalvar.setVisibility(VISIBLE);
                identificaBotaoFechar.setVisibility(VISIBLE);

            }
        });

        // Ocultar campos para adição de itens
        Button closeButton = (Button) findViewById(R.id.closeItemButton);
        closeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                EditText indentificaNome = findViewById(R.id.editNomeCompras);
                EditText indentificaCategoria = findViewById(R.id.editCategoriaCompras);
                EditText indentificaQuantidade = findViewById(R.id.editQuantidadeCompras);
                EditText indentificaValor = findViewById(R.id.editValorCompras);
                EditText indentificaData = findViewById(R.id.editDataCompras);
                Button indentificaButtonSalvar = findViewById(R.id.btComprasConfirmar);

                indentificaNome.setVisibility(View.GONE);
                indentificaCategoria.setVisibility(View.GONE);
                indentificaQuantidade.setVisibility(View.GONE);
                indentificaValor.setVisibility(View.GONE);
                indentificaData.setVisibility(View.GONE);
                indentificaButtonSalvar.setVisibility(View.GONE);

                indentificaLabelNomeCompras.setVisibility(VISIBLE);
                indentificaLabelQuantidadeCompras.setVisibility(VISIBLE);
                indentificaLabelCategoriaCompras.setVisibility(VISIBLE);

                indentificaNomeLista.setVisibility(VISIBLE);
                indentificaQtdLista.setVisibility(VISIBLE);
                indentificaCategoriaLista.setVisibility(VISIBLE);
                identificaBotaoFechar.setVisibility(View.GONE);
            }
        });

        // Adicionar itens ao banco
        Button button = (Button) findViewById(R.id.btComprasConfirmar);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                compra.setNome(nomeDigitado);
                compra.setCategoria(categoriaDigitada);
                compra.setQuantidade(quantidadeDigitada);
                compra.setValorUnitario(valorDigitado);
                compra.setData(dataDigitada);
                compra.save();

                indentificaNomeLista.setVisibility(VISIBLE);
                indentificaQtdLista.setVisibility(VISIBLE);
                indentificaCategoriaLista.setVisibility(VISIBLE);

                indentificaNomeLista.setText(compra.getNome());
                indentificaQtdLista.setText(compra.getQuantidade());
                indentificaCategoriaLista.setText(compra.getCategoria());

//                List<Compra> compras = todasAsCompras();
//                ArrayAdapter<Compra> adapter = new ArrayAdapter<Compra>(this, android.R.layout.simple_list_item_1), comprasList;
//                indentificaListaCompras.setAdapter(adapter);



            }
        });

        List<Compra> compras = Compra.listAll(Compra.class);



//        Compra compra = Compra.findById(Compra.class, 1); - Detectar item no banco

//        Compra compra = Compra.findById(Compra.class, 3); - Deletar item do banco
//        compra.delete();


//
//        CLASSE
//
//        Compra compra = new Compra();
//        compra.setNome("Steak");
//        compra.setCategoria("Alimento");
//        compra.setQuantidade("1");
//        compra.setValor("9,90");
//        compra.setData("19-07-2021");
//        compra.save();

        Log.d("teste", "teste");

//        Call<List<Compra>> call = new RetrofitConfig().setCompraService().listarCompras();
//        call.enqueue(new Callback<List<Compra>>() {
//
//            @Override
//            public void onResponse(Call<List<Compra>> call, Response<List<Compra>> response) {
//
//                List<Compra> comprasList = response.body();
//                Log.d("teste", "teste");
//            }
//
//            @Override
//            public void onFailure(Call<List<Compra>> call, Throwable t) {
//                Log.d("teste", "teste");
//
//            }
//        });

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
//    private List<Compra> todasAsCompras() {
//        return new ArrayList<>(Arrays.asList(
//                new Compra(AtributosCompra.COMPRA)));
////                new Compra("HTML e CSS", "HTML 5 e suas novidades", AtributosCompra.COMPRA),
////                new Compra("Android", "boas práticas");
//    }
}
