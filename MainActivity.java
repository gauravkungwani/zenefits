package com.example.gauravk.fermedicius;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    int ageposition=0;
    int genderposition=0;
    String s="";
    protected Button selectSportsButton;
    ImageView imageView;
    Button button;
    EditText editText;
    String EditTextValue ;
    Thread thread ;
    public final static int QRcodeWidth = 500 ;
    Bitmap bitmap;
    protected CharSequence[] sports = { "Basketball","Running", "Football",  "Cricket","Badminton" };
    int a=0;
    int g=0;

    protected ArrayList<CharSequence> selectedSports = new ArrayList<CharSequence>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageView);
      //  editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditTextValue = s;

                try {
                    bitmap = TextToImageEncode(EditTextValue);

                    imageView.setImageBitmap(bitmap);

                } catch (WriterException e) {
                    e.printStackTrace();
                }

            }
        });

        // Spinner element
        Button button=(Button) findViewById(R.id.show);
        final Spinner spinner = (Spinner) findViewById(R.id.spinnerTraining);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinnerAge);
        Spinner spinner3= (Spinner) findViewById(R.id.spinnerGender);
        Spinner spinner4 = (Spinner) findViewById(R.id.spinnerExercise);
       // Spinner spinner5 = (Spinner) findViewById(R.id.spinnerSports);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // On selecting a spinner item
                Object value = parent.getItemAtPosition(position);

                    switch (position) {
                        case 0:
                            String item = parent.getItemAtPosition(position).toString();

                            // Showing selected spinner item
                            if (ageposition == 0 || genderposition == 1) {
                                //  Toast.makeText(parent.getContext(), "Selected: " + item + " for 1 hour", Toast.LENGTH_LONG).show();\
                                String s1 = "A:1 B:0 C:0 D:0 ";
                                int i = 0;
                                int h = 0;
                                for (i = 0; i < s.length(); i++) {
                                    if (s.charAt(i) == 'A') {

                                        h = 1;
                                        s = s.substring(0, i) + s.substring(i + 16);
                                        break;
                                    }
                                }
                                if (h == 1) {
                                    s = s.substring(0, i) + "A:1 B:0 C:0 D:0 " + s.substring(i, s.length());
                                } else
                                    s = s.concat(s1);
                            } else if (ageposition == 1 || genderposition == 1) {
                                //  Toast.makeText(parent.getContext(), "Selected: " + item + " for 1 hour", Toast.LENGTH_LONG).show();
                                String s1 = "A:1 B:0 C:0 D:0 ";
                                int i = 0;
                                int h = 0;
                                for (i = 0; i < s.length(); i++) {
                                    if (s.charAt(i) == 'A') {

                                        h = 1;
                                        s = s.substring(0, i) + s.substring(i + 16);
                                        break;
                                    }
                                }
                                if (h == 1) {
                                    s = s.substring(0, i) + "A:1 B:0 C:0 D:0 " + s.substring(i, s.length());
                                } else
                                    s = s.concat(s1);
                            } else if (ageposition == 2 || genderposition == 1) {
                                //  Toast.makeText(parent.getContext(), "Selected: " + item + " for 2 hour", Toast.LENGTH_LONG).show();
                                String s1 = "A:2 B:0 C:0 D:0 ";
                                int i = 0;
                                int h = 0;
                                for (i = 0; i < s.length(); i++) {
                                    if (s.charAt(i) == 'A') {

                                        h = 1;
                                            s = s.substring(0, i) + s.substring(i + 16);
                                        break;
                                    }
                                }
                                if (h == 1) {
                                    s = s.substring(0, i) + "A:2 B:0 C:0 D:0 " + s.substring(i, s.length());
                                } else
                                    s = s.concat(s1);
                            } else if (ageposition == 3 || genderposition == 1) {
                                // Toast.makeText(parent.getContext(), "Selected: " + item + " for 2 hour", Toast.LENGTH_LONG).show();
                                String s1 = "A:2 B:0 C:0 D:0 ";
                                int i = 0;
                                int h = 0;
                                for (i = 0; i < s.length(); i++) {
                                    if (s.charAt(i) == 'A') {

                                        h = 1;
                                        s = s.substring(0, i) + s.substring(i + 16);
                                        break;
                                    }
                                }
                                if (h == 1) {
                                    s = s.substring(0, i) + "A:2 B:0 C:0 D:0 " + s.substring(i, s.length());
                                } else
                                    s = s.concat(s1);
                            }
                            break;
                        case 1:
                            String item2 = parent.getItemAtPosition(position).toString();

                            // Showing selected spinner item
                            if (ageposition == 0 || genderposition == 1) {
                                //   Toast.makeText(parent.getContext(), "Selected: " + item2 + " for 1 hour", Toast.LENGTH_LONG).show();
                                String s1 = "A:0 B:1 C:0 D:0 ";
                                int i = 0;
                                int h = 0;
                                for (i = 0; i < s.length(); i++) {
                                    if (s.charAt(i) == 'A') {

                                        h = 1;
                                        s = s.substring(0, i) + s.substring(i + 16);
                                        break;
                                    }
                                }
                                if (h == 1) {
                                    s = s.substring(0, i) + "A:0 B:1 C:0 D:0 " + s.substring(i, s.length());
                                } else
                                    s = s.concat(s1);
                            } else if (ageposition == 1 || genderposition == 1) {
                                //   Toast.makeText(parent.getContext(), "Selected: " + item2 + " for 1 hour", Toast.LENGTH_LONG).show();
                                String s1 = "A:0 B:1 C:0 D:0 ";
                                int i = 0;
                                int h = 0;
                                for (i = 0; i < s.length(); i++) {
                                    if (s.charAt(i) == 'A') {

                                        h = 1;
                                        s = s.substring(0, i) + s.substring(i + 16);
                                        break;
                                    }
                                }
                                if (h == 1) {
                                    s = s.substring(0, i) + "A:0 B:1 C:0 D:0 " + s.substring(i, s.length());
                                } else
                                    s = s.concat(s1);
                            } else if (ageposition == 2 || genderposition == 1) {
                                //   Toast.makeText(parent.getContext(), "Selected: " + item2 + " for 2 hour", Toast.LENGTH_LONG).show();
                                String s1 = "A:0 B:2 C:0 D:0 ";
                                int i = 0;
                                int h = 0;
                                for (i = 0; i < s.length(); i++) {
                                    if (s.charAt(i) == 'A') {

                                        h = 1;
                                        s = s.substring(0, i) + s.substring(i + 16);
                                        break;
                                    }
                                }
                                if (h == 1) {
                                    s = s.substring(0, i) + "A:0 B:2 C:0 D:0 " + s.substring(i, s.length());
                                } else
                                    s = s.concat(s1);
                            } else if (ageposition == 3 || genderposition == 1) {
                                //  Toast.makeText(parent.getContext(), "Selected: " + item2 + " for 2 hour", Toast.LENGTH_LONG).show();
                                String s1 = "A:0 B:2 C:0 D:0 ";
                                int i = 0;
                                int h = 0;
                                for (i = 0; i < s.length(); i++) {
                                    if (s.charAt(i) == 'A') {

                                        h = 1;
                                        s = s.substring(0, i) + s.substring(i + 16);
                                        break;
                                    }
                                }
                                if (h == 1) {
                                    s = s.substring(0, i) + "A:0 B:2 C:0 D:0 " + s.substring(i, s.length());
                                } else
                                    s = s.concat(s1);
                            }
                            break;
                        case 2:
                            String item3 = parent.getItemAtPosition(position).toString();

                            // Showing selected spinner item
                            if (ageposition == 0 || genderposition == 1) {
                                //   Toast.makeText(parent.getContext(), "Selected: " + item3 + " for 1 hour", Toast.LENGTH_LONG).show();
                                String s1 = "A:0 B:0 C:1 D:0 ";
                                int i = 0;
                                int h = 0;
                                for (i = 0; i < s.length(); i++) {
                                    if (s.charAt(i) == 'A') {

                                        h = 1;
                                        s = s.substring(0, i) + s.substring(i + 16);
                                        break;
                                    }
                                }
                                if (h == 1) {
                                    s = s.substring(0, i) + "A:0 B:0 C:1 D:0 " + s.substring(i, s.length());
                                } else
                                    s = s.concat(s1);
                            } else if (ageposition == 1 || genderposition == 1) {
                                //   Toast.makeText(parent.getContext(), "Selected: " + item3 + " for 1 hour", Toast.LENGTH_LONG).show();
                                String s1 = "A:0 B:0 C:1 D:0 ";
                                int i = 0;
                                int h = 0;
                                for (i = 0; i < s.length(); i++) {
                                    if (s.charAt(i) == 'A') {

                                        h = 1;
                                        s = s.substring(0, i) + s.substring(i + 16);
                                        break;
                                    }
                                }
                                if (h == 1) {
                                    s = s.substring(0, i) + "A:0 B:0 C:1 D:0 " + s.substring(i, s.length());
                                } else
                                    s = s.concat(s1);
                            } else if (ageposition == 2 || genderposition == 1) {
                                //   Toast.makeText(parent.getContext(), "Selected: " + item3 + " for 2 hour", Toast.LENGTH_LONG).show();
                                String s1 = "A:0 B:0 C:2 D:0 ";
                                int i = 0;
                                int h = 0;
                                for (i = 0; i < s.length(); i++) {
                                    if (s.charAt(i) == 'A') {

                                        h = 1;
                                        s = s.substring(0, i) + s.substring(i + 16);
                                        break;
                                    }
                                }
                                if (h == 1) {
                                    s = s.substring(0, i) + "A:0 B:0 C:2 D:0 " + s.substring(i, s.length());
                                } else
                                    s = s.concat(s1);
                            } else if (ageposition == 3 || genderposition == 1) {
                                //  Toast.makeText(parent.getContext(), "Selected: " + item3 + " for 2 hour", Toast.LENGTH_LONG).show();
                                String s1 = "A:0 B:0 C:2 D:0 ";
                                int i = 0;
                                int h = 0;
                                for (i = 0; i < s.length(); i++) {
                                    if (s.charAt(i) == 'A') {

                                        h = 1;
                                        s = s.substring(0, i) + s.substring(i + 16);
                                        break;
                                    }
                                }
                                if (h == 1) {
                                    s = s.substring(0, i) + "A:0 B:0 C:2 D:0 " + s.substring(i, s.length());
                                } else
                                    s = s.concat(s1);
                            }
                            break;
                        case 3:
                            String item4 = parent.getItemAtPosition(position).toString();

                            // Showing selected spinner item
                            if (ageposition == 0 || genderposition == 1) {
                                //   Toast.makeText(parent.getContext(), "Selected: " + item4 + " for 1 hour", Toast.LENGTH_LONG).show();
                                String s1 = "A:0 B:0 C:0 D:1 ";
                                int i = 0;
                                int h = 0;
                                for (i = 0; i < s.length(); i++) {
                                    if (s.charAt(i) == 'A') {

                                        h = 1;
                                        s = s.substring(0, i) + s.substring(i + 16);
                                        break;
                                    }
                                }
                                if (h == 1) {
                                    s = s.substring(0, i) + "A:0 B:0 C:0 D:1 " + s.substring(i, s.length());
                                } else
                                    s = s.concat(s1);
                            } else if (ageposition == 1 || genderposition == 1) {
                                //   Toast.makeText(parent.getContext(), "Selected: " + item4 + " for 1 hour", Toast.LENGTH_LONG).show();
                                String s1 = "A:0 B:0 C:0 D:1 ";
                                int i = 0;
                                int h = 0;
                                for (i = 0; i < s.length(); i++) {
                                    if (s.charAt(i) == 'A') {

                                        h = 1;
                                        s = s.substring(0, i) + s.substring(i + 16);
                                        break;

                                    }
                                }
                                if (h == 1) {
                                    s = s.substring(0, i) + "A:0 B:0 C:0 D:1 " + s.substring(i, s.length());
                                } else
                                    s = s.concat(s1);
                            } else if (ageposition == 2 || genderposition == 1) {
                                //   Toast.makeText(parent.getContext(), "Selected: " + item4 + " for 2 hour", Toast.LENGTH_LONG).show();
                                String s1 = "A:0 B:0 C:0 D:2 ";
                                int i = 0;
                                int h = 0;
                                for (i = 0; i < s.length(); i++) {
                                    if (s.charAt(i) == 'A') {

                                        h = 1;
                                        s = s.substring(0, i) + s.substring(i + 16);
                                        break;
                                    }
                                }
                                if (h == 1) {
                                    s = s.substring(0, i) + "A:0 B:0 C:0 D:2 " + s.substring(i, s.length());
                                } else
                                    s = s.concat(s1);
                            } else if (ageposition == 3 || genderposition == 1) {
                                //  Toast.makeText(parent.getContext(), "Selected: " + item4 + " for 2 hour", Toast.LENGTH_LONG).show();
                                String s1 = "A:0 B:0 C:0 D:2 ";
                                int i = 0;
                                int h = 0;
                                for (i = 0; i < s.length(); i++) {
                                    if (s.charAt(i) == 'A') {

                                        h = 1;
                                        s = s.substring(0, i) + s.substring(i + 16);
                                        break;
                                    }
                                }
                                if (h == 1) {
                                    s = s.substring(0, i) + "A:0 B:0 C:0 D:2 " + s.substring(i, s.length());
                                } else
                                    s = s.concat(s1);
                            }
                            break;


                    }



            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }







         });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // On selecting a spinner item
                Object value = parent.getItemAtPosition(position);
                if(a==0) {
                    switch (position) {
                        case 0:
                            String item = parent.getItemAtPosition(position).toString();
                            ageposition = 0;
                            a = a + 1;
                            // Showing selected spinner item
                            // Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                            break;
                        case 1:
                            String item2 = parent.getItemAtPosition(position).toString();
                            ageposition = 1;
                            a = a + 1;
                            // Showing selected spinner item
                            // Toast.makeText(parent.getContext(), "Selected: " + item2, Toast.LENGTH_LONG).show();
                            break;
                        case 2:
                            String item3 = parent.getItemAtPosition(position).toString();
                            ageposition = 2;
                            a = 1 + a;
                            // Showing selected spinner item
                            //  Toast.makeText(parent.getContext(), "Selected: " + item3, Toast.LENGTH_LONG).show();
                            break;
                        case 3:
                            String item4 = parent.getItemAtPosition(position).toString();
                            ageposition = 3;
                            a = 1 + a;
                            // Showing selected spinner item
                            //  Toast.makeText(parent.getContext(), "Selected: " + item4, Toast.LENGTH_LONG).show();
                            break;
                    }
                }
                else {
                    switch (position) {
                        case 0:
                            String item = parent.getItemAtPosition(position).toString();
                            ageposition = 0;
                            spinner.setSelection(4);
                            // Showing selected spinner item
                           // Toast.makeText(parent.getContext(), "Selected : " +item, Toast.LENGTH_LONG).show();
                            Toast.makeText(parent.getContext(), "ReSelect Training: " , Toast.LENGTH_LONG).show();
                            break;
                        case 1:
                            String item2 = parent.getItemAtPosition(position).toString();
                            ageposition = 1;
                            spinner.setSelection(4);
                            // Showing selected spinner item
                            Toast.makeText(parent.getContext(), "ReSelect Training: " , Toast.LENGTH_LONG).show();
                            break;
                        case 2:
                            String item3 = parent.getItemAtPosition(position).toString();
                            ageposition = 2;
                            spinner.setSelection(4);
                            // Showing selected spinner item
                              Toast.makeText(parent.getContext(), "ReSelect training: " , Toast.LENGTH_LONG).show();
                            break;
                        case 3:
                            String item4 = parent.getItemAtPosition(position).toString();
                            ageposition = 3;
                            spinner.setSelection(4);
                            // Showing selected spinner item
                             Toast.makeText(parent.getContext(), "ReSelect Training: " , Toast.LENGTH_LONG).show();
                            break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // On selecting a spinner item
                Object value = parent.getItemAtPosition(position);
                if(g==0) {
                    switch (position) {
                        case 0:
                            String item = parent.getItemAtPosition(position).toString();
                            g=g+1;
                            genderposition = 0;
                            // Showing selected spinner item
                            //  Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                            break;
                        case 1:
                            String item2 = parent.getItemAtPosition(position).toString();
                            genderposition = 1;
                            g=g+1;
                            // Showing selected spinner item
                            //   Toast.makeText(parent.getContext(), "Selected: " + item2, Toast.LENGTH_LONG).show();
                            break;

                    }
                }
                else {
                    switch (position) {
                        case 0:
                            String item = parent.getItemAtPosition(position).toString();
                            genderposition = 0;
                            spinner.setSelection(4);
                            Toast.makeText(parent.getContext(), "ReSelect Training: " , Toast.LENGTH_LONG).show();
                            // Showing selected spinner item
                            //  Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                            break;
                        case 1:
                            String item2 = parent.getItemAtPosition(position).toString();
                            genderposition = 1;
                            spinner.setSelection(4);
                            Toast.makeText(parent.getContext(), "ReSelect Training: " , Toast.LENGTH_LONG).show();
                            // Showing selected spinner item
                            //   Toast.makeText(parent.getContext(), "Selected: " + item2, Toast.LENGTH_LONG).show();
                            break;

                    }

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              //  s=s.substring(16, s.length());
                // On selecting a spinner item
                Object value = parent.getItemAtPosition(position);
                switch (position) {
                    case 0:
                        String item = parent.getItemAtPosition(position).toString();

                        // Showing selected spinner item

                          //  Toast.makeText(parent.getContext(), "Selected: " + item + " for 1 hour", Toast.LENGTH_LONG).show();
                            String s1="P:1 Q:0 R:0 S:0 ";
                            int i=0;
                            int h=0;
                        for(i=0;i<s.length();i++) {
                            if (s.charAt(i) == 'P') {

                                h=1;
                                s= s.substring(0, i) + s.substring(i+16);

                                break;
                            }
                        }
                        if(h==1) {
                            s = s.substring(0, i) + "P:1 Q:0 R:0 S:0 " + s.substring(i, s.length());
                        }
                        else
                            s = s.concat(s1);

                        break;
                    case 1:
                        String item2 = parent.getItemAtPosition(position).toString();

                        // Showing selected spinner item

                         //   Toast.makeText(parent.getContext(), "Selected: " + item2 + " for 1 hour", Toast.LENGTH_LONG).show();
                            String s2="P:0 Q:1 R:0 S:0 ";
                            int i1;
                            int h1=0;
                        for( i1=0;i1<s.length();i1++) {
                            if (s.charAt(i1) == 'P') {
                                h1=1;

                                s= s.substring(0, i1) + s.substring(i1+16);
                                break;
                            }
                        }
                        if(h1==1) {
                            s = s.substring(0, i1) + "P:0 Q:1 R:0 S:0 " + s.substring(i1, s.length());
                        }
                        else
                            s = s.concat(s2);

                        break;
                    case 2:
                        String item3 = parent.getItemAtPosition(position).toString();

                        // Showing selected spinner item

                         //   Toast.makeText(parent.getContext(), "Selected: " + item3 + " for 1 hour", Toast.LENGTH_LONG).show();
                            String s3="P:0 Q:0 R:1 S:0 ";
                            int h2=0;
                            int i3=0;
                        for( i3=0;i3<s.length();i3++) {
                            if (s.charAt(i3) == 'P') {

                                h2=1;
                                s= s.substring(0, i3) + s.substring(i3+16);
                                break;
                            }
                        }
                        if(h2==1) {
                            s = s.substring(0, i3) + "P:0 Q:0 R:1 S:0 " + s.substring(i3, s.length());
                        }
                        else
                            s = s.concat(s3);


                        break;
                    case 3:
                        String item4 = parent.getItemAtPosition(position).toString();

                        // Showing selected spinner item

                         //   Toast.makeText(parent.getContext(), "Selected: " + item4 + " for 1 hour", Toast.LENGTH_LONG).show();
                            String s4="P:0 Q:0 R:0 S:1 ";
                            int i4=0;
                            int h3=0;
                        for( i4=0;i4<s.length();i4++) {
                            if (s.charAt(i4) == 'P') {

                                h3=1;
                                s= s.substring(0, i4) + s.substring(i4+16);
                                break;
                            }
                        }
                        if(h3==1) {
                            s = s.substring(0, i4) + "P:0 Q:0 R:0 S:1 " + s.substring(i4, s.length());
                        }
                        else
                            s = s.concat(s4);

                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
      /*  spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // On selecting a spinner item
                Object value = parent.getItemAtPosition(position);
                switch (position) {
                    case 0:
                        String item = parent.getItemAtPosition(position).toString();

                        // Showing selected spinner item
                        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        String item2 = parent.getItemAtPosition(position).toString();

                        // Showing selected spinner item
                        Toast.makeText(parent.getContext(), "Selected: " + item2, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        String item3 = parent.getItemAtPosition(position).toString();

                        // Showing selected spinner item
                        Toast.makeText(parent.getContext(), "Selected: " + item3, Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        String item4 = parent.getItemAtPosition(position).toString();

                        // Showing selected spinner item
                        Toast.makeText(parent.getContext(), "Selected: " + item4, Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        String item5 = parent.getItemAtPosition(position).toString();

                        // Showing selected spinner item
                        Toast.makeText(parent.getContext(), "Selected: " + item5, Toast.LENGTH_LONG).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        */
        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Gym");
        categories.add("Physical");
        categories.add("Martial Arts");
        categories.add("Driving");
        categories.add("None");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        List<String> categories2 = new ArrayList<String>();
        categories2.add("Less than 10");
        categories2.add("10 – 15");
        categories2.add("16 – 40");
        categories2.add("Above 40");



        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories2);

        // Drop down layout style - list view with radio button
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner2.setAdapter(dataAdapter2);

        List<String> categories3 = new ArrayList<String>();
        categories3.add("Male");
        categories3.add("Female");




        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories3);

        // Drop down layout style - list view with radio button
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner3.setAdapter(dataAdapter3);

        List<String> categories4 = new ArrayList<String>();
        categories4.add("Streching");
        categories4.add("Pull ups");
        categories4.add("Push ups");
        categories4.add("Crunches");




        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories4);

        // Drop down layout style - list view with radio button
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner4.setAdapter(dataAdapter4);

       /* List<String> categories5 = new ArrayList<String>();
        categories5.add("Swimming");
        categories5.add("Football");
        categories5.add("Rugby");
        categories5.add("Running");
        categories5.add("Dance");



        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories5);

        // Drop down layout style - list view with radio button
        dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner5.setAdapter(dataAdapter5);

        */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),   s, Toast.LENGTH_LONG).show();
            }
        });





            selectSportsButton = (Button) findViewById(R.id.select_sport);

            selectSportsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch(view.getId()) {

                        case R.id.select_sport:
                            showSelectColoursDialog();
                            // TODO: Show the colours dialog

                            break;

                        default:

                            break;

                    }
                }
            });




    }
    Bitmap TextToImageEncode(String Value) throws WriterException {
        BitMatrix bitMatrix;
        try {
            bitMatrix = new MultiFormatWriter().encode(
                    Value,
                    BarcodeFormat.DATA_MATRIX.QR_CODE,
                    QRcodeWidth, QRcodeWidth, null
            );

        } catch (IllegalArgumentException Illegalargumentexception) {

            return null;
        }
        int bitMatrixWidth = bitMatrix.getWidth();

        int bitMatrixHeight = bitMatrix.getHeight();

        int[] pixels = new int[bitMatrixWidth * bitMatrixHeight];

        for (int y = 0; y < bitMatrixHeight; y++) {
            int offset = y * bitMatrixWidth;

            for (int x = 0; x < bitMatrixWidth; x++) {

                pixels[offset + x] = bitMatrix.get(x, y) ?
                        getResources().getColor(R.color.QRCodeBlackColor):getResources().getColor(R.color.QRCodeWhiteColor);
            }
        }
        Bitmap bitmap = Bitmap.createBitmap(bitMatrixWidth, bitMatrixHeight, Bitmap.Config.ARGB_4444);

        bitmap.setPixels(pixels, 0, 500, 0, 0, bitMatrixWidth, bitMatrixHeight);
        return bitmap;
    }

    protected void showSelectColoursDialog() {

        boolean[] checkedColours = new boolean[sports.length];

        int count = sports.length;

        for(int i = 0; i < count; i++)

            checkedColours[i] = selectedSports.contains(sports[i]);

        DialogInterface.OnMultiChoiceClickListener coloursDialogListener = new DialogInterface.OnMultiChoiceClickListener() {

            @Override

            public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                if(isChecked){

                    selectedSports.add(sports[which]);
                    switch (which){
                        case 0:
                            String s1="V:1 ";
                            s=s.concat(s1);
                            break;
                        case 1:
                            String s2="W:1 ";
                            s=s.concat(s2);
                            break;
                        case 2:
                            String s3="X:1 ";
                            s=s.concat(s3);
                            break;
                        case 3:
                            String s4="Y:1 ";
                            s=s.concat(s4);
                            break;
                        case 4:
                            String s5="Z:1 ";
                            s=s.concat(s5);
                            break;
                    }

                }
                else {

                    selectedSports.remove(sports[which]);
                    switch (which){
                        case 0:
                            // s=s.substring(0, s.length() - 4);
                            char c ='V'; //character c is static...can be modified to accept user input

                            for(int i=0;i<s.length();i++) {
                                if (s.charAt(i) == c) {
                                    s=s.substring(0, i) + s.substring(i+ 4);
                                }
                            }

                            break;
                        case 1:
                            char c1 ='W'; //character c is static...can be modified to accept user input

                            for(int i=0;i<s.length();i++) {
                                if (s.charAt(i) == c1) {
                                    s=s.substring(0, i) + s.substring(i+ 4);
                                }
                            }

                            break;
                        case 2:
                            char c2 ='X'; //character c is static...can be modified to accept user input

                            for(int i=0;i<s.length();i++) {
                                if (s.charAt(i) == c2) {
                                    s=s.substring(0, i) + s.substring(i+ 4);
                                }
                            }

                            break;
                        case 3:
                            char c3 ='Y'; //character c is static...can be modified to accept user input

                            for(int i=0;i<s.length();i++) {
                                if (s.charAt(i) == c3) {
                                    s=s.substring(0, i) + s.substring(i+ 4);
                                }
                            }

                            break;
                        case 4:
                            char c4 ='Z'; //character c is static...can be modified to accept user input

                            for(int i=0;i<s.length();i++) {
                                if (s.charAt(i) == c4) {
                                    s=s.substring(0, i) + s.substring(i+ 4);
                                }
                            }

                            break;
                    }
                }
                onChangeSelectedColours();

            }

        };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Select Colours");

        builder.setMultiChoiceItems(sports, checkedColours, coloursDialogListener);

        AlertDialog dialog = builder.create();

        dialog.show();

    }

    protected void onChangeSelectedColours() {

        StringBuilder stringBuilder = new StringBuilder();

        for(CharSequence colour : selectedSports)

            stringBuilder.append(colour + " ");

        selectSportsButton.setText(stringBuilder.toString());

    }


}
