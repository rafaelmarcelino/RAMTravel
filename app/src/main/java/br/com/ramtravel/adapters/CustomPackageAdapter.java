package br.com.ramtravel.adapters;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.ramtravel.R;
import br.com.ramtravel.model.Package;

public class CustomPackageAdapter extends BaseAdapter {

    public static final String RESOURCE_TYPE_DRAWABLE = "drawable";
    private List<Package> packages;
    private Context context;

    public CustomPackageAdapter(List<Package> packages, Context context) {
        this.packages = packages;
        this.context = context;
    }

    @Override
    public int getCount() {
        return packages.size();
    }

    @Override
    public Object getItem(int position) {
        return packages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View createdView = toDoBindInformation(LayoutInflater.from(context).inflate(R.layout.item_package_list_view, parent, false), position);
        return createdView;
    }

    private View toDoBindInformation(View createdView, int position) {
        View updatedView = createdView;

        TextView tvNameOfCity = updatedView.findViewById(R.id.item_package_tv_name_place);
        tvNameOfCity.setText(packages.get(position).getNameOfCity());
        TextView tvQtyDays = updatedView.findViewById(R.id.item_package_tv_qty_days);
        tvQtyDays.setText(packages.get(position).getQtyDays() + " days");
        TextView tvPrice = updatedView.findViewById(R.id.item_package_tv_price);
        tvPrice.setText("U$" + packages.get(position).getValueOfPackage().toString());

        ImageView ivPlaces = updatedView.findViewById(R.id.item_package_iv_places);
        int identifier = context.getResources().getIdentifier(packages.get(position).getImagePlace(), RESOURCE_TYPE_DRAWABLE, context.getPackageName());
        ivPlaces.setImageDrawable(context.getResources().getDrawable(identifier));

        return updatedView;
    }
}
