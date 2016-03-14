package io.epiclabs.couchbase.bookmars;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

/**
 * Created by alvaro on 3/14/16.
 */
public class BookmarksListAdapter extends ArrayAdapter<String> implements ListAdapter {

    public BookmarksListAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);
    }
}
