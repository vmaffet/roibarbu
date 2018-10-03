package fr.meteoverview.roibarbu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.Map;
import java.util.Set;

public class EntreeDesNoms extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entree_des_noms);
    }

    public void commencerPartie(View v) {
        EditText j0= (EditText) findViewById(R.id.entreeJoueur0);
        EditText j1= (EditText) findViewById(R.id.entreeJoueur1);
        EditText j2= (EditText) findViewById(R.id.entreeJoueur2);
        EditText j3= (EditText) findViewById(R.id.entreeJoueur3);

        int x= (int)(Math.random()*4);
        int b=0;
        String[] tab= new String[4];
        for (int i= 0; i< 4; i++) {
            x= (int)(Math.random()*4);
            if (tab[x] == null) {
                switch (b) {
                    case 0:
                        tab[x]=j0.getText().toString();
                        break;
                    case 1:
                        tab[x]=j1.getText().toString();
                        break;
                    case 2:
                        tab[x]=j2.getText().toString();
                        break;
                    case 3:
                        tab[x]=j3.getText().toString();
                        break;
                    default:
                        break;
                }
                b++;
            } else {
                i--;
            }
        }

        SharedPreferences sharedPref= getSharedPreferences("information roi barbu", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed= sharedPref.edit();

        ed.putString("NomJoueur1", tab[0]);
        ed.putString("NomJoueur2", tab[1]);
        ed.putString("NomJoueur3", tab[2]);
        ed.putString("NomJoueur4", tab[3]);
        ed.putInt("ScoreJoueur1", 0);
        ed.putInt("ScoreJoueur2", 0);
        ed.putInt("ScoreJoueur3", 0);
        ed.putInt("ScoreJoueur4", 0);
        ed.putBoolean("SansCoeurs", true);
        ed.putBoolean("SansDames", true);
        ed.putBoolean("SansPlis", true);
        ed.putBoolean("SansRoiDeCoeur", true);
        ed.apply();

        Intent ient= new Intent(this, AffichageOrdre.class);
        startActivity(ient);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_entree_des_noms, menu);
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
}
