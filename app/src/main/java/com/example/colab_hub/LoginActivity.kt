package com.example.colab_hub

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val gwidInput = findViewById<EditText>(R.id.editTextGWID)
        val passwordInput = findViewById<EditText>(R.id.editTextPassword)
        val loginButton = findViewById<Button>(R.id.buttonLogin)
        val forgotPasswordText = findViewById<TextView>(R.id.textForgotPassword)

        loginButton.setOnClickListener {
            val gwid = gwidInput.text.toString()
            val password = passwordInput.text.toString()

            // Implement authentication logic here
            if (validateCredentials(gwid, password)) {
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }

        forgotPasswordText.setOnClickListener {
            // Implement forgot password/reset functionality here
            Toast.makeText(this, "Forgot Password clicked", Toast.LENGTH_SHORT).show()
        }
    }

    private fun validateCredentials(gwid: String, password: String): Boolean {
        // Placeholder for actual authentication logic
        return gwid.isNotEmpty() && password.isNotEmpty()
    }
}
