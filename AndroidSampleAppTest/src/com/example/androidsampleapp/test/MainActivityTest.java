package com.example.androidsampleapp.test;

import com.example.androidsampleapp.MainActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
	private MainActivity activity;
	private TextView view;
	private Object resourceString;
	public MainActivityTest() {

        super("com.example.androidsampleapp", MainActivity.class);

    }
	
	@Override

	protected void setUp() throws Exception {
		super.setUp();
		activity = getActivity();
		view = (TextView) activity.findViewById(com.example.androidsampleapp.R.id.textView);
		resourceString = activity.getString(com.example.androidsampleapp.R.string.hello_world);
	}
	
	public void testText() throws Exception {
		assertNotNull(view.getText().toString(), resourceString);
	}
}
