package com.teja.apple.oakridgeinternationalschool;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

import com.teja.apple.oakridgeinternationalschool.Fragment.AboutUsFragment;
import com.teja.apple.oakridgeinternationalschool.Fragment.EventFragment;
import com.teja.apple.oakridgeinternationalschool.Fragment.GalleryFragment;
import com.teja.apple.oakridgeinternationalschool.Fragment.HomeNavigationFragment;
import com.teja.apple.oakridgeinternationalschool.Fragment.MapFragment;

import static com.teja.apple.oakridgeinternationalschool.NavigationActivity.replaceFragment;

public class NavigationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,FragmentManager.OnBackStackChangedListener {
    private static FragmentManager fragmentManager;

//    DrawerLayout drawer;
//    ActionBarDrawerToggle toggle;
//    private static Toolbar toolbar;
    private static final String TAG = NavigationActivity.class.getSimpleName();
    DrawerLayout drawer;
    ActionBarDrawerToggle toggle;
    private Button btnlogin;
    TextView pageTitle;
    private Button btnsignup;
    private static Toolbar toolbar;
    AutoCompleteTextView searchBox;
    private static final String APP_NAME = "com.amvapps.student.ittechies";
    private static NavigationActivity mMainActivity;
    boolean setHomeButtonEnabled;

    public static void replaceFragment(final Fragment newFragment, final String transactionTag,
                                       final String title, final boolean addToBackStack,
                                       final boolean drawerEnable, final boolean isFullScreen,
                                       final boolean isCartIconDisplayed) {
        if (newFragment != null && mMainActivity != null) {
            mMainActivity.setFragmentTitle(title);
            FragmentManager fragmentManager = mMainActivity.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            if (addToBackStack)
                fragmentTransaction.addToBackStack(transactionTag);
            fragmentTransaction.replace(R.id.s, newFragment, transactionTag);
            fragmentTransaction.commit();

        } else {
        }
    }

    public static void replaceFragment(Fragment fragment, String tag, boolean addToBackStack) {
        if (fragment != null && mMainActivity != null) {
            FragmentManager fragmentManager = mMainActivity.getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
            if (addToBackStack)
                transaction.addToBackStack(tag);
            transaction.replace(R.id.s, fragment, tag);
            transaction.commit();
        }
    }

    public static void setFragmentTitle(String title) {
        toolbar.setTitle(title);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        mMainActivity = this;
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        toggle.syncState();
        drawer.setDrawerListener(toggle);

        if (toolbar != null) {

            getSupportFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
                @Override
                public void onBackStackChanged() {
                    if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // show back button
                        drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
                        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                onBackPressed();
                            }
                        });
                    } else {
                        //show hamburger
                        drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);

                        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
                        toggle.syncState();
                        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                drawer.openDrawer(GravityCompat.START);
                            }
                        });
                    }
                }
            });

        }
        HomeNavigationFragment abc = new HomeNavigationFragment();
        replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), false);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.settings) {
            return true;
        }
        else if (id==R.id.search_bar){
            return true;
        }
        else if (id==R.id.title){
            return true;

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

            HomeNavigationFragment abc = new HomeNavigationFragment();
            replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), false);

            /*HomeNavigationFragment frg = new HomeNavigationFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.s, frg).commit();*/
        } else if (id == R.id.nav_about) {

            AboutUsFragment abc = new AboutUsFragment();
            replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), true);

//
       /*   AboutUsFragment frg = new AboutUsFragment();
          FragmentManager manager = getSupportFragmentManager();
           manager.beginTransaction().replace(R.id.s, frg).commit();
           */

        } else if (id == R.id.nav_faculty) {
//            CricketFragment frg = new CricketFragment();
//            FragmentManager manager = getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.s, frg).commit();


        } else if (id == R.id.nav_event) {
            EventFragment abc = new EventFragment();
            replaceFragment(abc,  NavigationActivity.class.getSimpleName(), true);




        } else if (id == R.id.nav_gallery) {
            GalleryFragment abc = new GalleryFragment();
            replaceFragment(abc,  NavigationActivity.class.getSimpleName(), true);

        } else if (id == R.id.nav_maps) {
            MapFragment abc = new  MapFragment();
            replaceFragment(abc,  NavigationActivity.class.getSimpleName(), true);

        } else if (id == R.id.nav_contaus) {
            ContactusFragment abc = new  ContactusFragment();
            replaceFragment(abc,  NavigationActivity.class.getSimpleName(), true);

        } else if (id == R.id.nav_share) {

            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType(NavigationDrawerConstants.SHARE_TEXT_TYPE);
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, NavigationDrawerConstants.SHARE_TITLE);
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, NavigationDrawerConstants.SHARE_MESSAGE);
            startActivity(Intent.createChooser(sharingIntent, NavigationDrawerConstants.SHARE_VIA));

        }else if (id == R.id.nav_view) {
            //Open URL on click of Visit Us
            Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(NavigationDrawerConstants.SITE_URL));
            startActivity(urlIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onBackStackChanged() {

    }
}
