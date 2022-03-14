package com.mahmoudbashir.shareddata.koin

import com.mahmoudbashir.shareddata.viewModel.sharedViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainViewModel = module {
    viewModel {
        sharedViewModel()
    }
}