package pizza.lachgar.ma.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import pizza.lachgar.ma.hellotoast.R;

public class MainActivity extends AppCompatActivity {

    private TextView counterTextView;
    private Button toastButton;
    private Button countButton;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison des vues
        counterTextView = findViewById(R.id.counterTextView);
        toastButton = findViewById(R.id.toastButton);
        countButton = findViewById(R.id.countButton);

        // Action du bouton Toast
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Affiche un message Toast
                Toast.makeText(MainActivity.this, "Hello Toast!", Toast.LENGTH_SHORT).show();
            }
        });

        // Action du bouton Count
        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Incrémente le compteur
                counter++;
                // Met à jour l'affichage
                counterTextView.setText(String.valueOf(counter));
            }
        });
    }
}