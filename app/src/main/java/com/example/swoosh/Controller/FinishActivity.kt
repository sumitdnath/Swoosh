package com.example.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import com.example.swoosh.Utilites.EXTRA_LEAGUE
import com.example.swoosh.Utilites.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = Intent.normalizeMimeType(EXTRA_LEAGUE)
        val skill = Intent.normalizeMimeType(EXTRA_SKILL)

        searchLeaguesText.text = "Looking For $league $skill near you..."
    }
}
