package mentorskill.demoInterfaces;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.SearchView;
        import android.widget.Toast;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {



    RecyclerView recyclerView;
    List<Game> gameList;
    RecyclerAdapter adapter;
    SearchView searchView;
    ImageView home,draw, audio,camara,listas,perfil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        searchView = (SearchView) findViewById(R.id.searchView);
        searchView.setQueryHint("busca una lista");

        recyclerView = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        initializeData();
        adapter = new RecyclerAdapter(gameList);
        recyclerView.setAdapter(adapter);

        // Action Buttons

//        home = (ImageView) findViewById(R.id.home);
//        home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,MainActivity.class));
//            }
//        });

        draw = (ImageView) findViewById(R.id.draw);
        draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,DrawActivity.class));
            }
        });

        audio = (ImageView) findViewById(R.id.audio);
        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SoundActivity.class));
            }
        });

        camara = (ImageView) findViewById(R.id.camera);
        camara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CameraActivity.class));
            }
        });

        listas = (ImageView) findViewById(R.id.lists);
        listas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ListsActivity.class));
            }
        });

        perfil = (ImageView) findViewById(R.id.profile);
        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ProfileActivity.class));
            }
        });

        // Action Search

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(getBaseContext(), query, Toast.LENGTH_LONG).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Toast.makeText(getBaseContext(), newText, Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }

    public void initializeData(){
        gameList = new ArrayList<>();
        gameList.add(new Game("Spell Out","VIEW",R.drawable.materialwallpaper,R.drawable.bt_like));
        gameList.add(new Game("Dominates Soccer","VIEW",R.drawable.materialwallpaper002,R.drawable.bt_like));
        gameList.add(new Game("Solar System","VIEW",R.drawable.materialwallpaper003,R.drawable.bt_like));
        gameList.add(new Game("The Human Body","VIEW",R.drawable.materialwallpaper,R.drawable.bt_like));
        gameList.add(new Game("Matching","VIEW",R.drawable.materialwallpaper002,R.drawable.bt_like));
        gameList.add(new Game("Colors","VIEW",R.drawable.materialwallpaper003,R.drawable.bt_like));
        gameList.add(new Game("Animals","VIEW",R.drawable.materialwallpaper,R.drawable.bt_like));
        gameList.add(new Game("Daily Activities","VIEW",R.drawable.materialwallpaper002,R.drawable.bt_like));
        gameList.add(new Game("Go Fishing","VIEW",R.drawable.materialwallpaper003,R.drawable.bt_like));
        gameList.add(new Game("Inside of House","VIEW",R.drawable.materialwallpaper,R.drawable.bt_like));
        gameList.add(new Game("Unscramble","VIEW",R.drawable.materialwallpaper002,R.drawable.bt_like));
        gameList.add(new Game("Figures Robots Picks Up","VIEW",R.drawable.materialwallpaper003,R.drawable.bt_like));
    }
}