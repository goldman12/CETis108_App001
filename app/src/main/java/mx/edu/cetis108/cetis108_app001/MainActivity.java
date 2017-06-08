package mx.edu.cetis108.cetis108_app001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et1;
    Button bt1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear);


        et1 = (EditText)findViewById(R.id.editText);
        bt1 = (Button)findViewById(R.id.button);
        tv1 = (TextView)findViewById(R.id.textView);
        bt1.setOnClickListener(this);


        }


    @Override
    public void onClick(View v) {
        String dato = et1.getText().toString();
        tv1.setText(dato);
    }
}
