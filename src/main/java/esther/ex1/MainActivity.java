package esther.ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.TextViewMain);
        et = (EditText) findViewById(R.id.EditTextMain);
        tv.setMovementMethod(new ScrollingMovementMethod());
    }

    public void buttonHandler(View view) {
        String st = et.getText().toString();
        tv.append("\n" + st);
        et.setText("");
    }
}
