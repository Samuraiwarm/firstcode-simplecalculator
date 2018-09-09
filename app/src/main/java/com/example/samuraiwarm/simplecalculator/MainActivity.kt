package com.example.samuraiwarm.simplecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

//if you know Java, this is "class MainActivity extends AppCompatActivity()"
//MainActivity is a child class of Activity(),
//but AppCompatActivity() is a better class that
//supports App Compatibility for older versions
class MainActivity : AppCompatActivity() {

    //every time the app is created, this function will be called
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set what happens when the CALCULATE! button is clicked
        //even though CALCULATE! button should do the task many many times,
        //we only need to *assign* its task ONCE!

        //we can do this by "id.function()", using the "." operator
        //where 'id' is from your layout file
        button_calculate.setOnClickListener {

            //receive the input inside the editText by using "id.property"
            //we can get the text of editText by using editText.text
            //editText.text is still an Editable, aka Array of Characters
            //so we need to make it toString()
            //note!: since the input may be null,
            //we need to use null-safe type "?" for each input
            val firstInput: String? = edittext_first_number.text.toString()
            val secondInput: String? = edittext_second_number.text.toString()

            //variables that are null-safe must have "?" attached
//          val firstNumber: Double? = firstInput.toDoubleOrNull() //Error!
            val firstNumber: Double? = firstInput?.toDoubleOrNull()
            val secondNumber: Double? = secondInput?.toDoubleOrNull()

            //get the id of checked item
            val checkedButtonId: Int? = radio_group_operations.checkedRadioButtonId

            //"is" is the same as "instanceof" in Java, for checking type of your data
            if (firstNumber is Double && secondNumber is Double) {

                //extra! all variables that are defined in if-else / for loop
                //will not exist outside that statement.
                var result: Double? = null

                //"when" is equivalent to "switch-case" in Java
                //this is checking what the id of a checked button is
                when (checkedButtonId) {

                    radio_add.id -> result = firstNumber + secondNumber
                    radio_subtract.id -> result = firstNumber - secondNumber
                    radio_multiply.id -> result = firstNumber * secondNumber
                    radio_divide.id -> result = firstNumber / secondNumber

                    else -> text_answer.text = "Select the operation first!"
                }
                text_answer.text = "The answer is ${result.toString()}"
            } else {
                text_answer.text = "Invalid input!"
            }
        }
    }
}
