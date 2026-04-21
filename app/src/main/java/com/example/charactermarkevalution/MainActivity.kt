package com.example.charactermarkevalution

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.charactermarkevalution.ui.theme.CharacterMarkEvalutionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val gradeInput = findViewById<EditText>(R.id.editGrade)
        val resultText = findViewById<TextView>(R.id.txtResult)
        val checkButton = findViewById<Button>(R.id.btnCheck)
        val resetButton = findViewById<Button>(R.id.btnReset)

        checkButton.setOnClickListener {
            val grade = gradeInput.text.toString().uppercase()

            if (grade == "A"){
                resultText.text = "Excellence"
            }
            else if (grade == "B"){
                resultText.text = "Very Good"
            }
            else if (grade == "C"){
                resultText.text = "Good"
            }
            else if (grade == "D"){
                resultText.text = "Pass"
            }
            else if (grade == "E"){
                resultText.text = "Fail"
            }
            else {
                resultText.text = "Invalid Input"
            }


        }
        resetButton.setOnClickListener {
            gradeInput.text.clear()
            resultText.text = "Result will appear here"
        }
    }
}