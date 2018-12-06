package com.example.codypollard.cwconstruction;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ContactFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ContactFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContactFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ContactFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ContactFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContactFragment newInstance(String param1, String param2) {
        ContactFragment fragment = new ContactFragment();
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
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        ImageButton twitButton = (ImageButton) view.findViewById(R.id.twitButton);
        ImageButton twitButton2 = (ImageButton) view.findViewById(R.id.twitButton2);
        ImageButton email = (ImageButton) view.findViewById(R.id.email);
        ImageButton email2 = (ImageButton) view.findViewById(R.id.email2);
        ImageButton webButton = (ImageButton) view.findViewById(R.id.webButton);
        ImageButton webButton2 = (ImageButton) view.findViewById(R.id.webButton2);
        ImageButton phoneButton = (ImageButton) view.findViewById(R.id.phoneButton);
        ImageButton phoneButton2 = (ImageButton) view.findViewById(R.id.phoneButton);

        //Twitter Button That Will Send you to the twitter website
        twitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri web = Uri.parse("https://twitter.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, web);
                if(intent.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getContext(),
                            "Incorrect software",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Facebook Button That Will Send you to the facebook website
        twitButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri web = Uri.parse("https://www.twitter.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, web);
                if(intent.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getContext(),
                            "Incorrect software",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, "cody.pollard01@stclairconnect.ca");
                intent.putExtra(Intent.EXTRA_SUBJECT, "CW Construction");
                intent.putExtra(Intent.EXTRA_TEXT, "Hello Cody, ");
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
        email2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, "wilson.paz01@stclairconnect.ca");
                intent.putExtra(Intent.EXTRA_SUBJECT, "CW Construction");
                intent.putExtra(Intent.EXTRA_TEXT, "Hello Wilson, ");
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
        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("tel:5191234567"));
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
        phoneButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("tel:5191234567"));
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

//        //Instagram Button That Will Send you to the instagram website
        webButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri web = Uri.parse("https://www.google.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, web);
                if(intent.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getContext(),
                            "Incorrect software",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        webButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri web = Uri.parse("https://www.google.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, web);
                if(intent.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getContext(),
                            "Incorrect software",
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
