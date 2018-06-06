package com.example.maksymg.reditapp

import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.fragment_channel.view.*


class ChannelFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater?.inflate(R.layout.fragment_channel, container, false)
        rootView?.postContainer?.layoutManager = LinearLayoutManager(context)

        return rootView
    }

    companion object {
        fun newInstance(): ChannelFragment{
            return ChannelFragment()
        }
    }
}