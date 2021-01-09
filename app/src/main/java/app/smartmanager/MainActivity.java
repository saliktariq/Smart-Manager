package app.smartmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;

import app.smartmanager.helper.MyApplication;
import app.smartmanager.helper.SendMail;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sendMailButton = (Button) findViewById(R.id.btnSendMail);
        sendMailButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        SendMail email = new SendMail(MyApplication.getContext(),"saliktariq@icloud.com","SmartManager","This is a test");
                        email.execute();
                    }
                });
            }
        });
    }

}
