package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilites.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.Utilites.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

var skillSelected = ""

class skillActivity : BasicActivity() {
    open var league = ""
    object putExtra {
        operator fun invoke(extrA_LEAGUE: String, selectedLeague: String) {

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = Intent.normalizeMimeType(EXTRA_LEAGUE).toString()
        println(league)
    }
    fun onBiginerClicked(view: View){
        ballerSkillBtn.isChecked=false
        skillSelected = "Biginer"
    }

    fun onBallerClicked(view: View){
        biginerSkillBtn.isChecked = false
        skillSelected = "Baller"
    }
    fun onSkillFinishClicked(view: View){
        if (skillSelected != ""){

            val finishActivity = Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL, skillSelected)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select a Skill", Toast.LENGTH_SHORT).show()

        }


    }

}
