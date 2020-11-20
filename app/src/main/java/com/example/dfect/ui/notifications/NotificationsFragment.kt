package com.example.dfect.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.dfect.R


class NotificationsFragment : Fragment()  {



    private lateinit var notificationsViewModel: NotificationsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =  ViewModelProvider(this).get(NotificationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notifications, container, false)
        val ListView = root.findViewById<ListView>(R.id.scannedListView)
        val values = arrayOf("Scanned 1", "Scanned 2", "Scanned 3", "Scanned 4", "Scanned 5",
                "Scanned 6", "Scanned 7", "Scanned 8", "Scanned 9", "Scanned 10"
                , "Scanned 11", "Scanned 12", "Scanned 13", "Scanned 14", "Scanned 15")
        val adapter = activity?.let { ArrayAdapter(it, android.R.layout.simple_list_item_1, values) }
        ListView.adapter = adapter
//        val textView: TextView = root.findViewById(R.id.text_notifications)
//
//        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }
}