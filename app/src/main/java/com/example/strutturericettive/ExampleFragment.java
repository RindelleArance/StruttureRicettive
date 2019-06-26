package com.example.strutturericettive;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class ExampleFragment extends Fragment
{
    MainActivity mainActivity;
    View view;
    ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fragment_layout_generico1, container, false);
        recuperaLayout();
        return view;
    }

    public void recuperaLayout()
    {
        imageView = view.findViewById(R.id.immagine);
        imageView.setBackgroundColor(Color.BLACK);
        imageView.setVisibility(View.GONE);
    }


    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);

        mainActivity = (MainActivity)context;

    }
}
