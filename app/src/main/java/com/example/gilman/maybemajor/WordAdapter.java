package com.example.gilman.maybemajor;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word> {


    public WordAdapter(@NonNull Context context, ArrayList<word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.outputlist, parent, false);
        }

        word currentWord = getItem(position);

        TextView labelTextView = (TextView) listItemView.findViewById(R.id.label_word);

        labelTextView.setText(currentWord.getLabelWord());

        TextView dataTextView = (TextView) listItemView.findViewById(R.id.data_word);

        dataTextView.setText(currentWord.getDataWord());

        return listItemView;
    }
}