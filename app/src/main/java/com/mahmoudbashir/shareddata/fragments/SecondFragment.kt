package com.mahmoudbashir.shareddata.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mahmoudbashir.shareddata.R


class SecondFragment(): Fragment() {
    val TAG = "SecondFragment"

   // lateinit var secondBinding: FragmentSecondBinding
    lateinit var txt: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val v=inflater.inflate(R.layout.fragment_second, container, false)

        txt = v.findViewById(R.id.txt_observed_result)

        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


      /*  (activity as MainActivity).viewModel
            .count.observe(viewLifecycleOwner,{
                if (it!=null){
                    secondBinding.txtObservedResult.text = it.toString()
                }
            })*/

}
    fun gotResult(r:Int){
        Log.d("mm : ","mm $r")
        txt.text = r.toString()
    }
}