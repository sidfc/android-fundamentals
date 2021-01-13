package com.example.viewmodelapp

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    var counter = 0

    fun addOne() {
        counter += 1
    }

}