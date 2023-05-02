package com.mh.videoplayerapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Video from local storage
        val videoView = findViewById<VideoView>(R.id.videoView1)
        videoView.setVideoPath("android.resource://" + packageName + "/" + R.raw.mountains)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        mediaController.setMediaPlayer(videoView)
        videoView.setMediaController(mediaController)
        videoView.start()

        // Video from internet
        val videoView2 = findViewById<VideoView>(R.id.videoView2)

        val uri = Uri.parse("https://static.videezy.com/system/resources/previews/000/002/231/original/5226496.mp4")

        videoView2.setVideoURI(uri)

        val mediaController2 = MediaController(this)
        mediaController2.setAnchorView(videoView2)
        mediaController2.setMediaPlayer(videoView2)
        videoView2.setMediaController(mediaController2)
        videoView2.start()
    }
}