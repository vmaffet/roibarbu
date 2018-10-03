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

import static java.lang.String.format;

public class ScoresReussite extends Activity {

    private Button b401;
    private Button b402;
    private Button b403;
    private Button b404;
    private Button b201;
    private Button b202;
    private Button b203;
    private Button b204;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores_reussite);

        SharedPreferences sharedPref= getSharedPreferences("information roi barbu", Context.MODE_PRIVATE);

        TextView j1= (TextView) findViewById(R.id.ScoreJ1);
        TextView j2= (TextView) findViewById(R.id.ScoreJ2);
        TextView j3= (TextView) findViewById(R.id.ScoreJ3);
        TextView j4= (TextView) findViewById(R.id.ScoreJ4);

        j1.setText(format("%s :  %d  ", sharedPref.getString("NomJoueur1", "Pedro problemo"), sharedPref.getInt("ScoreJoueur1", 0)));
        j2.setText(format("%s :  %d  ", sharedPref.getString("NomJoueur2", "Pedro problemo"), sharedPref.getInt("ScoreJoueur2", 0)));
        j3.setText(format("%s :  %d  ", sharedPref.getString("NomJoueur3", "Pedro problemo"), sharedPref.getInt("ScoreJoueur3", 0)));
        j4.setText(format("%s :  %d  ", sharedPref.getString("NomJoueur4", "Pedro problemo"), sharedPref.getInt("ScoreJoueur4", 0)));

        b401= (Button) findViewById(R.id.b40J1);
        b402= (Button) findViewById(R.id.b40J2);
        b403= (Button) findViewById(R.id.b40J3);
        b404= (Button) findViewById(R.id.b40J4);

        b201= (Button) findViewById(R.id.b20J1);
        b202= (Button) findViewById(R.id.b20J2);
        b203= (Button) findViewById(R.id.b20J3);
        b204= (Button) findViewById(R.id.b20J4);
    }

    public void bouton40J1 (View v) {
        if (b201.isEnabled()) {
            if (!b404.isEnabled()) {
                b404.setEnabled(true);
                b401.setEnabled(false);
            } else if (!b402.isEnabled()) {
                b402.setEnabled(true);
                b401.setEnabled(false);
            } else if (!b403.isEnabled()) {
                b403.setEnabled(true);
                b401.setEnabled(false);
            } else {
                b401.setEnabled(false);
            }
        }
    }

    public void bouton40J2 (View v) {
        if (b202.isEnabled()) {
            if (!b404.isEnabled()) {
                b404.setEnabled(true);
                b402.setEnabled(false);
            } else if (!b401.isEnabled()) {
                b401.setEnabled(true);
                b402.setEnabled(false);
            } else if (!b403.isEnabled()) {
                b403.setEnabled(true);
                b402.setEnabled(false);
            } else {
                b402.setEnabled(false);
            }
        }
    }

    public void bouton40J3 (View v) {
        if (b203.isEnabled()) {
            if (!b404.isEnabled()) {
                b404.setEnabled(true);
                b403.setEnabled(false);
            } else if (!b401.isEnabled()) {
                b401.setEnabled(true);
                b403.setEnabled(false);
            } else if (!b402.isEnabled()) {
                b402.setEnabled(true);
                b403.setEnabled(false);
            } else {
                b403.setEnabled(false);
            }
        }
    }

    public void bouton40J4 (View v) {
        if (b204.isEnabled()) {
            if (!b402.isEnabled()) {
                b402.setEnabled(true);
                b404.setEnabled(false);
            } else if (!b401.isEnabled()) {
                b401.setEnabled(true);
                b404.setEnabled(false);
            } else if (!b403.isEnabled()) {
                b403.setEnabled(true);
                b404.setEnabled(false);
            } else {
                b404.setEnabled(false);
            }
        }
    }

    public void bouton20J1 (View v) {
        if (b401.isEnabled()) {
            if (!b202.isEnabled()) {
                b202.setEnabled(true);
                b201.setEnabled(false);
            } else if (!b203.isEnabled()) {
                b203.setEnabled(true);
                b201.setEnabled(false);
            } else if (!b204.isEnabled()) {
                b204.setEnabled(true);
                b201.setEnabled(false);
            } else {
                b201.setEnabled(false);
            }
        }
    }

    public void bouton20J2 (View v) {
        if (b402.isEnabled()) {
            if (!b201.isEnabled()) {
                b201.setEnabled(true);
                b202.setEnabled(false);
            } else if (!b203.isEnabled()) {
                b203.setEnabled(true);
                b202.setEnabled(false);
            } else if (!b204.isEnabled()) {
                b204.setEnabled(true);
                b202.setEnabled(false);
            } else {
                b202.setEnabled(false);
            }
        }
    }

    public void bouton20J3 (View v) {
        if (b403.isEnabled()) {
            if (!b202.isEnabled()) {
                b202.setEnabled(true);
                b203.setEnabled(false);
            } else if (!b201.isEnabled()) {
                b201.setEnabled(true);
                b203.setEnabled(false);
            } else if (!b204.isEnabled()) {
                b204.setEnabled(true);
                b203.setEnabled(false);
            } else {
                b203.setEnabled(false);
            }
        }
    }

    public void bouton20J4 (View v) {
        if (b404.isEnabled()) {
            if (!b202.isEnabled()) {
                b202.setEnabled(true);
                b204.setEnabled(false);
            } else if (!b203.isEnabled()) {
                b203.setEnabled(true);
                b204.setEnabled(false);
            } else if (!b201.isEnabled()) {
                b201.setEnabled(true);
                b204.setEnabled(false);
            } else {
                b204.setEnabled(false);
            }
        }
    }

    public void finir (View v) {
        if (!(b201.isEnabled() && b202.isEnabled() && b203.isEnabled() && b204.isEnabled()) && !(b401.isEnabled() && b402.isEnabled() && b403.isEnabled() && b404.isEnabled())) {
            SharedPreferences sharedPref= getSharedPreferences("information roi barbu", Context.MODE_PRIVATE);
            SharedPreferences.Editor ed= sharedPref.edit();

            if (b201.isEnabled()) {
                if (b202.isEnabled()) {
                    if (b203.isEnabled()) {
                        ed.putInt("ScoreJoueur4", sharedPref.getInt("ScoreJoueur4", 0) - 20);
                    } else {
                        ed.putInt("ScoreJoueur3", sharedPref.getInt("ScoreJoueur3", 0) - 20);
                    }
                } else {
                    ed.putInt("ScoreJoueur2", sharedPref.getInt("ScoreJoueur2", 0) - 20);
                }
            } else {
                ed.putInt("ScoreJoueur1", sharedPref.getInt("ScoreJoueur1", 0) - 20);
            }

            if (b401.isEnabled()) {
                if (b402.isEnabled()) {
                    if (b403.isEnabled()) {
                        ed.putInt("ScoreJoueur4", sharedPref.getInt("ScoreJoueur4", 0) - 40);
                    } else {
                        ed.putInt("ScoreJoueur3", sharedPref.getInt("ScoreJoueur3", 0) - 40);
                    }
                } else {
                    ed.putInt("ScoreJoueur2", sharedPref.getInt("ScoreJoueur2", 0) - 40);
                }
            } else {
                ed.putInt("ScoreJoueur1", sharedPref.getInt("ScoreJoueur1", 0) - 40);
            }
            ed.apply();
            ScoresReussite.this.finish();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scores_reussite, menu);
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
