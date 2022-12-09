package au.edu.vu.students.sensorapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class mainFragment extends Fragment {

    Button adminBtn;
    Button guestBtn;
    String user;

    View.OnClickListener adminClickListen = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            NavController nav = Navigation.findNavController(view);
            nav.navigate(R.id.action_mainFragment_to_adminLogin);
            user = "admin";

        }
    };

    View.OnClickListener guestClickListen = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            NavController nav = Navigation.findNavController(view);
            nav.navigate(R.id.action_mainFragment_to_guestHomeFragment);
            user = "guest";


        }
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_main, container, false);
        adminBtn = v.findViewById(R.id.homeAdminBtn);
        guestBtn = v.findViewById(R.id.homeGuestBtn);

        adminBtn.setOnClickListener(adminClickListen);
        guestBtn.setOnClickListener(guestClickListen);



        return v;
    }
}