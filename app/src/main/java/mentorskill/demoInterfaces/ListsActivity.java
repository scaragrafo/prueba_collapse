package mentorskill.demoInterfaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ListsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);

        Toolbar listas_toolbar = (Toolbar) findViewById(R.id.listas_toolbar);
        setSupportActionBar(listas_toolbar);

        TextView btcamara = (TextView) findViewById(R.id.txtlistas);
        btcamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ListsActivity.this,MainActivity.class));
            }
        });

    }
}
