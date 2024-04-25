package com.example.examapplication;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout customerName, mobileNumber, emailAddress, productName, productRate, productQuantity;
    CircleImageView myImageViewIcon;
    Button addBtn;
    TextView invoiceNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getOnBackPressedDispatcher().addCallback(MainActivity.this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                alertBox();
            }
        });
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addInvoice();
            }
        });
    }

    void alertBox() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Exit");
        builder.setMessage("Are You Sure ?");

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    void id_Binding() {
        myImageViewIcon = findViewById(R.id.myImageViewIcon);
        invoiceNumber = findViewById(R.id.invoiceNumber);
        addBtn = findViewById(R.id.addBtn);
        customerName = findViewById(R.id.customerName);
        mobileNumber = findViewById(R.id.mobileNumber);
        emailAddress = findViewById(R.id.emailAddress);
        productName = findViewById(R.id.productName);
        productRate = findViewById(R.id.productRate);
        productQuantity = findViewById(R.id.productQuantity);

    }

    void addInvoice() {
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.addinvoice);
        dialog.show();

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String customer_name = customerName
            }
        });
    }
}