package com.example.uts101;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class FragmentMatematika extends Fragment{
	ListView lmathq1;
	String[] menumate = {"Volume Bola", "Sudut segi N beraturan", "Baris Aritmatika"};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_matematika, container, false);
		
		lmathq1 = (ListView)rootView.findViewById(R.id.lvmathq1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, menumate);
		lmathq1.setAdapter(adapter);
		lmathq1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				if(arg2 == 0){
					FragmentVolumeBola fragmentvolumebola = new FragmentVolumeBola();
					FragmentManager fragmentManager = getFragmentManager();
					FragmentTransaction ft = fragmentManager.beginTransaction();
					ft.replace(R.id.content_frame, fragmentvolumebola);
					ft.commit();
				}
				else if(arg2 == 1){
					FragmentSudutN fragmentsudutn = new FragmentSudutN();
					FragmentManager fragmentManager = getFragmentManager();
					FragmentTransaction ft = fragmentManager.beginTransaction();
					ft.replace(R.id.content_frame, fragmentsudutn);
					ft.commit();
				}
				else if(arg2 == 2){
					FragmentBarisDeret fragmentbarisderet = new FragmentBarisDeret();
					FragmentManager fragmentManager = getFragmentManager();
        			FragmentTransaction ft = fragmentManager.beginTransaction();
        			ft.replace(R.id.content_frame, fragmentbarisderet);
        			ft.commit();
				}
			}
		});
		
		return rootView;
	}
}
