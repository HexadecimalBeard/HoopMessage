package com.hexadecimal.hoopmessage.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.hexadecimal.hoopmessage.adapter.ChatListAdapter
import com.hexadecimal.hoopmessage.util.GenerateDummyData
import com.hexadecimal.hoopmessage.R
import kotlinx.android.synthetic.main.fragment_chats.*

class ChatsFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chats, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(recycChatList){

            // higher order function yazdik
            adapter = ChatListAdapter(GenerateDummyData.getDummyChatList()) { chatModel ->

                Toast.makeText(activity, chatModel.userName,Toast.LENGTH_SHORT).show()
            }

            // dikey veya yatay olarak listeyi sıralamanı saglar
            // gridlayout da var gruplu bir şekilde hizalar, excel gibi
            layoutManager = LinearLayoutManager(activity)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = ChatsFragment()
    }
}
