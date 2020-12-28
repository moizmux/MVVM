package com.example.mvvm.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.mvvm.R
import com.example.mvvm.adapter.CategoriesPagerAdapter
import com.example.mvvm.databinding.FragmentHomeBinding
import com.example.mvvm.ui.base.BaseActivity
import com.example.mvvm.ui.base.BaseFragment

class HomeFragment  : BaseFragment() {


    lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }



    fun setPagerAapter(){
     binding.pager.adapter = CategoriesPagerAdapter( (activity as BaseActivity) ,childFragmentManager)
     binding.tabLayout.setupWithViewPager(binding?.pager)

    }








} // end of home Fragment
