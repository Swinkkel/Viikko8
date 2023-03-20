package htt.viikko8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1Input;
    private EditText number2Input;
    private Button plusButton;
    private Button minusButton;
    private Button multiplyButton;
    private Button divideButton;
    private TextView resultOutput1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Input = findViewById(R.id.number1);
        number2Input = findViewById(R.id.number2);
        plusButton = findViewById(R.id.plusButton);
        minusButton = findViewById(R.id.minusButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);
        resultOutput1 = findViewById(R.id.resultView);
    }

    public void onPlusButton(View view) {
        double number1 = Double.parseDouble(number1Input.getText().toString());
        double number2 = Double.parseDouble(number2Input.getText().toString());

        double result = number1 + number2;

        resultOutput1.setText(String.valueOf(result));
    }

    public void onMinusButton(View view) {
        double number1 = Double.parseDouble(number1Input.getText().toString());
        double number2 = Double.parseDouble(number2Input.getText().toString());

        double result = number1 - number2;

        resultOutput1.setText(String.valueOf(result));
    }

    public void onMultiplyButton(View view) {
        double number1 = Double.parseDouble(number1Input.getText().toString());
        double number2 = Double.parseDouble(number2Input.getText().toString());

        double result = number1 * number2;

        resultOutput1.setText(String.valueOf(result));
    }

    public void onDivideButton(View view) {
        double number1 = Double.parseDouble(number1Input.getText().toString());
        double number2 = Double.parseDouble(number2Input.getText().toString());

        double result = number1 / number2;

        resultOutput1.setText(String.valueOf(result));
    }

}