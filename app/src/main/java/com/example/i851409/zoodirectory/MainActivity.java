package com.example.i851409.zoodirectory;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;


//Class implementation for the Customized Adapter
public class MyCustomAdapter extends ArrayAdapter<String>{
    Context context;
    int images[];
    String tls[];
    MyCustomAdapter(Context c, String[] titles, int img[]){
        super(c, R.layout.customized_listview, R.id.textView2, titles);
        this.context = c;
        this.images = img;
        this.tls = titles;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.customized_listview, parent, false);

//Setting the background color of the row
        if(position%2==0) {
            row.setBackgroundColor(Color.LTGRAY);
        }
        else{
            row.setBackgroundColor(Color.DKGRAY);
        }

//Getting the reference to the TextView and the ImageView
        ImageView iv = (ImageView) row.findViewById(R.id.imageView);
        TextView tv = (TextView) row.findViewById(R.id.textView2);

//Populating the ImageView and the TextView with appropriate data
        iv.setImageResource(images[position]);
        tv.setText(tls[position]);

        return row;
    }

}