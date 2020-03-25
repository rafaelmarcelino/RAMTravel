package br.com.ramtravel.adapters;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

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

        updateNameOfCity(position, updatedView);

        updateQtyOfDays(position, updatedView);

        updatePrice(position, updatedView);

        updateImage(position, updatedView);

        return updatedView;
    }

    private void updateImage(int position, View updatedView) {
        ImageView ivPlaces = updatedView.findViewById(R.id.item_package_iv_places);
        int identifier = context.getResources().getIdentifier(packages.get(position).getImagePlace(), RESOURCE_TYPE_DRAWABLE, context.getPackageName());
        ivPlaces.setImageDrawable(context.getResources().getDrawable(identifier));
    }

    private void updatePrice(int position, View updatedView) {
        TextView tvPrice = updatedView.findViewById(R.id.item_package_tv_price);
        NumberFormat currencyInstance = DecimalFormat.getCurrencyInstance(new Locale("en","us"));
        BigDecimal valueOfPackage = packages.get(position).getValueOfPackage();
        String formatedValue = currencyInstance.format(valueOfPackage).replace("$","$ ");
        tvPrice.setText(formatedValue);
    }

    private void updateQtyOfDays(int position, View updatedView) {
        TextView tvQtyDays = updatedView.findViewById(R.id.item_package_tv_qty_days);
        String formatedStrForDays = "";
        int qtyDays = packages.get(position).getQtyDays();
        if(qtyDays > 1){
            formatedStrForDays = qtyDays +  " days";
        }else{
            formatedStrForDays = qtyDays + " day";
        }
        tvQtyDays.setText(formatedStrForDays);
    }

    private void updateNameOfCity(int position, View updatedView) {
        TextView tvNameOfCity = updatedView.findViewById(R.id.item_package_tv_name_place);
        tvNameOfCity.setText(packages.get(position).getNameOfCity());
    }
}
