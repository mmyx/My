package com.example.administrator.my_76;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Blank4Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_blank4, null);
        ImageView viewById = (ImageView) inflate.findViewById(R.id.imgage4);
        viewById.setImageResource(R.drawable.home_server_service);
        return inflate;
    }
}
