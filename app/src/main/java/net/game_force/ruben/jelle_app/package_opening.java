package net.game_force.ruben.jelle_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class package_opening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.package_opening);



        final ImageButton button = findViewById(R.id.imageButton2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent start = new Intent(getApplicationContext(), piano.class);
                startActivity(start);

            }
        });
    }
}
