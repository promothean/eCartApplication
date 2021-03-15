package com.promothean.ecartapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.promothean.ecartapplication.addresses.AddressesActivity;
import com.promothean.ecartapplication.loginsignup.ChangePasswordActivity;
import com.promothean.ecartapplication.navfragments.CategoriesFragment;
import com.promothean.ecartapplication.navfragments.FavoriteFragment;
import com.promothean.ecartapplication.navfragments.HomeFragment;
import com.promothean.ecartapplication.navfragments.TrackOrderFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = "MainActivity";
    private Toolbar toolBar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolBar = findViewById(R.id.toolBar);
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        setSupportActionBar(toolBar);

        toolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        openFragment(new HomeFragment());
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.main_cart:
                startActivity(new Intent(MainActivity.this, CartActivity.class));
                break;
        }
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_home:
                drawerLayout.closeDrawer(GravityCompat.START);
                break;

            case R.id.menu_cart:
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(MainActivity.this, CartActivity.class));
                break;

            case R.id.menu_notifications:
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(MainActivity.this, NotificationsActivity.class));
                break;

            case R.id.menu_your_orders:
                drawerLayout.closeDrawer(GravityCompat.START);
                openFragment(new TrackOrderFragment());
                break;

            case R.id.menu_wallet_history:
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(MainActivity.this, WalletHistoryActivity.class));
                break;

            case R.id.menu_transaction_history:
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(MainActivity.this, TransactionHistoryActivity.class));
                break;

            case R.id.menu_change_password:
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(MainActivity.this, ChangePasswordActivity.class));
                break;

            case R.id.menu_manage_addresses:
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(MainActivity.this, AddressesActivity.class));
                break;

            case R.id.menu_refer_and_earn:
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(MainActivity.this, ReferandEarnActivity.class));
                break;

            case R.id.menu_contact_us:
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(MainActivity.this, ContactUsActivity.class));
                break;

            case R.id.menu_about_us:
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(MainActivity.this, AboutUsActivity.class));
                break;

            case R.id.menu_rate_us:
                drawerLayout.closeDrawer(GravityCompat.START);
                Toast.makeText(this, "Rate Us Dialog", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_share_app:
                drawerLayout.closeDrawer(GravityCompat.START);
                Toast.makeText(this, "Share App Dialog", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_faq:
                drawerLayout.closeDrawer(GravityCompat.START);
                Toast.makeText(this, "FAQ Web Page", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_terms_and_conditions:
                drawerLayout.closeDrawer(GravityCompat.START);
                Toast.makeText(this, "Terms & Conditions Web Page", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_privacy_policy:
                drawerLayout.closeDrawer(GravityCompat.START);
                Toast.makeText(this, "Privacy Policy Web Page", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_logout:
                drawerLayout.closeDrawer(GravityCompat.START);
                Toast.makeText(this, "Logout Dialog", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_home:
                openFragment(new HomeFragment());
                break;

            case R.id.nav_category:
                openFragment(new CategoriesFragment());
                break;

            case R.id.nav_favorites:
                openFragment(new FavoriteFragment());
                break;

            case R.id.nav_track_order:
                openFragment(new TrackOrderFragment());
                break;
        }
        return true;
    }

    private void openFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.layoutContainer, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}