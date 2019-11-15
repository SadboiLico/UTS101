package com.example.uts101;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FragmentSeq extends Fragment{
	EditText eseq1, eseq2, eseq3;
	Button bseq1, bseq2, bseq3;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_seq, container, false);
		
		eseq1 = (EditText)rootView.findViewById(R.id.etseq1);
		eseq2 = (EditText)rootView.findViewById(R.id.etseq2);
		eseq3 = (EditText)rootView.findViewById(R.id.etseq3);
		bseq1 = (Button)rootView.findViewById(R.id.btnseq1);
		bseq2 = (Button)rootView.findViewById(R.id.btnseq2);
		bseq3 = (Button)rootView.findViewById(R.id.btnseq3);
		
		bseq1.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String anseq1 = eseq1.getText().toString();
				if(anseq1.equals("R") || anseq1.equals("r")){
					Toast.makeText(getActivity(), "Yes, it's a Gear Stick. Make sense?", Toast.LENGTH_LONG).show();
				}
				else{
					Toast.makeText(getActivity(), "Try again. Think about a car", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		bseq2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int anseq2 = Integer.parseInt(eseq2.getText().toString());
				if(anseq2 == 60){
					Toast.makeText(getActivity(), "Correct", Toast.LENGTH_LONG).show();
				}
				else{
					Toast.makeText(getActivity(), "Try again.", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		bseq3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int anseq3 = Integer.parseInt(eseq3.getText().toString());
				if(anseq3 == 100){
					Toast.makeText(getActivity(), "Yes, Neo. It's in Binary", Toast.LENGTH_LONG).show();
				}
				else{
					Toast.makeText(getActivity(), "No. You chose the wrong pill, Neo.", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		
		return rootView;
	}
}
