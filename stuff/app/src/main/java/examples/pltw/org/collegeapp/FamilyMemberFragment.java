package examples.pltw.org.collegeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by wdumas on 4/8/16.
 */
public class FamilyMemberFragment extends Fragment {

    private TextView firstname;
    private EditText mfirstname;
    private TextView lastname;
    private EditText mlastname;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_family_member, container, false);
        return rootView;
    }

}
