package com.example.mvvm.adapter

import android.content.Context
import android.view.View
import android.widget.TableLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.google.android.material.tabs.TabLayout

class CategoriesPagerAdapter(context:Context , manager: FragmentManager) : FragmentStatePagerAdapter(manager){


    var context : Context
    var category = ArrayList<String>()

    init {
        this.context = context

    }



    override fun getItem(position: Int): Fragment {
    }

    override fun getCount(): Int {
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return super.getPageTitle(position)
    }

    fun getTabView(position: Int): View {

    }

    fun selectTab(tab: TabLayout.Tab , selected:Boolean){


    }




}