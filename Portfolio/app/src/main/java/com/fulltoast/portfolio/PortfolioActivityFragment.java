package com.fulltoast.portfolio;

import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class PortfolioActivityFragment extends Fragment implements View.OnClickListener {

    public PortfolioActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_portfolio, container, false);
        view.findViewById(R.id.btn_spotify_streamer).setOnClickListener(this);
        view.findViewById(R.id.btn_scores_app).setOnClickListener(this);
        view.findViewById(R.id.btn_library_app).setOnClickListener(this);
        view.findViewById(R.id.btn_build_it_bigger).setOnClickListener(this);
        view.findViewById(R.id.btn_xyz_reader).setOnClickListener(this);
        view.findViewById(R.id.btn_capstone).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        View fragmentView = getView();
        switch(v.getId()){
           case R.id.btn_spotify_streamer:
               Snackbar.make(fragmentView, R.string.spotify_streamer_desc, Snackbar.LENGTH_SHORT).show();
               break;
           case R.id.btn_scores_app:
               Snackbar.make(fragmentView, R.string.scores_app_desc, Snackbar.LENGTH_SHORT).show();
               break;
           case R.id.btn_library_app:
               Snackbar.make(fragmentView, R.string.library_app_desc, Snackbar.LENGTH_SHORT).show();
               break;
           case R.id.btn_build_it_bigger:
               Snackbar.make(fragmentView, R.string.build_it_bigger_desc, Snackbar.LENGTH_SHORT).show();
               break;
           case R.id.btn_xyz_reader:
               Snackbar.make(fragmentView, R.string.xyz_reader_desc, Snackbar.LENGTH_SHORT).show();
               break;
           case R.id.btn_capstone:
               Snackbar.make(fragmentView, R.string.capstone_desc, Snackbar.LENGTH_SHORT).show();
               break;
       }
    }
}
