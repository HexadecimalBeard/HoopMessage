package com.hexadecimal.hoopmessage.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hexadecimal.hoopmessage.R
import kotlinx.android.synthetic.main.layout_tab.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val chatsFragment by lazy { ChatsFragment.newInstance() }
    private val callsFragment by lazy { CallsFragment.newInstance() }
    private val statusFragment by lazy { StatusFragment.newInstance() }
    private val cameraFragment by lazy { CameraFragment.newInstance() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtCalls.setOnClickListener(this)
        txtChats.setOnClickListener(this)
        txtStatus.setOnClickListener(this)
        imgbCamera.setOnClickListener(this)

        supportFragmentManager.beginTransaction().add(R.id.frmContainer, CameraFragment.newInstance()).commit()
    }

    override fun onClick(v: View) {

        when (v.id) {

            R.id.txtCalls -> {
                supportFragmentManager.beginTransaction().replace(R.id.frmContainer, callsFragment)
                        .commit()
            }
            R.id.txtChats -> {
                supportFragmentManager.beginTransaction().replace(R.id.frmContainer, chatsFragment)
                        .commit()

            }
            R.id.txtStatus -> {
                supportFragmentManager.beginTransaction().replace(R.id.frmContainer, statusFragment)
                        .commit()

            }
            R.id.imgbCamera -> {
                supportFragmentManager.beginTransaction().replace(R.id.frmContainer, cameraFragment)
                        .commit()

            }
        }
    }
}


