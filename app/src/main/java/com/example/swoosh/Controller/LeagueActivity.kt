package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilites.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BasicActivity() {

    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onMensClicked (view: View){
        womens_league_btn.isChecked = false
        coed_league_btn.isChecked = false
        player.league = "Mens"
    }

    fun onWomensClicked(view: View){
        mens_league_btn.isChecked = false
        coed_league_btn.isChecked = false
        player.league = "Womens"

    }

    fun onCoed_Clicked(view: View){
        mens_league_btn.isChecked = false
        womens_league_btn.isChecked = false
        player.league = "CO-ED"

    }

    fun leagueNextBtn(view: View) = if (player.league!= ""){
        val skill = Intent(this , skillActivity::class.java)
        skill.putExtra(EXTRA_PLAYER,player)
        startActivity(skill)
    }
    else {
        Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
    }
}
