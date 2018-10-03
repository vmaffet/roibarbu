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

import static java.lang.String.format;

public class ScoresSalade extends Activity {

    private int pl1, pl2, pl3, pl4, co1, co2, co3, co4, da1, da2, da3, da4, ro1, ro2, ro3, ro4;
    private String n1, n2, n3, n4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores_salade);

        SharedPreferences sharedPref= getSharedPreferences("information roi barbu", Context.MODE_PRIVATE);

        TextView j1= (TextView) findViewById(R.id.AfficheJ1);
        TextView j2= (TextView) findViewById(R.id.AfficheJ2);
        TextView j3= (TextView) findViewById(R.id.AfficheJ3);
        TextView j4= (TextView) findViewById(R.id.AfficheJ4);

        n1= sharedPref.getString("NomJoueur1", "Pedro problemo");
        n2= sharedPref.getString("NomJoueur2", "Pedro problemo");
        n3= sharedPref.getString("NomJoueur3", "Pedro problemo");
        n4= sharedPref.getString("NomJoueur4", "Pedro problemo");

        j1.setText(format("%s :  + 0", n1));
        j2.setText(format("%s :  + 0", n2));
        j3.setText(format("%s :  + 0", n3));
        j4.setText(format("%s :  + 0", n4));

        pl1= 0;
        pl2= 0;
        pl3= 0;
        pl4= 0;
        co1= 0;
        co2= 0;
        co3= 0;
        co4= 0;
        da1= 0;
        da2= 0;
        da3= 0;
        da4= 0;
        ro1= 0;
        ro2= 0;
        ro3= 0;
        ro4= 0;

    }

    public void PlisPlusJ1 (View v) {
        if (pl1+pl2+pl3+pl4 < 8) {
            pl1++;
            TextView j1= (TextView) findViewById(R.id.AfficheJ1);
            TextView s1= (TextView) findViewById(R.id.nbPlisJ1);
            j1.setText(format("%s :  + %d", n1, pl1*5+co1*5+da1*10+ro1*40));
            s1.setText(format("%d", pl1));
        }
    }

    public void PlisPlusJ2 (View v) {
        if (pl1+pl2+pl3+pl4 < 8) {
            pl2++;
            TextView j1= (TextView) findViewById(R.id.AfficheJ2);
            TextView s1= (TextView) findViewById(R.id.nbPlisJ2);
            j1.setText(format("%s :  + %d", n2, pl2*5+co2*5+da2*10+ro2*40));
            s1.setText(format("%d", pl2));
        }
    }

    public void PlisPlusJ3 (View v) {
        if (pl1+pl2+pl3+pl4 < 8) {
            pl3++;
            TextView j1= (TextView) findViewById(R.id.AfficheJ3);
            TextView s1= (TextView) findViewById(R.id.nbPlisJ3);
            j1.setText(format("%s :  + %d", n3, pl3*5+co3*5+da3*10+ro3*40));
            s1.setText(format("%d", pl3));
        }
    }

    public void PlisPlusJ4 (View v) {
        if (pl1+pl2+pl3+pl4 < 8) {
            pl4++;
            TextView j1= (TextView) findViewById(R.id.AfficheJ4);
            TextView s1= (TextView) findViewById(R.id.nbPlisJ4);
            j1.setText(format("%s :  + %d", n4, pl1*5+co1*5+da4*10+ro4*40));
            s1.setText(format("%d", pl4));
        }
    }

    public void PlisMoinsJ1 (View v) {
        if (pl1 > 0) {
            pl1--;
            TextView j1= (TextView) findViewById(R.id.AfficheJ1);
            TextView s1= (TextView) findViewById(R.id.nbPlisJ1);
            j1.setText(format("%s :  + %d", n1, pl1*5+co1*5+da1*10+ro1*40));
            s1.setText(format("%d", pl1));
        }
    }

    public void PlisMoinsJ2 (View v) {
        if (pl2 > 0) {
            pl2--;
            TextView j1= (TextView) findViewById(R.id.AfficheJ2);
            TextView s1= (TextView) findViewById(R.id.nbPlisJ2);
            j1.setText(format("%s :  + %d", n2, pl2*5+co2*5+da2*10+ro2*40));
            s1.setText(format("%d", pl2));
        }
    }

    public void PlisMoinsJ3 (View v) {
        if (pl3 > 0) {
            pl3--;
            TextView j1= (TextView) findViewById(R.id.AfficheJ3);
            TextView s1= (TextView) findViewById(R.id.nbPlisJ3);
            j1.setText(format("%s :  + %d", n3, pl3*5+co3*5+da3*10+ro3*40));
            s1.setText(format("%d", pl3));
        }
    }

    public void PlisMoinsJ4 (View v) {
        if (pl4 > 0) {
            pl4--;
            TextView j1= (TextView) findViewById(R.id.AfficheJ4);
            TextView s1= (TextView) findViewById(R.id.nbPlisJ4);
            j1.setText(format("%s :  + %d", n4, pl1*5+co1*5+da4*10+ro4*40));
            s1.setText(format("%d", pl4));
        }
    }

    public void CoeursPlusJ1 (View v) {
        if (co1+co2+co3+co4 < 8) {
            co1++;
            TextView j1= (TextView) findViewById(R.id.AfficheJ1);
            TextView s1= (TextView) findViewById(R.id.nbCoeursJ1);
            j1.setText(format("%s :  + %d", n1, pl1*5+co1*5+da1*10+ro1*40));
            s1.setText(format("%d", co1));
        }
    }

    public void CoeursPlusJ2 (View v) {
        if (co1+co2+co3+co4 < 8) {
            co2++;
            TextView j1= (TextView) findViewById(R.id.AfficheJ2);
            TextView s1= (TextView) findViewById(R.id.nbCoeursJ2);
            j1.setText(format("%s :  + %d", n2, pl2*5+co2*5+da2*10+ro2*40));
            s1.setText(format("%d", co2));
        }
    }

    public void CoeursPlusJ3 (View v) {
        if (co1+co2+co3+co4 < 8) {
            co3++;
            TextView j1= (TextView) findViewById(R.id.AfficheJ3);
            TextView s1= (TextView) findViewById(R.id.nbCoeursJ3);
            j1.setText(format("%s :  + %d", n3, pl3*5+co3*5+da3*10+ro3*40));
            s1.setText(format("%d", co3));
        }
    }

    public void CoeursPlusJ4 (View v) {
        if (co1+co2+co3+co4 < 8) {
            co4++;
            TextView j1= (TextView) findViewById(R.id.AfficheJ4);
            TextView s1= (TextView) findViewById(R.id.nbCoeursJ4);
            j1.setText(format("%s :  + %d", n4, pl4*5+co4*5+da4*10+ro4*40));
            s1.setText(format("%d", co4));
        }
    }

    public void CoeursMoinsJ1 (View v) {
        if (co1 > 0) {
            co1--;
            TextView j1= (TextView) findViewById(R.id.AfficheJ1);
            TextView s1= (TextView) findViewById(R.id.nbCoeursJ1);
            j1.setText(format("%s :  + %d", n1, pl1*5+co1*5+da1*10+ro1*40));
            s1.setText(format("%d", co1));
        }
    }

    public void CoeursMoinsJ2 (View v) {
        if (co2 > 0) {
            co2--;
            TextView j1= (TextView) findViewById(R.id.AfficheJ2);
            TextView s1= (TextView) findViewById(R.id.nbCoeursJ2);
            j1.setText(format("%s :  + %d", n2, pl2*5+co2*5+da2*10+ro2*40));
            s1.setText(format("%d", co2));
        }
    }

    public void CoeursMoinsJ3 (View v) {
        if (co3 > 0) {
            co3--;
            TextView j1= (TextView) findViewById(R.id.AfficheJ3);
            TextView s1= (TextView) findViewById(R.id.nbCoeursJ3);
            j1.setText(format("%s :  + %d", n3, pl3*5+co3*5+da3*10+ro3*40));
            s1.setText(format("%d", co3));
        }
    }

    public void CoeursMoinsJ4 (View v) {
        if (co4 > 0) {
            co4--;
            TextView j1= (TextView) findViewById(R.id.AfficheJ4);
            TextView s1= (TextView) findViewById(R.id.nbCoeursJ4);
            j1.setText(format("%s :  + %d", n4, pl4*5+co4*5+da4*10+ro4*40));
            s1.setText(format("%d", co4));
        }
    }

    public void DamesPlusJ1 (View v) {
        if (da1+da2+da3+da4 < 4) {
            da1++;
            TextView j1= (TextView) findViewById(R.id.AfficheJ1);
            TextView s1= (TextView) findViewById(R.id.nbDamesJ1);
            j1.setText(format("%s :  + %d", n1, pl1*5+co1*5+da1*10+ro1*40));
            s1.setText(format("%d", da1));
        }
    }

    public void DamesPlusJ2 (View v) {
        if (da1+da2+da3+da4 < 4) {
            da2++;
            TextView j1= (TextView) findViewById(R.id.AfficheJ2);
            TextView s1= (TextView) findViewById(R.id.nbDamesJ2);
            j1.setText(format("%s :  + %d", n2, pl2*5+co2*5+da2*10+ro2*40));
            s1.setText(format("%d", da2));
        }
    }

    public void DamesPlusJ3 (View v) {
        if (da1+da2+da3+da4 < 4) {
            da3++;
            TextView j1= (TextView) findViewById(R.id.AfficheJ3);
            TextView s1= (TextView) findViewById(R.id.nbDamesJ3);
            j1.setText(format("%s :  + %d", n3, pl3*5+co3*5+da3*10+ro3*40));
            s1.setText(format("%d", da3));
        }
    }

    public void DamesPlusJ4 (View v) {
        if (da1+da2+da3+da4 < 4) {
            da4++;
            TextView j1= (TextView) findViewById(R.id.AfficheJ4);
            TextView s1= (TextView) findViewById(R.id.nbDamesJ4);
            j1.setText(format("%s :  + %d", n4, pl4*5+co4*5+da4*10+ro4*40));
            s1.setText(format("%d", da4));
        }
    }

    public void DamesMoinsJ1 (View v) {
        if (da1 > 0) {
            da1--;
            TextView j1= (TextView) findViewById(R.id.AfficheJ1);
            TextView s1= (TextView) findViewById(R.id.nbDamesJ1);
            j1.setText(format("%s :  + %d", n1, pl1*5+co1*5+da1*10+ro1*40));
            s1.setText(format("%d", da1));
        }
    }

    public void DamesMoinsJ2 (View v) {
        if (da2 > 0) {
            da2--;
            TextView j1= (TextView) findViewById(R.id.AfficheJ2);
            TextView s1= (TextView) findViewById(R.id.nbDamesJ2);
            j1.setText(format("%s :  + %d", n2, pl2*5+co2*5+da2*10+ro2*40));
            s1.setText(format("%d", da2));
        }
    }

    public void DamesMoinsJ3 (View v) {
        if (da3 > 0) {
            da3--;
            TextView j1= (TextView) findViewById(R.id.AfficheJ3);
            TextView s1= (TextView) findViewById(R.id.nbDamesJ3);
            j1.setText(format("%s :  + %d", n3, pl3*5+co3*5+da3*10+ro3*40));
            s1.setText(format("%d", da3));
        }
    }

    public void DamesMoinsJ4 (View v) {
        if (da4 > 0) {
            da4--;
            TextView j1= (TextView) findViewById(R.id.AfficheJ4);
            TextView s1= (TextView) findViewById(R.id.nbDamesJ4);
            j1.setText(format("%s :  + %d", n4, pl4*5+co4*5+da4*10+ro4*40));
            s1.setText(format("%d", da4));
        }
    }

    public void RoiPlusJ1 (View v) {
        if (ro1+ro2+ro3+ro4 < 1) {
            ro1++;
            TextView j1= (TextView) findViewById(R.id.AfficheJ1);
            TextView s1= (TextView) findViewById(R.id.nbRoiJ1);
            j1.setText(format("%s :  + %d", n1, pl1*5+co1*5+da1*10+ro1*40));
            s1.setText(format("%d", ro1));
        }
    }

    public void RoiPlusJ2 (View v) {
        if (ro1+ro2+ro3+ro4 < 1) {
            ro2++;
            TextView j1= (TextView) findViewById(R.id.AfficheJ2);
            TextView s1= (TextView) findViewById(R.id.nbRoiJ2);
            j1.setText(format("%s :  + %d", n2, pl2*5+co2*5+da2*10+ro2*40));
            s1.setText(format("%d", ro2));
        }
    }

    public void RoiPlusJ3 (View v) {
        if (ro1+ro2+ro3+ro4 < 1) {
            ro3++;
            TextView j1= (TextView) findViewById(R.id.AfficheJ3);
            TextView s1= (TextView) findViewById(R.id.nbRoiJ3);
            j1.setText(format("%s :  + %d", n3, pl3*5+co3*5+da3*10+ro3*40));
            s1.setText(format("%d", ro3));
        }
    }

    public void RoiPlusJ4 (View v) {
        if (ro1+ro2+ro3+ro4 < 1) {
            ro4++;
            TextView j1= (TextView) findViewById(R.id.AfficheJ4);
            TextView s1= (TextView) findViewById(R.id.nbRoiJ4);
            j1.setText(format("%s :  + %d", n4, pl4*5+co4*5+da4*10+ro4*40));
            s1.setText(format("%d", ro4));
        }
    }

    public void RoiMoinsJ1 (View v) {
        if (ro1 > 0) {
            ro1--;
            TextView j1= (TextView) findViewById(R.id.AfficheJ1);
            TextView s1= (TextView) findViewById(R.id.nbRoiJ1);
            j1.setText(format("%s :  + %d", n1, pl1*5+co1*5+da1*10+ro1*40));
            s1.setText(format("%d", ro1));
        }
    }

    public void RoiMoinsJ2 (View v) {
        if (ro2 > 0) {
            ro2--;
            TextView j1= (TextView) findViewById(R.id.AfficheJ2);
            TextView s1= (TextView) findViewById(R.id.nbRoiJ2);
            j1.setText(format("%s :  + %d", n2, pl2*5+co2*5+da2*10+ro2*40));
            s1.setText(format("%d", ro2));
        }
    }

    public void RoiMoinsJ3 (View v) {
        if (ro3 > 0) {
            ro3--;
            TextView j1= (TextView) findViewById(R.id.AfficheJ3);
            TextView s1= (TextView) findViewById(R.id.nbRoiJ3);
            j1.setText(format("%s :  + %d", n3, pl3*5+co3*5+da3*10+ro3*40));
            s1.setText(format("%d", ro3));
        }
    }

    public void RoiMoinsJ4 (View v) {
        if (ro4 > 0) {
            ro4--;
            TextView j1= (TextView) findViewById(R.id.AfficheJ4);
            TextView s1= (TextView) findViewById(R.id.nbRoiJ4);
            j1.setText(format("%s :  + %d", n4, pl4*5+co4*5+da4*10+ro4*40));
            s1.setText(format("%d", ro4));
        }
    }

    public void fin (View v) {
        if (((pl1 + pl2 + pl3 + pl4) == 8) && ((co1 + co2 + co3 + co4) == 8) && ((da1 + da2 + da3 + da4) == 4) && ((ro1 + ro2 + ro3 + ro4) == 1)) {
            SharedPreferences sharedPref= getSharedPreferences("information roi barbu", Context.MODE_PRIVATE);
            SharedPreferences.Editor edit= sharedPref.edit();

            edit.putInt("ScoreJoueur1", sharedPref.getInt("ScoreJoueur1", 0) + (pl1 * 5) + (co1 * 5) + (da1 * 10) + (ro1 * 40));
            edit.putInt("ScoreJoueur2", sharedPref.getInt("ScoreJoueur2", 0) + (pl2 * 5) + (co2 * 5) + (da2 * 10) + (ro2 * 40));
            edit.putInt("ScoreJoueur3", sharedPref.getInt("ScoreJoueur3", 0) + (pl3 * 5) + (co3 * 5) + (da3 * 10) + (ro3 * 40));
            edit.putInt("ScoreJoueur4", sharedPref.getInt("ScoreJoueur4", 0) + (pl4 * 5) + (co4 * 5) + (da4 * 10) + (ro4 * 40));
            edit.apply();

            Intent i= new Intent(this, Fin.class);
            startActivity(i);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scores_salade, menu);
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
