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
import android.widget.TextView;

public class AffichageOrdre extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage_ordre);

        TextView t1= (TextView) findViewById(R.id.afficheJoueur1);
        TextView t2= (TextView) findViewById(R.id.afficheJoueur2);
        TextView t3= (TextView) findViewById(R.id.afficheJoueur3);
        TextView t4= (TextView) findViewById(R.id.afficheJoueur4);

        SharedPreferences sharedPref= getSharedPreferences("information roi barbu", Context.MODE_PRIVATE);

        t1.setText(sharedPref.getString("NomJoueur1", "Pedro"));
        t2.setText(sharedPref.getString("NomJoueur2", "Pedro"));
        t3.setText(sharedPref.getString("NomJoueur3", "Pedro"));
        t4.setText(sharedPref.getString("NomJoueur4", "Pedro"));
    }

    public void queLeJeuCommence (View v) {
        Intent i= new Intent(this, ContratsJoueur1.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_affichage_ordre, menu);
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
