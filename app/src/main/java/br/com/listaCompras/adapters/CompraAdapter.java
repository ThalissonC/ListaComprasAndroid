package br.com.listaCompras.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
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
            holder.compra_item_lista_nome = (TextView) view.findViewById(R.id.compra_item_lista_nome);
            holder.compra_item_lista_textview_quantidade = (TextView) view.findViewById(R.id.compra_item_lista_textview_quantidade);
            holder.compra_item_lista_textview_data = (TextView) view.findViewById(R.id.compra_item_lista_textview_data);


            view.setTag(holder);
        }
        else {
            holder = (CompraAdapter.ListContent) view.getTag();
        }

        holder.compra_item_lista_nome.setText(compra.getNome());
        holder.compra_item_lista_textview_quantidade.setText(compra.getQuantidade());
        holder.compra_item_lista_textview_data.setText(compra.getData());




        return view;
    }


    public static class ListContent {
        TextView compra_item_lista_nome,compra_item_lista_textview_quantidade, compra_item_lista_textview_data;
    }
}