package br.com.ramtravel.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import br.com.ramtravel.R;
import br.com.ramtravel.adapters.CustomPackageAdapter;
import br.com.ramtravel.dao.PackageDAO;
import br.com.ramtravel.model.Package;

public class ListTripsActivity extends AppCompatActivity {

    private static final String LIST_TRIPS = "List Trips";
    private PackageDAO packageDAO;
    private List<Package>packages;
    private ListView listViewPackages;
    private CustomPackageAdapter customPackageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_trips);
        setTitle(LIST_TRIPS);
        initializeVariables();
    }

    private void initializeVariables() {
        packageDAO = new PackageDAO();
        packages = packageDAO.getAllPackagesAvailable();
        listViewPackages = findViewById(R.id.activity_list_trip_lv_packages);
        customPackageAdapter = new CustomPackageAdapter(packages,this);

        listViewPackages.setAdapter(customPackageAdapter);
    }
}
