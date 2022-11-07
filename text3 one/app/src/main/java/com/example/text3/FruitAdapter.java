 package com.example.text3;

         import android.content.Context;
  import android.view.LayoutInflater;
  import android.view.View;
  import android.view.ViewGroup;
  import android.widget.ArrayAdapter;
  import android.widget.ImageView;
  import android.widget.TextView;
  import com.example.text3.R;
  import com.example.text3.fruit;

        import java.util.List;

         public class FruitAdapter extends ArrayAdapter<fruit> {

             private int resourceId;

             public FruitAdapter(Context context, int textViewResourceId, List<fruit> objects){
                 super(context,textViewResourceId,objects);
                 resourceId = textViewResourceId;

             }


             @Override
     public View getView(int position, View convertView, ViewGroup parent){
                 fruit fruit = getItem(position);
                 View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
                 ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
                 TextView fruitName =(TextView) view.findViewById(R.id.fruitname);
                 fruitImage.setImageResource(fruit.getImageId());
                 fruitName.setText(fruit.getName());
                 return view;
             }
 }