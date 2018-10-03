package fr.meteoverview.roibarbu;

import android.content.Context;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ScoresFragment extends Fragment {

    private static TextView s1;
    private static TextView s2;
    private static TextView s3;
    private static TextView s4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View v= inflater.inflate(R.layout.scores_fragment, container, false);
        return v;
    }

    public void mettreEnPlace () {
        SharedPreferences sharedPref= this.getActivity().getSharedPreferences("information roi barbu", Context.MODE_PRIVATE);

        TextView n1= (TextView) getView().findViewById(R.id.NomScoreJ1);
        TextView n2= (TextView) getView().findViewById(R.id.NomScoreJ2);
        TextView n3= (TextView) getView().findViewById(R.id.NomScoreJ3);
        TextView n4= (TextView) getView().findViewById(R.id.NomScoreJ4);

        n1.setText(sharedPref.getString("NomJoueur1", "Joueur 1"));
        n2.setText(String.format("   %s", sharedPref.getString("NomJoueur2", "Joueur 2")));
        n3.setText(sharedPref.getString("NomJoueur3", "Joueur 3"));
        n4.setText(String.format("   %s", sharedPref.getString("NomJoueur4", "Joueur 4")));

        s1 = (TextView) getView().findViewById(R.id.scoreJoueur1);
        s2 = (TextView) getView().findViewById(R.id.scoreJoueur2);
        s3 = (TextView) getView().findViewById(R.id.scoreJoueur3);
        s4 = (TextView) getView().findViewById(R.id.scoreJoueur4);

        majScores();
    }

    public void majScores () {
        SharedPreferences sharedPref= this.getActivity().getSharedPreferences("information roi barbu", Context.MODE_PRIVATE);

        s1.setText(String.format(" :  %3d   ", sharedPref.getInt("ScoreJoueur1", 0)));
        s2.setText(String.format(" :  %3d   ", sharedPref.getInt("ScoreJoueur2", 0)));
        s3.setText(String.format(" :  %3d ", sharedPref.getInt("ScoreJoueur3", 0)));
        s4.setText(String.format(" :  %3d ", sharedPref.getInt("ScoreJoueur4", 0)));

    }
}
