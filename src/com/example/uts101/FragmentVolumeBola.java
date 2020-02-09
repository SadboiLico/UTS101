package com.example.uts101;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentVolumeBola extends Fragment{
	EditText evolbola;
	Button bvolbola;
	TextView tvolbola1, tvolbola2, tvolbola3;
	
	
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_volumebola, container, false);
		
		evolbola = (EditText)rootView.findViewById(R.id.etvolbola);
		bvolbola = (Button)rootView.findViewById(R.id.btnvolbola);
		tvolbola1 = (TextView)rootView.findViewById(R.id.tvvolbola1);
		tvolbola2 = (TextView)rootView.findViewById(R.id.tvvolbola2);
		tvolbola3 = (TextView)rootView.findViewById(R.id.tvvolbola3);
		
		bvolbola.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int radius = Integer.parseInt(evolbola.getText().toString());
				int volbola = 4/3*22/7*radius*radius*radius;
				tvolbola1.setText("V = (4/3) x (22/7) x (R^3)");
				tvolbola2.setText("V = 1,33 x 3,14 x (" + String.valueOf(radius) + "^3)");
				tvolbola3.setText("V = " + String.valueOf(volbola));
			}
		});
		
		return rootView;
	}

}
