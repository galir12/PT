package com.ptroaapp.gali.ptroaapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.ptroaapp.gali.ptroaapp.DM.LawDetails;
import com.ptroaapp.gali.ptroaapp.Fragments.FragmentAbout;
import com.ptroaapp.gali.ptroaapp.Fragments.FragmentLawDetails;
import com.ptroaapp.gali.ptroaapp.Fragments.FragmentHome;
import com.ptroaapp.gali.ptroaapp.Fragments.FragmentTermOfUse;
import com.ptroaapp.gali.ptroaapp.Fragments.FragmentUsage;
import com.ptroaapp.gali.ptroaapp.Fragments.LegalClarificationFragment;
import com.ptroaapp.gali.ptroaapp.Fragments.MainFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, ListAdapter.OnSelectedLawListener, MainFragment.OnHomeButtonListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        Fragment fragment = new MainFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fContainer, fragment).addToBackStack(null).commit();
        fragmentManager.executePendingTransactions();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                getSupportFragmentManager().popBackStackImmediate();
                getSupportFragmentManager().beginTransaction().commit();
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment = null;
        if (id == R.id.nav_main) {
            fragment = new MainFragment();
            fragment.onAttach(this);
        /*} else if (id == R.id.nav_about) {
            fragment = new FragmentAbout();
            fragment.onAttach(this);*/
        } else if (id == R.id.nav_legal_clarification) {
            fragment = new LegalClarificationFragment();
            fragment.onAttach(this);
        } else if (id == R.id.nav_term_of_use) {
            fragment = new FragmentTermOfUse();
            fragment.onAttach(this);

        } else if (id == R.id.nav_data_usage) {
            fragment = new FragmentUsage();
            fragment.onAttach(this);

        }
        //Toast.makeText(this, item.getTitle().toString(), Toast.LENGTH_SHORT);
        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fContainer, fragment)
                    .addToBackStack(null).commit();
            fragmentManager.executePendingTransactions();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onLawSelected(LawDetails law) {
        Fragment fragment = new FragmentLawDetails();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LawDetails", law);
        fragment.setArguments(bundle);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fContainer, fragment).addToBackStack(null).commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Fragment fragment = new FragmentHome();
        //FragmentManager fragmentManager = getSupportFragmentManager();
        //fragmentManager.beginTransaction().add(R.id.fContainer, fragment).addToBackStack(null).commit();
    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    public void onHomeButtonSelected(int btn) {

        Fragment fragment = null;
        if (btn == 0) {
            fragment = new FragmentHome();
        }
        else if(btn == 1){
            fragment = new FragmentAbout();
        }
        else if(btn == 2){
            fragment = new ReportForm();
        }
        if(fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().add(R.id.fContainer, fragment).addToBackStack(null).commit();
        }
    }
}
