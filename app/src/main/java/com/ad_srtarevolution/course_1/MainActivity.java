package com.ad_srtarevolution.course_1;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    TextInputLayout Tp_username,Tp_password;
    EditText Ed_Emailusername,Ed_password;
    Button Bt_Login;
    TextView Tv_reset;
    String username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Kesehatanku");
//        Testing
//        untuk editek form login
        Ed_Emailusername=(EditText)findViewById(R.id.et_Emailusername);
        Ed_password=(EditText)findViewById(R.id.et_password);
//      Text Input Layout
        Tp_username=(TextInputLayout)findViewById(R.id.til_username);
        Tp_password=(TextInputLayout)findViewById(R.id.til_password);
//       Ed_Emailusername.addTextChangedListener(new MyTextWatcher((Ed_Emailusername)));
//        Ed_password.addTextChangedListener(new MyTextWatcher(Ed_password));

//        untuk button form login
        Bt_Login=(Button)findViewById(R.id.btn_login);
        Tv_reset=(TextView)findViewById(R.id.Tv_reset);

        Bt_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitForm();
            }
        });

        Tv_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ed_Emailusername.setText("");
                Ed_password.setText("");
                Toast.makeText(MainActivity.this,"Isi Form Telah Terhapus!",Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void submitForm() {
        username = Ed_Emailusername.getText().toString();
        password= Ed_password.getText().toString();
        if (!validateEmail()) {
            return;
        }
        if (!validatePassword()) {
            return;
        }
        password = Ed_password.getText().toString();
        if (username.equals("kesehatan@mail.com") && password.equals("sehat")) {
            Toast.makeText(getApplicationContext(), "Selamat Datang!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            Bundle b = new Bundle();
            b.putString("email", username);
            intent.putExtras(b);
            startActivity(intent);
        } else {
            Toast.makeText(MainActivity.this, "Email/Password Salah", LENGTH_SHORT).show();
        }
    }

    private class MyTextWatcher implements TextWatcher {

        private View view;

        public MyTextWatcher(View view) {
            this.view = view;
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            switch (view.getId()) {
                case R.id.et_Emailusername:
                    validateEmail();
                    break;
                case R.id.et_password:
                    validatePassword();
                    break;
            }
        }
    }


    //  validasi email
    private boolean validateEmail() {
        String usernamee = Ed_Emailusername.getText().toString().trim();

        if (usernamee.isEmpty() || !isValidUsername(usernamee)) {
            Tp_username.setError("Masukan Email");
            Toast.makeText(MainActivity.this,"Masukan Email Yang Benar!",Toast.LENGTH_SHORT).show();
            RequestFocus(Ed_Emailusername);
            return false;
        } else {
            Tp_username.setErrorEnabled(false);
        }

        return true;
    }
    //  validasi password
    private boolean validatePassword() {
        if (Ed_password.getText().toString().trim().isEmpty()) {
            Tp_password.setError("Masukan Password");
            Toast.makeText(MainActivity.this,"Masukan Password Yang Benar!",Toast.LENGTH_SHORT).show();
            RequestFocus(Ed_password);
            return false;
        } else {
            Tp_password.setErrorEnabled(false);
        }

        return true;
    }

    private static boolean isValidUsername(String usrname){
        return  !TextUtils.isEmpty(usrname)&& Patterns.EMAIL_ADDRESS.matcher(usrname).matches();
    }

    private  void RequestFocus(View view){
        if (view.requestFocus())
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

    }

}
