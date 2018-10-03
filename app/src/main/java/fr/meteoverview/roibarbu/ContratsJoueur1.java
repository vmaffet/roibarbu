package fr.meteoverview.roibarbu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContratsJoueur1 extends Activity {

    protected static int phase= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrats_joueur1);

        Button reussite = (Button) findViewById(R.id.BoutonReussite);
        reussite.setVisibility(View.GONE);

        Button sal= (Button) findViewById(R.id.BoutonSalade);
        sal.setVisibility(View.GONE);

        ScoresFragment sF= (ScoresFragment) getFragmentManager().findFragmentById(R.id.FragmentScores);
        sF.mettreEnPlace();

        SharedPreferences sharedPref= getSharedPreferences("information roi barbu", Context.MODE_PRIVATE);

        TextView JoueurCourant= (TextView) findViewById(R.id.JoueurCourant);
        JoueurCourant.setText(sharedPref.getString("NomJoueur1", "Pedro problemo"));
    }

    public void bouCo (View v) {
        Button bCo= (Button) findViewById(R.id.BoutonSansCoeurs);
        bCo.setEnabled(false);

        phase++;

        Intent i= new Intent(this, EntreeDesScores.class);
        i.putExtra("indent", 5);
        startActivity(i);
    }

    public void bouPl (View v) {
        Button bPl= (Button) findViewById(R.id.BoutonSansPlis);
        bPl.setEnabled(false);

        phase++;

        Intent i= new Intent(this, EntreeDesScores.class);
        i.putExtra("indent", 5);
        startActivity(i);
    }

    public void bouDa (View v) {
        Button bDa= (Button) findViewById(R.id.BoutonSansDames);
        bDa.setEnabled(false);

        phase++;

        Intent i= new Intent(this, EntreeDesScores.class);
        i.putExtra("indent", 10);
        startActivity(i);
    }

    public void bouRoCo (View v) {
        Button bRo= (Button) findViewById(R.id.BoutonSansRoiCoeur);
        bRo.setEnabled(false);

        phase++;

        Intent i= new Intent(this, EntreeDesScores.class);
        i.putExtra("indent", 40);
        startActivity(i);
    }

    public void reussite (View v) {
        phase++;

        Intent i= new Intent(this, ScoresReussite.class);
        startActivity(i);
    }

    public void salade (View v) {
        Intent i= new Intent(this, ScoresSalade.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_contrats_joueur1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ScoresFragment sF= (ScoresFragment) getFragmentManager().findFragmentById(R.id.FragmentScores);
        sF.mettreEnPlace();

        TextView JoueurCourant;
        Button reu;
        Button bCo;
        Button bPl;
        Button bDa;
        Button bRo;
        SharedPreferences sharedPref;

        switch (phase) {
            case 4:
                reu = (Button) findViewById(R.id.BoutonReussite);

                reu.setVisibility(View.VISIBLE);
                break;
            case 5:
                sharedPref= getSharedPreferences("information roi barbu", Context.MODE_PRIVATE);
                JoueurCourant= (TextView) findViewById(R.id.JoueurCourant);
                bCo= (Button) findViewById(R.id.BoutonSansCoeurs);
                bPl= (Button) findViewById(R.id.BoutonSansPlis);
                bDa= (Button) findViewById(R.id.BoutonSansDames);
                bRo= (Button) findViewById(R.id.BoutonSansRoiCoeur);
                reu = (Button) findViewById(R.id.BoutonReussite);

                JoueurCourant.setText(sharedPref.getString("NomJoueur2", "Pedro problemo"));
                reu.setVisibility(View.GONE);
                bCo.setEnabled(true);
                bPl.setEnabled(true);
                bDa.setEnabled(true);
                bRo.setEnabled(true);
                break;
            case 9:
                reu = (Button) findViewById(R.id.BoutonReussite);

                reu.setVisibility(View.VISIBLE);
                break;
            case 10:
                sharedPref= getSharedPreferences("information roi barbu", Context.MODE_PRIVATE);
                JoueurCourant= (TextView) findViewById(R.id.JoueurCourant);
                bCo= (Button) findViewById(R.id.BoutonSansCoeurs);
                bPl= (Button) findViewById(R.id.BoutonSansPlis);
                bDa= (Button) findViewById(R.id.BoutonSansDames);
                bRo= (Button) findViewById(R.id.BoutonSansRoiCoeur);
                reu = (Button) findViewById(R.id.BoutonReussite);

                JoueurCourant.setText(sharedPref.getString("NomJoueur3", "Pedro problemo"));
                reu.setVisibility(View.GONE);
                bCo.setEnabled(true);
                bPl.setEnabled(true);
                bDa.setEnabled(true);
                bRo.setEnabled(true);
                break;
            case 14:
                reu = (Button) findViewById(R.id.BoutonReussite);

                reu.setVisibility(View.VISIBLE);
                break;
            case 15:
                sharedPref= getSharedPreferences("information roi barbu", Context.MODE_PRIVATE);
                JoueurCourant= (TextView) findViewById(R.id.JoueurCourant);
                bCo= (Button) findViewById(R.id.BoutonSansCoeurs);
                bPl= (Button) findViewById(R.id.BoutonSansPlis);
                bDa= (Button) findViewById(R.id.BoutonSansDames);
                bRo= (Button) findViewById(R.id.BoutonSansRoiCoeur);
                reu = (Button) findViewById(R.id.BoutonReussite);

                JoueurCourant.setText(sharedPref.getString("NomJoueur4", "Pedro problemo"));
                reu.setVisibility(View.GONE);
                bCo.setEnabled(true);
                bPl.setEnabled(true);
                bDa.setEnabled(true);
                bRo.setEnabled(true);
                break;
            case 19:
                reu = (Button) findViewById(R.id.BoutonReussite);

                reu.setVisibility(View.VISIBLE);
                break;
            case 20:
                JoueurCourant= (TextView) findViewById(R.id.JoueurCourant);
                reu = (Button) findViewById(R.id.BoutonReussite);
                Button sal= (Button) findViewById(R.id.BoutonSalade);

                JoueurCourant.setText("Salade");
                reu.setVisibility(View.GONE);
                sal.setVisibility(View.VISIBLE);
                break;
            default:
                return;
        }
    }
}
