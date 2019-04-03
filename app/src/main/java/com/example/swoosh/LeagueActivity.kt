package com.example.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View

class LeagueActivity : BasicActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    fun leagueNextBtn(view: View) {
        val skill = Intent(this ,skillActivity::class.java)
        startActivity(skill)
    }
}
