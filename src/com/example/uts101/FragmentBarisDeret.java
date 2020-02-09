package com.example.uts101;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentBarisDeret extends Fragment{
	EditText ebarder1, ebarder2, ebarder3;
	Button bbarder1;
	TextView tvbarder1;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_barisderet, container, false);
		
		ebarder1 = (EditText)rootView.findViewById(R.id.etbarisderet1);
		ebarder2 = (EditText)rootView.findViewById(R.id.etbarisderet2);
		ebarder3 = (EditText)rootView.findViewById(R.id.etbarisderet3);
		bbarder1 = (Button)rootView.findViewById(R.id.btnbarisderet1);
		tvbarder1 = (TextView)rootView.findViewById(R.id.tvbarisderet1);
		
		bbarder1.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int bilbarisderet1 = Integer.parseInt(ebarder1.getText().toString());
				int bilbarisderet2 = Integer.parseInt(ebarder2.getText().toString());
				int bilbarisderet3 = Integer.parseInt(ebarder3.getText().toString());
				int selisih = bilbarisderet2 - bilbarisderet1;
				if(selisih == bilbarisderet3 - bilbarisderet2){
					int jawaban = bilbarisderet3 + selisih;
					tvbarder1.setText("Bilangan selanjutnya adalah "+String.valueOf(jawaban)+" karena selisih pada baris di atas adalah "+String.valueOf(selisih)+".");
				}
				
				else {
					tvbarder1.setText("Maaf, yang Anda masukkan bukanlah baris Aritmatika");
				}
			}
		});
		
		
		return rootView;
	}
}
