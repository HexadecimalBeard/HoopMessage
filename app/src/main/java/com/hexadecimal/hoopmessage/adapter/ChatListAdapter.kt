package com.hexadecimal.hoopmessage.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hexadecimal.hoopmessage.model.ChatModel


// Created by Melih KOK
// kokmelih@gmail.com
// 13.04.2019 - 13:37

// itemcount lazım ama data source yoksa adapter oluşturulurken bir liste almak gerekiyor
// disaridan verdik list i
class ChatListAdapter(
    val chatList: ArrayList<ChatModel>,
    val onItemClickListener: (chatModel: ChatModel) -> Unit
) : RecyclerView.Adapter<ChatListViewHolder>() {

    // kullanacagimiz ui verdik
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatListViewHolder =
        ChatListViewHolder(parent)


    // listelenecek item sayisini verdik
    // data source un size i
    override fun getItemCount(): Int = chatList.size

    // data yi ilgili view lara bağlayan yer
    // icinde hangi pozisyondaki item row un degeri var
    override fun onBindViewHolder(holder: ChatListViewHolder, position: Int) {
        // bind a higher order function vererek onClick olusturduk
        holder.bind(chatList[position], onItemClickListener)
    }
}