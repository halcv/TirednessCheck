package org.h_naka.tirednesscheck;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView m_imageView;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

        initInstance();
    }

    private void initInstance() {
        m_imageView = (ImageView)findViewById(R.id.imageView);
        m_imageView.setImageResource(R.drawable.image);
    }
}
