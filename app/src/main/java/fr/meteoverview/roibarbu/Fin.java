package fr.meteoverview.roibarbu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Fin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin);

        SharedPreferences sharedPref= getSharedPreferences("information roi barbu", Context.MODE_PRIVATE);

        ArrayList<Integer> liste= new ArrayList<Integer>();
        liste.add(sharedPref.getInt("ScoreJoueur1", 0));
        liste.add(sharedPref.getInt("ScoreJoueur2", 0));
        liste.add(sharedPref.getInt("ScoreJoueur3", 0));
        liste.add(sharedPref.getInt("ScoreJoueur4", 0));

        ArrayList<Integer> tab= new ArrayList<Integer>();
        int min= 0;
        for (int j= 0; j < 4; j++) {
            while(tab.contains(min)) {
                min++;
            }
            for (int i = 0; i < liste.size(); i++) {
                if (liste.get(i) <= liste.get(min) && !tab.contains(i)) {
                    min = i;
                }
            }
            tab.add(min);
            min= 0;
        }

        TextView t1= (TextView) findViewById(R.id.nom1er);
        TextView t2= (TextView) findViewById(R.id.nom2ieme);
        TextView t3= (TextView) findViewById(R.id.nom3ieme);
        TextView t4= (TextView) findViewById(R.id.nom4ieme);

        t1.setText(String.format("%s : %d", sharedPref.getString(String.format("NomJoueur%d", tab.get(0)+1), ""),
                                            sharedPref.getInt(String.format("ScoreJoueur%d", tab.get(0)+1), 0)));
        t2.setText(String.format("%s : %d", sharedPref.getString(String.format("NomJoueur%d", tab.get(1)+1), ""),
                                            sharedPref.getInt(String.format("ScoreJoueur%d", tab.get(1)+1), 0)));
        t3.setText(String.format("%s : %d", sharedPref.getString(String.format("NomJoueur%d", tab.get(2)+1), ""),
                                            sharedPref.getInt(String.format("ScoreJoueur%d", tab.get(2)+1), 0)));
        t4.setText(String.format("%s : %d", sharedPref.getString(String.format("NomJoueur%d", tab.get(3)+1), ""),
                                            sharedPref.getInt(String.format("ScoreJoueur%d", tab.get(3)+1), 0)));
    }

    public void rejouer (View v) {
        Intent i= new Intent(this, Demarrage.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fin, menu);
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
