package com.example.codypollard.cwconstruction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        HomePageFragment.OnFragmentInteractionListener,
        OurWorkFragment.OnFragmentInteractionListener,
        ContactFragment.OnFragmentInteractionListener,
        QuoteFragment.OnFragmentInteractionListener,
        AboutFragment.OnFragmentInteractionListener,
        UpdatedContactFragment.OnFragmentInteractionListener,
        CreditFragment.OnFragmentInteractionListener{


    FragmentManager fm = getSupportFragmentManager();

    private static final String STORED_LANG = "stored_lang";
    private static final String DEFAULT_LANG = "default_lang";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadLanguage();
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.content, new HomePageFragment(), "Home");
        transaction.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void saveLanguage(String lang) {
        // save the current language
        SharedPreferences preferences = getSharedPreferences(STORED_LANG, MODE_PRIVATE);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putString(DEFAULT_LANG, lang);
        edit.apply();
        recreate();

    }

    private void loadLanguage() {
        //used to load language (method)
        Locale locale = new Locale(getLang());
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getResources().updateConfiguration(config, getResources().getDisplayMetrics());
    }

    private String getLang() {
        //get language (method)
        SharedPreferences pref = getSharedPreferences(STORED_LANG, MODE_PRIVATE);
        String langName = pref.getString(DEFAULT_LANG, "en");
        return langName;
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
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

        if (id == R.id.action_english){
            saveLanguage("en");
            return true;
        }

        if (id == R.id.action_french){
            saveLanguage("fr");
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentTransaction transaction = fm.beginTransaction();


        if (id == R.id.nav_home) {
            transaction.setCustomAnimations(R.anim.anim_in, R.anim.anim_out,
                                            R.anim.anim_back_in, R.anim.anim_back_out);
            transaction.replace(R.id.content, new HomePageFragment(), "Home");
            transaction.commit();
        } else if (id == R.id.nav_about) {
            transaction.setCustomAnimations(R.anim.anim_in, R.anim.anim_out,
                    R.anim.anim_back_in, R.anim.anim_back_out);
            transaction.replace(R.id.content, new AboutFragment(), "About");
            transaction.commit();
        } else if (id == R.id.nav_ourwork) {
            transaction.setCustomAnimations(R.anim.anim_in, R.anim.anim_out,
                    R.anim.anim_back_in, R.anim.anim_back_out);
            transaction.replace(R.id.content, new OurWorkFragment(), "Our Work");
            transaction.addToBackStack(null);
            transaction.commit();
        } else if (id == R.id.nav_quote) {
            transaction.setCustomAnimations(R.anim.anim_in, R.anim.anim_out,
                    R.anim.anim_back_in, R.anim.anim_back_out);
            transaction.replace(R.id.content, new QuoteFragment(), "Quote");
            transaction.commit();
        } else if (id == R.id.nav_contact) {
            transaction.setCustomAnimations(R.anim.anim_in, R.anim.anim_out,
                    R.anim.anim_back_in, R.anim.anim_back_out);
            transaction.replace(R.id.content, new UpdatedContactFragment(), "Contact");
            transaction.commit();
        }
        else if (id == R.id.nav_credits) {
            transaction.setCustomAnimations(R.anim.anim_in, R.anim.anim_out,
                    R.anim.anim_back_in, R.anim.anim_back_out);
            transaction.replace(R.id.content, new CreditFragment(), "Credits");
            transaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
