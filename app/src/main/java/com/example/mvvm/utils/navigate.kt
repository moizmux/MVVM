package com.example.mvvm.utils

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment


class navigate : Fragment() {
    fun fragmentNavigate(resId: Int) {
        NavHostFragment.findNavController(this).navigate(resId)
    }
}