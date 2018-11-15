package com.example.gilman.maybemajor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {
    //TextView labeltext, datatext;
    ArrayList<String> resultList;
    ListView resultListView;
    ArrayAdapter<String> resultAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_result);
        Intent intent=getIntent();
        ArrayList<String> result=new ArrayList<>();
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        String[] Label, Data;
        Label=intent.getStringArrayExtra("boom");
        Data=intent.getStringArrayExtra("bing");
        String[][] coloumns={Label,Data};
        result=intent.getStringArrayListExtra("finalArray");
        ArrayList<word> words=new ArrayList<>();
        for(int i=0;i<Label.length;i++)
        {
            words.add(new word(Label[i],Data[i]));
        }
        WordAdapter wordAdapter = new WordAdapter(this,words);
//        resultAdapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_2,Label);
        resultListView=findViewById(R.id.list);
        resultListView.setAdapter(wordAdapter);
        wordAdapter.notifyDataSetChanged();
//        resultAdapter.addAll(result);
//        int i=0;
//        while(Label[i]!=null){
//            String item=Label[i]+" : " +Data[i];
//            resultAdapter.add(item);
//            i++;
//        }




//        String Labelfull = null,Datafull = null;
//        labeltext = (TextView) findViewById(R.id.label1);
//        datatext= (TextView) findViewById(R.id.data1);
//        for (int i=0;i<Label.length;i++)
//        {
//            Labelfull+=Label[i]+"\n";
//        }
//        for (int i=0;i<Data.length;i++)
//        {
//            Datafull+=Data[i]+"\n";
//        }
//        labeltext.append(Labelfull);
//        datatext.append(Datafull);

    }
}
