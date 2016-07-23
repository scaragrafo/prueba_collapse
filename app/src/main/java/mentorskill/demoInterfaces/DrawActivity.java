package mentorskill.demoInterfaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DrawActivity extends AppCompatActivity {

    TextView btdraw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);

        Toolbar draw_toolbar = (Toolbar) findViewById(R.id.draw_toolbar);
        setSupportActionBar(draw_toolbar);

        btdraw = (TextView) findViewById(R.id.txtDraw);
        btdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DrawActivity.this,MainActivity.class));
            }
        });

    }
}
