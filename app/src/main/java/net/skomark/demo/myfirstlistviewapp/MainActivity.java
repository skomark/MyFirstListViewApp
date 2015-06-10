package net.skomark.demo.myfirstlistviewapp;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Initialise the list view adapter.
    ArrayAdapter<String> adapter = new ArrayAdapter<>(
        this,                                                     // context
        android.R.layout.simple_list_item_1,                      // layout used by row views
        getResources().getStringArray(R.array.list_view_items));  // data
    // Attach the adapter to the ListView.
    setListAdapter(adapter);
  }

  // Callback method for "item clicked" events.
  @Override
  protected void onListItemClick(ListView l, View v, int position, long id) {
    super.onListItemClick(l, v, position, id);

    StringBuilder builder = new StringBuilder();
    builder.append(getResources().getString(R.string.toast_msg_click));
    builder.append(" ");
    builder.append(getListAdapter().getItem(position));

    Toast.makeText(this,  builder, Toast.LENGTH_SHORT).show();
  }
}
