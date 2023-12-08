package com.example.event_invitation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.event_invitation.databinding.FragmentWelcomeBinding;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import com.example.event_invitation.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // create top toolbar
        MaterialToolbar materialToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(materialToolbar);
        materialToolbar.setBackgroundColor(Color.parseColor("#3c6e71"));

        // change toolbar font
        materialToolbar.setTitleTextAppearance(this, R.style.OpenSansTextApperanceReg);

        // change toolbar background color
        int titleTextColor = ContextCompat.getColor(this, R.color.white);
        materialToolbar.setTitleTextColor(titleTextColor);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();

        //create an “AppBarConfiguration” object
        AppBarConfiguration.Builder builder = new AppBarConfiguration.Builder(navController.getGraph());
        //builder.setOpenableLayout(binding.drawerLayout);
        // build
        AppBarConfiguration appBarConfiguration = builder.build();

        NavigationUI.setupWithNavController(binding.navView, navController);
        // create bottom navbar
        NavigationUI.setupWithNavController(binding.bottomNav, navController);

        //link “AppBarConfiguration” to the toolbar
        NavigationUI.setupWithNavController(materialToolbar, navController,appBarConfiguration);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        // call superclass method to handle menu creation
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // if selected item matches a valid navigation destination, it will navigate to that destination
        // call superclass method if navigation destination does not match
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.onNavDestinationSelected(item, navController) || super.onOptionsItemSelected(item);
    }
}