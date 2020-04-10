package com.example.trabalho1;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Fragment2 extends Fragment {
    private Button btnToque;
    private Spinner spinner;
    private MediaPlayer mediaPlayer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragmentfinal
        final View view = inflater.inflate(R.layout.fragment_2, null);
        TextView tv = view.findViewById(R.id.txtFrag2);
        btnToque = view.findViewById(R.id.btnTocarAlarme);
        spinner = view.findViewById(R.id.spinnToque);
        tv.setText("Fragmento 2");
        String toques[] = getResources().getStringArray(R.array.toques);


        ArrayAdapter<String> adapterSons = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_expandable_list_item_1, toques);
        spinner.setAdapter(adapterSons);

        btnToque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Passando por aqui");
                String toqueSelecionado = spinner.getSelectedItem().toString();

                if(mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }

                if(toqueSelecionado.equals("Toque 1")) {
                    mediaPlayer = MediaPlayer.create(view.getContext(),
                                    R.raw.digitalbell);
                    mediaPlayer.start();

                } else if (toqueSelecionado.equals("Toque 2")) {
                    mediaPlayer = MediaPlayer.create(view.getContext(),
                            R.raw.game_of_thrones);
                    mediaPlayer.start();

                } else if (toqueSelecionado.equals("Toque 3")) {
                    mediaPlayer = MediaPlayer.create(view.getContext(),
                            R.raw.magic_alarm_clock);
                    mediaPlayer.start();
                }

            }
        });



        return (view);
    }

    @Override
    public void onResume() {
        System.out.println("onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        System.out.println("OnPause");
        if(mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        super.onPause();
    }


}
