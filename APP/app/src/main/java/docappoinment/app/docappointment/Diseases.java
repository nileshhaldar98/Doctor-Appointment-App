package docappoinment.app.docappointment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Diseases extends AppCompatActivity {
TextView name,practice,location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases);
Button book=findViewById(R.id.bookappointment);
book.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(getApplicationContext(),BookAnAppointment.class);
        startActivity(intent);
    }
});
        name=findViewById(R.id.name);
        practice=findViewById(R.id.practice);
        location=findViewById(R.id.location);
        Intent i=getIntent();
        String n=i.getStringExtra("Name");
        String p=i.getStringExtra("Practice");
        String l=i.getStringExtra("Location");
        TextView name=findViewById(R.id.name);
        TextView practice=findViewById(R.id.practice);
        TextView location=findViewById(R.id.location);
        name.setText(n);
       practice.setText(p);
location.setText(l);

    }
}
