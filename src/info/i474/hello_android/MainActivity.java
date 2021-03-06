package info.i474.hello_android;

import java.util.Date;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void buttonCurrent_onClick(View view) {
    	Log.d("CurrentTime", new Date().toString());
    	
    	Toast toast = Toast.makeText(this, new Date().toString(),  Toast.LENGTH_LONG);
    	toast.show();
    }
}
