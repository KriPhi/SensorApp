package au.edu.vu.students.sensorapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class adminLogin extends Fragment {
    EditText textPassword;
    Button loginBtn;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_admin_login, container, false);

        textPassword = v.findViewById(R.id.textPassword);
        loginBtn = v.findViewById(R.id.loginBtn);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textPassword.getText().toString().equals("admin")) {
                    Toast.makeText(getContext(), "Authenticated", Toast.LENGTH_SHORT).show();
                    NavController nav = Navigation.findNavController(v);
                    nav.navigate(R.id.action_adminLogin_to_adminHomeFragment);



                } else {
                    Toast.makeText(getContext(), "Wrong Password", Toast.LENGTH_SHORT).show();
                }

            }


        });



        return v;
    }
}







