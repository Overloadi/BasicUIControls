package fi.jokufirma.basicuicontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.SelectButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                RadioGroup rg = (RadioGroup) findViewById(R.id.firstRadioGroup);
                int id = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(id);
                String text = (String) rb.getText();
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
            }
        });
    }


}


