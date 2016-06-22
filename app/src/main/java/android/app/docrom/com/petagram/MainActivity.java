package android.app.docrom.com.petagram;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //private ImageView cincoEstrellas;

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //cincoEstrellas = (ImageView)v.findViewById(R.id.ivCincoEstrellas);

        toolbar = (Toolbar)findViewById(R.id.miActionBar);
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPager);

        //Toolbar miActionbar = (Toolbar) findViewById(R.id.miActionBar);
        //setSupportActionBar(miActionbar);
/*
        */
        agregarFAB();
        setUpViewPager();
        if(toolbar != null){
            setSupportActionBar(toolbar);
        }
    }

    public void agregarFAB(){
        FloatingActionButton miFAB = (FloatingActionButton) findViewById(R.id.fabCamara);
        miFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Foto",Toast.LENGTH_SHORT).show();
            }
        });
    }



    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new PrincipalFragment());
        fragments.add(new PerfilFragment());
        return fragments;
    }

    public void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_action_name);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_dog_icon);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.mAcercaDe:
                Intent intentAcercaDe = new Intent(this, AcercaDeActivity.class);
                startActivity(intentAcercaDe);
                break;
            case R.id.mContacto:
                Intent intentContacto = new Intent(this, ContactoActivity.class);
                startActivity(intentContacto);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void btnCincoEstrellas(View v){
        Intent intent = new Intent(v.getContext(), Main2Activity.class);
        startActivity(intent);
    }
}
