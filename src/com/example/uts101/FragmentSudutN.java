package com.example.uts101;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentSudutN extends Fragment{
	EditText esudut;
	Button bsudut;
	TextView tsudut1, tsudut2;
	
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_sudutn, container, false);
		
		esudut = (EditText)rootView.findViewById(R.id.etsudut1);
		bsudut = (Button)rootView.findViewById(R.id.btnsudut);
		tsudut1 = (TextView)rootView.findViewById(R.id.tvsudut1);
		tsudut2 = (TextView)rootView.findViewById(R.id.tvsudut2);
		
		int jumlahsisi = Integer.parseInt(esudut.getText().toString());
		
		if(jumlahsisi < 3){
			tsudut1.setText("Maaf, sebuah bangun harus memiliki minimal 3 sisi");
			tsudut2.setText(" ");
		}
		else {
			int nilaisudut = 360/jumlahsisi;
			tsudut1.setText("Nilai sudut = 360 / " + String.valueOf(jumlahsisi));
			tsudut2.setText("Nilai sudut = " + String.valueOf(nilaisudut));
		}
		
		return rootView;
	}

}
