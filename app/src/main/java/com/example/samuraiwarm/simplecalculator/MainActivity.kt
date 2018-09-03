package com.example.samuraiwarm.simplecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set what happens when the CALCULATE! button is clicked
        //we can do this by "id.function()", using the "." operator
        //where 'id' is from your layout file
        button_calculate.setOnClickListener {

            //receive the input inside the editText by using "id.property"
            //we can get the text of editText by using editText.text
            //editText.text is still an Editable, aka Array of Characters
            //so we need to make it toString()
                //note!: since the input may be null,
                //we need to use null-safe "?" for each input
            val firstInput: String? = edittext_first_number.text.toString()
            val secondInput: String? = edittext_second_number.text.toString()

            //variables that are null-safe must have "?" attached
            val firstNumber: Double? = firstInput?.toDoubleOrNull()
            val secondNumber: Double? = secondInput?.toDoubleOrNull()

            var result: Double? = null

            //"is" is the same as "instanceof" in Java, for checking type of your data
            if (firstNumber is Double && secondNumber is Double) {

                //"when" is equivalent to "switch-case" in Java
                //checking the id of a selected radio button
                when (radio_group_operations.checkedRadioButtonId) {

                    //checking each button's id
                    radio_add.id -> result = firstNumber + secondNumber
                    radio_subtract.id -> result = firstNumber - secondNumber
                    radio_multiply.id -> result = firstNumber * secondNumber
                    radio_divide.id -> result = firstNumber / secondNumber

                    //Toast is a small pop-up message on Android screen
                    //requires 3 parameters, context, text, and duration of text.
                    //context is pretty abstract, but it basically represents
                    //the environment of your app. "this" refers to this Activity
                    else -> Toast.makeText(this,
                            "Select the operation first!",
                            Toast.LENGTH_SHORT).show()
                }
                Toast.makeText(this,
                        "The answer is ${result.toString()}",
                        Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this,
                        "Invalid input!",
                        Toast.LENGTH_SHORT).show()
            }
        }
    }
}
