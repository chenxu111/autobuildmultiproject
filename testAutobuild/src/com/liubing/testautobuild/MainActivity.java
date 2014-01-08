package com.liubing.testautobuild;

import com.liubing.testLibOne.LibOneUtils;
import com.liubing.testlibtwo.LibTwoUtils;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView tvName1;
	TextView tvName2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tvName1 = (TextView)findViewById(R.id.tvName1);
		tvName2 =(TextView)findViewById(R.id.tvName2);
		
		LibOneUtils libOneUtils = new LibOneUtils();
		LibTwoUtils libTwoUtils = new LibTwoUtils();
		tvName1.setText(libOneUtils.getMyName());
		tvName2.setText(libTwoUtils.getMyName());
	}


}
