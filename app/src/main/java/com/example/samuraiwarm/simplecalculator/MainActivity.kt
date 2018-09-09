package com.example.samuraiwarm.simplecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //pseudo-code below
//
//        assign what to do if the button is clicked{
//
//            firstInput = get text from first editText
//            secondInput = get text from second editText
//
//            checkedButtonId = get the id of checked radioButton from the radioGroup
//
//            if(both firstInput and secondInput are Double){
//                when(checked button id){
//                    add button -> add
//                    subtract button -> subtract
//                    ...
//                    else -> ???
//                }
//
//            } else {
//                either firstInput or secondInput are not Double. print error!
//            }
//
//        }
    }
}
