package com.example.tempapplication.util.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.tempapplication.databinding.ItemTestRecyclerBinding

// 번장의 AccountAdapter 확인
class TestAdapter(val context: FragmentActivity?): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var testdatas = mutableListOf<TestData>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = ItemTestRecyclerBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(context, itemBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolder).bind(testdatas[position])
    }

    override fun getItemCount(): Int = testdatas.size

    class ViewHolder(val context: FragmentActivity?, val binding: ItemTestRecyclerBinding): RecyclerView.ViewHolder(binding.root){

        private val testText : TextView = binding.txtTest

        fun bind(item: TestData){
            testText.text = item.test
        }

    }
}