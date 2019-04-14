package com.hexadecimal.hoopmessage.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hexadecimal.hoopmessage.R
import com.hexadecimal.hoopmessage.model.ChatModel

// Created by Melih KOK
// kokmelih@gmail.com
// 13.04.2019 - 13:34

// itemView cizdirdigimiz bir ui, sadece bir tane aliyor, kac tane olusturması gerekirse kendisi olusturuyor
// itemview i disaridan parametre olarak aldık
// sonra solid prensipleri geregi iceride olusturduk
class ChatListViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_item_chat_list,
        parent,
        false
    )
) {

    // xml icindeki componentlerin tanımlamalarını yaptık
    private val imgbProfile: ImageView
    private val txtUserName: TextView
    private val txtUserMessage: TextView
    private val txtDate: TextView

    init {
        imgbProfile = itemView.findViewById(R.id.imgbProfile)
        txtUserName = itemView.findViewById(R.id.txtUserName)
        txtUserMessage = itemView.findViewById(R.id.txtUserMessage)
        txtDate = itemView.findViewById(R.id.txtDate)
    }

    fun bind(chatModel: ChatModel, onItemClickListener: (chatModel: ChatModel) -> Unit) {

        imgbProfile.setBackgroundResource(chatModel.profilePhoto)
        txtUserName.text = chatModel.userName
        txtUserMessage.text = chatModel.userMessage
        txtDate.text = chatModel.date

        itemView.setOnClickListener {

            onItemClickListener(chatModel)
        }
    }
}