package fr.meteoverview.roibarbu;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.String.*;

public class EntreeDesScores extends Activity {

    private int indent;
    private int sc1;
    private int sc2;
    private int sc3;
    private int sc4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entree_des_scores);

        Bundle data= getIntent().getExtras();
        if(data==null) {
            onDestroy();
        }
        indent= data.getInt("indent");

        sc1= 0;
        sc2= 0;
        sc3= 0;
        sc4= 0;

        SharedPreferences sharedPref= getSharedPreferences("information roi barbu", Context.MODE_PRIVATE);

        TextView j1= (TextView) findViewById(R.id.ScoreJ1);
        TextView j2= (TextView) findViewById(R.id.ScoreJ2);
        TextView j3= (TextView) findViewById(R.id.ScoreJ3);
        TextView j4= (TextView) findViewById(R.id.ScoreJ4);

        TextView s1= (TextView) findViewById(R.id.ScoreEnPlusJ1);
        TextView s2= (TextView) findViewById(R.id.ScoreEnPlusJ2);
        TextView s3= (TextView) findViewById(R.id.ScoreEnPlusJ3);
        TextView s4= (TextView) findViewById(R.id.ScoreEnPlusJ4);


        j1.setText(format("%s :  %d  +", sharedPref.getString("NomJoueur1", "Pedro problemo"), sharedPref.getInt("ScoreJoueur1", 0)));
        j2.setText(format("%s :  %d  +", sharedPref.getString("NomJoueur2", "Pedro problemo"), sharedPref.getInt("ScoreJoueur2", 0)));
        j3.setText(format("%s :  %d  +", sharedPref.getString("NomJoueur3", "Pedro problemo"), sharedPref.getInt("ScoreJoueur3", 0)));
        j4.setText(format("%s :  %d  +", sharedPref.getString("NomJoueur4", "Pedro problemo"), sharedPref.getInt("ScoreJoueur4", 0)));

        s1.setText(format("%02d", sc1));
        s2.setText(format("%02d", sc2));
        s3.setText(format("%02d", sc3));
        s4.setText(format("%02d", sc4));
    }

    public boolean totOk () {
        if (sc1+sc2+sc3+sc4 < 40) {
            return true;
        } else {
            return false;
        }
    }

    public void plus1 (View v) {
        if (sc1 < 40 && totOk()) {
            sc1 += indent;
            TextView s1= (TextView) findViewById(R.id.ScoreEnPlusJ1);
            s1.setText(format("%02d", sc1));
        }
    }

    public void plus2 (View v) {
        if (sc2 < 40 && totOk()) {
            sc2 += indent;
            TextView s2= (TextView) findViewById(R.id.ScoreEnPlusJ2);
            s2.setText(format("%02d", sc2));
        }
    }

    public void plus3 (View v) {
        if (sc3 < 40 && totOk()) {
            sc3 += indent;
            TextView s3= (TextView) findViewById(R.id.ScoreEnPlusJ3);
            s3.setText(format("%02d", sc3));
        }
    }

    public void plus4 (View v) {
        if (sc4 < 40 && totOk()) {
            sc4 += indent;
            TextView s4= (TextView) findViewById(R.id.ScoreEnPlusJ4);
            s4.setText(format("%02d", sc4));
        }
    }

    public void moins1 (View v) {
        if (sc1 > 0) {
            sc1 -= indent;
            TextView s1= (TextView) findViewById(R.id.ScoreEnPlusJ1);
            s1.setText(format("%02d", sc1));
        }
    }

    public void moins2 (View v) {
        if (sc2 > 0) {
            sc2 -= indent;
            TextView s2= (TextView) findViewById(R.id.ScoreEnPlusJ2);
            s2.setText(format("%02d", sc2));
        }
    }

    public void moins3 (View v) {
        if (sc3 > 0) {
            sc3 -= indent;
            TextView s3= (TextView) findViewById(R.id.ScoreEnPlusJ3);
            s3.setText(format("%02d", sc3));
        }
    }

    public void moins4 (View v) {
        if (sc4 > 0) {
            sc4 -= indent;
            TextView s4= (TextView) findViewById(R.id.ScoreEnPlusJ4);
            s4.setText(format("%02d", sc4));
        }
    }

    public void finir (View v) {
        if (sc1+sc2+sc3+sc4 == 40) {
            SharedPreferences sharedPref= getSharedPreferences("information roi barbu", Context.MODE_PRIVATE);
            SharedPreferences.Editor ed= sharedPref.edit();

            ed.putInt("ScoreJoueur1", sharedPref.getInt("ScoreJoueur1", 0)+sc1);
            ed.putInt("ScoreJoueur2", sharedPref.getInt("ScoreJoueur2", 0)+sc2);
            ed.putInt("ScoreJoueur3", sharedPref.getInt("ScoreJoueur3", 0)+sc3);
            ed.putInt("ScoreJoueur4", sharedPref.getInt("ScoreJoueur4", 0)+sc4);
            ed.apply();

            EntreeDesScores.this.finish();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_entree_des_scores, menu);
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
