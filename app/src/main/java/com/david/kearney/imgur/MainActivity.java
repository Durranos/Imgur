package com.david.kearney.imgur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView;
        RecyclerView.Adapter mAdapter;
        StaggeredGridLayoutManager mLayoutManager;
        String[] myDataset;

        try{
            JSONObject jsonObject = new JSONObject();
        }
        catch(JSONException e){
            System.out.println(e);
        }

        myDataset = new String[]{"David", "Steven", "John", "Carol", "Matthew", "Michael",
                                 "Malissa", "Renita", "Khadijah", "Mika", "Sanda", "Donald",
                                 "Lucille", "Teddy", "Lonna", "Minda", "Launa", "Darrell",
                                 "Norbert", "Sharri", "Angla", "Ara", "Gaynell", "Dina",
                                 "Drew", "Latrina", "Aliza", "Bert", "Marcel", "Clarence",
                                 "Jacquielin", "Huey", "Anderson", "Dawna", "Charlena",
                                 "Alyson", "Eleanore", "Jarod", "Wava", "Marty", "Rey", "Kellye",
                                 "Tatiana", "Lorraine", "Bailey", "Nola"};

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // Improves performance when changes in content
        // do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // Use a Staggered Grid Layout Manager
        mLayoutManager = new StaggeredGridLayoutManager(2, 1);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // Specify an adapter
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.action_settings){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
