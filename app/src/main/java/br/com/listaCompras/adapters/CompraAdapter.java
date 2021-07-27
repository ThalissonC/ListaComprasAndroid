package br.com.listaCompras.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;



import java.util.List;

import br.com.listaCompras.R;
import br.com.listaCompras.models.Compra;

public class CompraAdapter extends BaseAdapter {
    Context context;
    List<Compra> compras;
    private LayoutInflater mInflater;

    public CompraAdapter(Context context, List<Compra> compras) {
        this.context = context;
        this.compras = compras;
    }

    @Override
    public int getCount() {
        return compras.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        final Compra compra = compras.get(i);

        final CompraAdapter.ListContent holder;
        if (view == null) {
            mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = mInflater.inflate(R.layout.compra_it_lista, null);
            holder = new CompraAdapter.ListContent();
            holder.usuario_item_lista_nome = (TextView) view.findViewById(R.id.usuario_item_lista_nome);
            holder.usuario_item_lista_textview_estadoCivil = (TextView) view.findViewById(R.id.usuario_item_lista_textview_estadoCivil);
            holder.usuario_item_lista_button = (Button) view.findViewById(R.id.usuario_item_lista_button);


            view.setTag(holder);
        }
        else {
            holder = (CompraAdapter.ListContent) view.getTag();
        }

        holder.usuario_item_lista_nome.setText(compra.getNome());
        holder.usuario_item_lista_textview_estadoCivil.setText(String.valueOf(compra.getQuantidade()));
        holder.usuario_item_lista_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"teste",Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }


    public static class ListContent {
        TextView usuario_item_lista_nome,usuario_item_lista_textview_estadoCivil;
        Button usuario_item_lista_button;
    }
}