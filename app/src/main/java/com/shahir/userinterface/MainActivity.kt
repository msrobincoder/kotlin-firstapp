package com.shahir.userinterface

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
// this is the main activity file. This is called by the launcher.
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
