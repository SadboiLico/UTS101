package com.example.uts101;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FragmentMiniquestions extends Fragment{
	EditText eminiq1, eminiq2, eminiq3;
	Button bminiq1, bminiq2, bminiq3;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_miniquestions, container, false);
		
		eminiq1 = (EditText)rootView.findViewById(R.id.etminiq1);
		eminiq2 = (EditText)rootView.findViewById(R.id.etminiq2);
		eminiq3 = (EditText)rootView.findViewById(R.id.etminiq3);
		bminiq1 = (Button)rootView.findViewById(R.id.btnminiq1);
		bminiq2 = (Button)rootView.findViewById(R.id.btnminiq2);
		bminiq3 = (Button)rootView.findViewById(R.id.btnminiq3);
		
		bminiq1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans1 = eminiq1.getText().toString();
				if(ans1.equals("yes") || ans1.equals("Yes") || ans1.equals("YES")){
					Toast.makeText(getActivity(), "I never thought you were smart.. And UGLY", Toast.LENGTH_LONG).show();
				}
				else if(ans1.equals("no") || ans1.equals("No") || ans1.equals("NO")){
					Toast.makeText(getActivity(), "No, you schnitzel. Go learn your ABC!", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		bminiq2.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans2 = eminiq2.getText().toString();
				if(ans2.equals("yes") || ans2.equals("Yes") || ans2.equals("YES")){
					Toast.makeText(getActivity(), "Wrong, don't listen to them. Go back to your pod. Everything's fine. DOC! this one needs an extra dose",Toast.LENGTH_LONG).show();
				}
				else if(ans2.equals("no") || ans2.equals("No") || ans2.equals("NO")){
					Toast.makeText(getActivity(), "Oh fuckkkkk NEOOO YOU SCREW US UPPP! HEELLLPPP--blurpblurpblurp", Toast.LENGTH_LONG ).show();
				}
			}
		});
		
		bminiq3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans3 = eminiq3.getText().toString();
				if(ans3.equals("yes") || ans3.equals("Yes") || ans3.equals("YES") || ans3.equals("no") || ans3.equals("No") || ans3.equals("NO")){
					Toast.makeText(getActivity(), "Nobody knows", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		return rootView;
	}
}
