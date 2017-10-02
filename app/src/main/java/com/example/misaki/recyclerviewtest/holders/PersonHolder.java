package com.example.misaki.recyclerviewtest.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.misaki.recyclerviewtest.R;

/**
 * Created by misaki on 10/2/17.
 */

public class PersonHolder extends RecyclerView.ViewHolder {

    public ImageView picture;
    public TextView fullname;
    public TextView email;

    public PersonHolder(View itemView) {
        super(itemView);

        picture=itemView.findViewById(R.id.picture_image);
        fullname=itemView.findViewById(R.id.fullname_text);
        email=itemView.findViewById(R.id.email_text);

    }
}
