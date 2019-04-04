package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Controller.skillActivity.putExtra
import com.example.swoosh.Utilites.EXTRA_LEAGUE
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BasicActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    fun onMensClicked (view: View){
        womens_league_btn.isChecked = false
        coed_league_btn.isChecked = false
        selectedLeague = "Mens"
    }

    fun onWomensClicked(view: View){
        mens_league_btn.isChecked = false
        coed_league_btn.isChecked = false
        selectedLeague = "Womens"

    }

    fun onCoed_Clicked(view: View){
        mens_league_btn.isChecked = false
        womens_league_btn.isChecked = false
        selectedLeague = "co_ed"

    }

    fun leagueNextBtn(view: View) = if (selectedLeague!= ""){
        val skill = Intent(this , skillActivity::class.java)
        putExtra(EXTRA_LEAGUE,selectedLeague)
        startActivity(skill)
    }
    else {
        Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
    }
}
