package com.example.decalv2.ui.sucursales;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.decalv2.databinding.FragmentSucursalesBinding;

public class SucursalesFragment extends Fragment {

    private FragmentSucursalesBinding binding;
    private Button botonsuc1, botonsuc2, botonsuc3;


    public void createDialog(String titulo, String contenido){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(titulo);
        builder.setMessage(contenido)
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), "En breve uno de nuestros asesores le llamarĂ¡", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), "Estamos a su servicio", Toast.LENGTH_SHORT).show();
                    }
                }).show();

    }

    public SucursalesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding =FragmentSucursalesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        botonsuc1 = (Button) binding.botonsuc1;
        botonsuc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(), "Gracias por contactarnos", Toast.LENGTH_LONG ).show();
                createDialog("Mayor informaciĂ³n", "Â¿Desea recibir atenciĂ³n personalizada?");
            }
        });


        botonsuc2 = (Button) binding.botonsuc2;
        botonsuc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(), "Gracias por contactarnos", Toast.LENGTH_LONG ).show();
                createDialog("Mayor informaciĂ³n", "Â¿Desea recibir atenciĂ³n personalizada?");
            }
        });

        botonsuc3 = (Button) binding.botonsuc3;
        botonsuc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(), "Gracias por contactarnos", Toast.LENGTH_LONG ).show();
                createDialog("Mayor informaciĂ³n", "Â¿Desea recibir atenciĂ³n personalizada?");
            }
        });


        return root;
    }
}