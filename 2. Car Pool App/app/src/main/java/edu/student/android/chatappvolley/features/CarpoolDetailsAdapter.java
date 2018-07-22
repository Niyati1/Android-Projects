package edu.student.android.chatappvolley.features;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

import edu.student.android.chatappvolley.R;

import static android.R.attr.resource;

/**
 * Created by Gaurav on 07-04-2017.
 */

class   CarpoolDetailsAdapter extends ArrayAdapter<Carpool> {
    public CarpoolDetailsAdapter(Context context, ArrayList<Carpool> resource) {
        super(context,0,resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_view_your_carpool, parent, false);
        }
        Carpool carpool = getItem(position);
        TextView id = (TextView) listItemView.findViewById(R.id.ride_id);
        id.setText(carpool.getId());
        TextView carpoolDate=(TextView) listItemView.findViewById(R.id.date);
        carpoolDate.setText(carpool.getDate());
        TextView flag=(TextView) listItemView.findViewById(R.id.flag);
        flag.setText("Has Riders: " + carpool.isRiderExist());
        TextView sloc=(TextView) listItemView.findViewById(R.id.sourceLocation);
        sloc.setText(carpool.getSlocation());
        TextView dloc=(TextView) listItemView.findViewById(R.id.destinationLocation);
        dloc.setText(carpool.getDlocation());
        TextView slat = (TextView) listItemView.findViewById(R.id.slat);
        slat.setText(""+carpool.getslat());
        TextView slong = (TextView) listItemView.findViewById(R.id.slong);
        slong.setText(""+carpool.getslong());
        TextView dlat = (TextView) listItemView.findViewById(R.id.dlat);
        dlat.setText(""+carpool.getdlat());
        TextView dlong = (TextView) listItemView.findViewById(R.id.dlong);
        dlong.setText(""+carpool.getdlong());

        id.setVisibility(View.GONE);
       slat.setVisibility(View.GONE);
        slong.setVisibility(View.GONE);
        dlat.setVisibility(View.GONE);
        dlong.setVisibility(View.GONE);
        return listItemView;
    }
}
