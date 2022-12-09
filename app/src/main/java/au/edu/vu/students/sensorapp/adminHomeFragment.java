package au.edu.vu.students.sensorapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class adminHomeFragment extends Fragment {
    Button logOutBtn, startSensorBtn;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_admin_home, container, false);




        logOutBtn = (Button) v.findViewById(R.id.logOutBtn);
        startSensorBtn = (Button) v.findViewById(R.id.startSensorBtn);

        logOutBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                NavController nav = Navigation.findNavController(v);
                nav.navigate(R.id.action_adminHomeFragment_to_mainFragment);
            }
        });

        startSensorBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                NavController nav = Navigation.findNavController(v);
                nav.navigate(R.id.action_adminHomeFragment_to_startSensorFragment);

            }
        });


        return v;
    }

}