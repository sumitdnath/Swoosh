package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilites.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*


class skillActivity : BasicActivity() {

    var  player = Player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        println(player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onBiginerClicked(view: View){
        ballerSkillBtn.isChecked=false
        player.skill = "Biginer"
    }

    fun onBallerClicked(view: View){
        biginerSkillBtn.isChecked = false
        player.skill = "Baller"
    }
    fun onSkillFinishClicked(view: View){
        if (player.skill!= ""){

            val finishActivity = Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select a Skill", Toast.LENGTH_SHORT).show()

        }


    }

}
