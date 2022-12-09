package au.edu.vu.students.sensorapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class guestHomeFragment extends Fragment {

    Button logOutBtn2;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_guest_home, container, false);

        logOutBtn2 = (Button) v.findViewById(R.id.logOutBtn2);

        logOutBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                NavController nav = Navigation.findNavController(v);
                nav.navigate(R.id.action_guestHomeFragment_to_mainFragment);
            }
        });


        return v;
    }

}