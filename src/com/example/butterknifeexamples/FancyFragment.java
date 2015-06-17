package com.example.butterknifeexamples;



import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.InjectViews;
import butterknife.OnClick;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FancyFragment extends Fragment {
	  @InjectView(R.id.button1) Button button1;
	  @InjectView(R.id.button2) Button button2;
	  
	  @InjectView(R.id.editText1) EditText et;
	  @InjectViews({ R.id.first_name, R.id.middle_name, R.id.last_name })
	  List<EditText> nameViews;

	  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	    View view = inflater.inflate(R.layout.frag, container, false);
	    ButterKnife.inject(this, view);
	    // TODO Use "injected" views...
	    return view;
	   
	  }
	  
	  
	  public void reach()
	  {
		  nameViews.add(et); 
	  }
	  
	  @OnClick(R.id.button1)
		public void sayHi(Button buttonA) {
		  buttonA.setText("Hello!");
		}
	  @OnClick(R.id.button2)
		public void sayBye(Button buttonB) {
		  buttonB.setText("GoodBye");
		}
	  
	 
	  
	}