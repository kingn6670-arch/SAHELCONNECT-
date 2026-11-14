
package com.sahelconnect.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(30, 40, 30, 40);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("SAHEL CONNECT");
        title.setTextSize(30);
        title.setTextColor(Color.rgb(20, 55, 120));
        title.setGravity(Gravity.CENTER);
        title.setTypeface(null, 1);

        TextView slogan = new TextView(this);
        slogan.setText("Acheter, vendre, connecter.");
        slogan.setTextSize(18);
        slogan.setTextColor(Color.DKGRAY);
        slogan.setGravity(Gravity.CENTER);
        slogan.setPadding(0, 20, 0, 40);

        TextView welcome = new TextView(this);
        welcome.setText("Bienvenue sur SAHEL CONNECT !");
        welcome.setTextSize(20);
        welcome.setTextColor(Color.BLACK);
        welcome.setGravity(Gravity.CENTER);

        layout.addView(title);
        layout.addView(slogan);
        layout.addView(welcome);

        setContentView(layout);
    }
}
