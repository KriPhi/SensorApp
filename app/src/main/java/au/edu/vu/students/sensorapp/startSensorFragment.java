package au.edu.vu.students.sensorapp;

import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class startSensorFragment extends Fragment {



    Button stopSensorBtn;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_start_sensor, container, false);


        stopSensorBtn = (Button) v.findViewById(R.id.stopSensorBtn);

        stopSensorBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                    NavController nav = Navigation.findNavController(v);
                    nav.navigate(R.id.action_startSensorFragment_to_adminHomeFragment);





            }
        });



        return v;
    }

}