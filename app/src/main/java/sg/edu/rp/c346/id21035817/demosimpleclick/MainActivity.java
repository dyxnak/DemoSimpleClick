package sg.edu.rp.c346.id21035817.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = etInput.getText().toString();
                int selectedId = rgGender.getCheckedRadioButtonId();

                if (selectedId == R.id.rbMale) {
                    // Write the code when male selected
                    tvDisplay.setText("Hi Mr, \n" + value);
                } else {
                    // Write the code when female selected
                    tvDisplay.setText("Hi Ms, \n" + value);
                }
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbtn.isChecked()) {
                    etInput.setEnabled(true);
                } else {
                    etInput.setEnabled(false);
                }
            }
        });
    }
}