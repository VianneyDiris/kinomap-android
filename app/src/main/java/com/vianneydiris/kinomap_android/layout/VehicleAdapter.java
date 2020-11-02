package com.vianneydiris.kinomap_android.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.vianneydiris.kinomap_android.R;
import com.vianneydiris.kinomap_android.model.Vehicle;

import java.util.List;

public class VehicleAdapter  extends ArrayAdapter<Vehicle> {

    public VehicleAdapter(Context context, List<Vehicle> vehicles) {
        super(context, 0, vehicles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_vehicle,parent, false);
        }

        VehicleViewHolder viewHolder = (VehicleViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new VehicleViewHolder();
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
         //   viewHolder.icon = (ImageView) convertView.findViewById(R.id.icon);
            convertView.setTag(viewHolder);
        }

        Vehicle vehicle = getItem(position);
        viewHolder.name.setText(vehicle.getName());
        //viewHolder.icon.setImageIcon(vehicle.getIcon().getUrl().getSize50x50());

        return convertView;
    }

    private class VehicleViewHolder{
        public TextView name;
     //   public ImageView icon;

    }
}