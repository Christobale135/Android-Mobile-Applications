package com.food.fast.fastfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Food extends AppCompatActivity {
    String items[] = new String[] {"Chicken and Spaghetti: R67.00", "Apple Creme Brulee: R76.00", "Pancakes: R25.00", "Hawaiian: R110.00",
            "Something Meaty: R45.00", "Classic Egg Benedict: R87.00", "Pineapple Hamburger: R95.00", "Chicken Burger: R55.00",
            "Fish and Chips: R40.00", "Orange Slices: R10.00", "Tuna Sandwich: R8.50", "Pineapple and Bacon Sandwich: R16.00", "Egg Salad: R7.50"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ListView listView = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Food.this, items[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
