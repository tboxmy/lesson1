package com.example.nicholas.sunshine.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new ForecastFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.

    public static class PlaceholderFragment extends Fragment {
        protected List<String> weekForecast = null;
        ArrayAdapter<String> mForecastAdapter = null;
        //ListView lv = null;

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            String[] data = {
                "Mon - Sunny - 30",
                "Tue - Cloudy - 28",
                "Wed - Sunny - 31",
                "Thu - Rain - 27",
                "Fri - Drizzle - 29",
            };
            weekForecast = new ArrayList<~>(Arrays.asList(data) );
        //    weekForecast = new ArrayList<String>() {{
        //        add("Sunny 31");
        //        add("Sunny 35");
        //        add("Cloudy 29");
        //        add("Rain 31");
        //        add("Sunny 35");
        //    }};
            mForcastAdapter = new ArrayAdapter<>(getActivity(),
                    R.layout.list_item_forecast,
                    R.id.list_item_forecast_textView,
                    weekForecast);
            ListView lv = (ListView) rootView.findViewById(R.id.listview_forecast);
            lv.setAdapter(mForecastAdapter);
        }
    }
        **/

}
