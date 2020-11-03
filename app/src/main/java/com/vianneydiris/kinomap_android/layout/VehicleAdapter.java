package com.vianneydiris.kinomap_android.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.vianneydiris.kinomap_android.R;
import com.vianneydiris.kinomap_android.model.Vehicle;

import java.util.List;

public class VehicleAdapter  extends ArrayAdapter<Vehicle> {
    private VehicleViewHolder viewHolder;

    public VehicleAdapter(Context context, List<Vehicle> vehicles) {
        super(context, 0, vehicles);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_vehicle,parent, false);
        }

        viewHolder = (VehicleViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new VehicleViewHolder();
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.icon = (ImageView) convertView.findViewById(R.id.icon);
            viewHolder.id = (TextView) convertView.findViewById(R.id.id);
            convertView.setTag(viewHolder);
        }

        Vehicle vehicle = getItem(position);
        viewHolder.name.setText(vehicle.getName());
        Picasso.get().load(vehicle.getIcon().getUrl().getSize50x50()).into(viewHolder.icon);

        VehicleViewHolder finalViewHolder = viewHolder;
        convertView.setOnClickListener(v -> {
            System.out.println(vehicle.getId());
            viewHolder.id.setText(Integer.toString(vehicle.getId()));
        });

        return convertView;
    }

    private class VehicleViewHolder{
        public TextView name;
        public ImageView icon;
        public TextView id;

    }

}