package com.hexadecimal.hoopmessage.util

import com.hexadecimal.hoopmessage.R
import com.hexadecimal.hoopmessage.model.ChatModel


// Created by Melih KOK
// kokmelih@gmail.com
// 14.04.2019 - 11:05

object GenerateDummyData {

    fun getDummyChatList(): ArrayList<ChatModel> = ArrayList<ChatModel>().apply {

        val chatModel = ChatModel(R.drawable.ic_camera_white,
                "Melih",
                "Merhaba ben geldim",
                "Yesterday")

        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
    }

}