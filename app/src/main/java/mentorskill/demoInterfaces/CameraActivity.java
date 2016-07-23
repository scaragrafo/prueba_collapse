package mentorskill.demoInterfaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        Toolbar draw_toolbar = (Toolbar) findViewById(R.id.draw_toolbar);
        setSupportActionBar(draw_toolbar);

        TextView btcamara = (TextView) findViewById(R.id.txtcamara);
        btcamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CameraActivity.this,MainActivity.class));
            }
        });

    }
}
