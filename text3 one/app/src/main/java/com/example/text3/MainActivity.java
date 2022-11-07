 package com.example.text3;

         import androidx.appcompat.app.AppCompatActivity;

          import android.os.Bundle;
  import android.view.View;
  import android.widget.AdapterView;
  import android.widget.ArrayAdapter;
  import android.widget.ListView;
 import android.widget.Toast;

         import java.util.ArrayList;
 import java.util.List;

         public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
     private List<fruit> fruitList = new ArrayList<>();
     @Override
     protected void onCreate(Bundle savedInstanceState) {
                 super.onCreate(savedInstanceState);
                 setContentView(R.layout.activity_main);
                 initFruits();

                 FruitAdapter arrayAdapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);

                 ListView listView = (ListView) findViewById(R.id.listview);
                 listView.setAdapter(arrayAdapter);

                 listView.setOnItemClickListener(this);

             }

             private void initFruits(){

                     fruit watermelon = new fruit("cat",R.drawable.cat);
                     fruitList.add(watermelon);
                     fruit dog = new fruit("dog",R.drawable.dog);
                     fruitList.add(dog);
                     fruit elephant = new fruit("elephant",R.drawable.elephant);
                     fruitList.add(elephant);
                     fruit lion = new fruit("lion",R.drawable.lion);
                     fruitList.add(lion);
                     fruit monkey= new fruit("monkey",R.drawable.monkey);
                     fruitList.add(monkey);
                     fruit tiger= new fruit("tiger",R.drawable.tiger);
                     fruitList.add(tiger);


             }


             @Override
     public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                fruit fruit = fruitList.get(position);
                 Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
             }}