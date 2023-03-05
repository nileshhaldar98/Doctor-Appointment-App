package docappoinment.app.docappointment;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class BookAnAppointment extends AppCompatActivity
{

EditText name ,address,addinfo;
String nam,adres,adinf;
    private TextInputEditText textInputEditTextEmail;
    private AppCompatButton appCompatButtonRegister;
    Button confirm;
    private int mYear, mMonth, mDay, mHour, mMinute;
    EditText txtDate, txtTime;
String string;
TextInputEditText tn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_an_appointment);
        appCompatButtonRegister = findViewById(R.id.enterdate);
txtDate=findViewById(R.id.text);
name=findViewById(R.id.name);
address=findViewById(R.id.address);
addinfo=findViewById(R.id.addiinfo);
confirm=findViewById(R.id.confirmbook);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),ConfirmBooking.class);
                intent.putExtra("Name",name.getText().toString());
                intent.putExtra("Address",address.getText().toString());
                startActivity(intent);
            }
        });
        appCompatButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar c = Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDay = c.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog datePickerDialog = new DatePickerDialog(BookAnAppointment.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();


            }
        });

}
    }
