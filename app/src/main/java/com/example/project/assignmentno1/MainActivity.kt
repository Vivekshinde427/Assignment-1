package com.example.project.assignmentno1


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference to views
        val nameEditText: EditText = findViewById(R.id.et_name)
        val contactEditText: EditText = findViewById(R.id.et_contact)
        val emailEditText: EditText = findViewById(R.id.et_email)
        val passwordEditText: EditText = findViewById(R.id.et_password)
        val addressEditText: EditText = findViewById(R.id.et_address)
        val submitButton: Button = findViewById(R.id.btn_submit)

        // Handle button click
        submitButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val contact = contactEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val address = addressEditText.text.toString()

            // Simple validation and displaying inputs in a Toast
            if (name.isEmpty() || contact.isEmpty() || email.isEmpty() || password.isEmpty() || address.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                val message = """
                    Name: $name
                    Contact: $contact
                    Email: $email
                    Address: $address
                """.trimIndent()
                Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            }
        }
    }
}
