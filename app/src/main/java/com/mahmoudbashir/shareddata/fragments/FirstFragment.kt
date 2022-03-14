package com.mahmoudbashir.shareddata.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.mahmoudbashir.shareddata.R
import com.mahmoudbashir.shareddata.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    lateinit var firstBinding: FragmentFirstBinding
    private val TAG = "FirstFragment"
    var count = 0
    lateinit var sendcI : senCountInterface



    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            sendcI = activity as senCountInterface
        } catch (e:java.lang.ClassCastException) {
            throw  ClassCastException(activity.toString()
                    + " must implement TextClicked")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        firstBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_first, container, false)


        return firstBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        firstBinding.addBtn.setOnClickListener {

           // (activity as MainActivity).viewModel.setCount(++count)
           sendcI.attachedCount(++count)
        }
    }

    interface senCountInterface{
        fun attachedCount(c:Int)
    }

    override fun onDetach() {
       // sendcI = null!!
        super.onDetach()
    }

}