package docappoinment.app.docappointment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainPage extends AppCompatActivity  {

        String[] locations= {"Nagpur ", "Ahmadabad", "Kolkata", "Mumbai","Lucknow" ,"Pune"};
        String[] docname={"Dr. Rajesh Rathi","Dr. Piyush Kothari","Dr. Kavita Sharma (Hotwani)","Dr. Sheetal Mundhada (PT)",
                "Dr. Sunil Manekar","Dr. Krishna Sharma",};
        String[] practic={"MBBS","Cancer Specialist","Cardiologist","Dermatologist"
                ,"Dentist","BHMS"};


Button button1,button2,button3,button4,button5,button6;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main_page);



            final ArrayList<String> loc= new ArrayList<String>(Arrays.asList(locations));
            final ArrayList<String> doc_name= new ArrayList<String>(Arrays.asList(docname));
            final ArrayList<String> practice= new ArrayList<String>(Arrays.asList(practic));


                button1=findViewById(R.id.button1);
            button2=findViewById(R.id.button2);
            button3=findViewById(R.id.button3);
            button4=findViewById(R.id.button4);
            button5=findViewById(R.id.button5);
            button6=findViewById(R.id.button6);
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(getApplicationContext(),Diseases.class);
                        intent.putExtra("Name",doc_name.get(0));
                        intent.putExtra("Practice",practice.get(0));
                        intent.putExtra("Location",loc.get(0));

                        startActivity(intent);
                    }
                });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(getApplicationContext(),Diseases.class);
                    intent.putExtra("Name",doc_name.get(1));
                    intent.putExtra("Practice",practice.get(1));
                    intent.putExtra("Location",loc.get(1));

                    startActivity(intent);
                }
            });
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(getApplicationContext(),Diseases.class);
                    intent.putExtra("Name",doc_name.get(2));
                    intent.putExtra("Practice",practice.get(2));
                    intent.putExtra("Location",loc.get(2));

                    startActivity(intent);
                }
            });
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(getApplicationContext(),Diseases.class);
                    intent.putExtra("Name",doc_name.get(3));
                    intent.putExtra("Practice",practice.get(3));
                    intent.putExtra("Location",loc.get(3));

                    startActivity(intent);
                }
            });
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(getApplicationContext(),Diseases.class);
                    intent.putExtra("Name",doc_name.get(4));
                    intent.putExtra("Practice",practice.get(4));
                    intent.putExtra("Location",loc.get(4));

                    startActivity(intent);
                }
            });
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(getApplicationContext(),Diseases.class);
                    intent.putExtra("Name",doc_name.get(5));
                    intent.putExtra("Practice",practice.get(5));
                    intent.putExtra("Location",loc.get(5));

                    startActivity(intent);
                }
            });
        }
}