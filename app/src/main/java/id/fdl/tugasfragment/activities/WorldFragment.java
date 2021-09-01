package id.fdl.tugasfragment.activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import id.fdl.tugasfragment.R;

public class WorldFragment extends Fragment {

    public static WorldFragment newInstance(){
        return new WorldFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.world_fragment, container, false);

        Button btn = (Button) view.findViewById(R.id.hellow_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                HelloFragment NAME = new HelloFragment();
                fragmentTransaction.replace(R.id.hello_fragment, NAME);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
