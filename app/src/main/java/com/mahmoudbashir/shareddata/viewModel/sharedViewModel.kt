package com.mahmoudbashir.shareddata.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class sharedViewModel : ViewModel() {

    val count : MutableLiveData<Int> = MutableLiveData()

    fun setCount(c:Int)=viewModelScope.launch {
        count.postValue(c)
    }

}