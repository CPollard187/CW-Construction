package com.example.codypollard.cwconstruction;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link QuoteFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link QuoteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QuoteFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public QuoteFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment QuoteFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static QuoteFragment newInstance(String param1, String param2) {
        QuoteFragment fragment = new QuoteFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

//    final SeekBar seekBar;
//    final TextView textView;
//    final SeekBar seekBar1;
//    final TextView textView1;
      //seekBar = (SeekBar) findViewById(R.id.widthSeekBar);
//    textView = (TextView) findViewById(R.id.widthCount);
//    seekBar1 = (SeekBar) findViewById(R.id.lengthSeekBar);
//    textView1 = (TextView) findViewById(R.id.lengthCount);
//
////Reacts to the seek bar and changes the text from 0 to 100 depending on where the user puts the bar
//        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            int widthSeekBarProgress = 0;
//
//        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//             widthSeekBarProgress = progress;
//            }
//
//        public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//         public void onStopTrackingTouch(SeekBar seekBar) {
//              textView.setText("Width: " + widthSeekBarProgress +  seekBar.getMax());
//              Toast.makeText(getApplicationContext(), "SeekBar Touch Stop ", Toast.LENGTH_SHORT).show();
//            }
//
//           });
//        //Reacts to the seek bar and changes the text from 0 to 100 depending on where the user puts the bar
//            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//                int lengthSeekBarProgress = 0;
//
//                public void onProgressChanged(SeekBar seekBar1, int progress, boolean fromUser) {
//                    lengthSeekBarProgress = progress;
//                }
//
//                public void onStartTrackingTouch(SeekBar seekBar) {
//
//                }
//
//                public void onStopTrackingTouch(SeekBar seekBar1) {
//                    textView.setText("Length: " + lengthSeekBarProgress +  seekBar.getMax());
//                    Toast.makeText(getApplicationContext(), "SeekBar Touch Stop ", Toast.LENGTH_SHORT).show();
//                }
//
//            });
//        }
//        Spinner spinner = (Spinner) findViewById(R.id.materialDropDown);
//// Create an ArrayAdapter using the string array and a default spinner layout
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.R.array.material_array, android.R.layout.simple_spinner_item);
//// Specify the layout to use when the list of choices appears
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//// Apply the adapter to the spinner
//        spinner.setAdapter(adapter);
//
//    Spinner spinner1 = (Spinner) findViewById(R.id.problemDropDown);
//    // Create an ArrayAdapter using the string array and a default spinner layout
//    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this.R.array.problem_array, android.R.layout.simple_spinner_item);
//// Specify the layout to use when the list of choices appears
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//// Apply the adapter to the spinner
//        spinner.setAdapter(adapter1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quote, container, false);

        final EditText lengthText = (EditText) view.findViewById(R.id.lengthBox);
        //final String length = lengthText.getText().toString();

        final EditText widthText = (EditText) view.findViewById(R.id.widthBox);
        //final String width = widthText.getText().toString();

        final EditText problemText = (EditText) view.findViewById(R.id.problemBox);
        //final String problem = problemText.getText().toString();

        final EditText materialText = (EditText) view.findViewById(R.id.materialBox);
        //final String material = materialText.getText().toString();

        final EditText dateText = (EditText) view.findViewById(R.id.dateBox);
        //final String date = dateText.getText().toString();

        final EditText descText = (EditText) view.findViewById(R.id.descBox);
        //final String desc = descText.getText().toString();

        final EditText nameText = (EditText) view.findViewById(R.id.nameBox);
        //final String name = nameText.getText().toString();

        Button email = (Button) view.findViewById(R.id.sendEmailButton);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String width = widthText.getText().toString();
                final String length = lengthText.getText().toString();
                final String name = nameText.getText().toString();
                final String problem = problemText.getText().toString();
                final String material = materialText.getText().toString();
                final String date = dateText.getText().toString();
                final String desc = descText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto: cwconstruct@outlook.com"));
                intent.putExtra(Intent.EXTRA_EMAIL, "cwconstruct@outlook.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Quote Request");
                intent.putExtra(Intent.EXTRA_TEXT, "Hello, I'm " + name + " and I'm requesting a quote from your app 'CW Construction'. I have a "
                                                            + problem + " that needs to be done. It is a " + length + " by " + width
                                                            + " foot area. I would like the material used to be " + material + ". "
                                                            + "I'm available - " + date + ". Additional Instructions: " + desc + ". Thank you!");
                if(intent.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getContext(),
                            "You do not have the correct software",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
