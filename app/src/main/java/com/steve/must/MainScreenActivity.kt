package com.steve.must

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.steve.must.databinding.ActivityMainScreenBinding

class MainScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_MUST)
        binding= ActivityMainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cardIdea.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.studentPortal.setOnClickListener {
            val intent=Intent(this,StudentPortalActivity::class.java)
            startActivity(intent)

        }
        binding.lms.setOnClickListener {
            val intent=Intent(this,AccomodationActivity::class.java)
            startActivity(intent)

        }
        binding.feeStructure.setOnClickListener {
            val intent=Intent(this,FeeStructureActivity::class.java)
            startActivity(intent)

        }
        binding.library.setOnClickListener {
            val intent = Intent(this, LibraryActivity::class.java)
            startActivity(intent)

        }
        binding.staffportal.setOnClickListener {
            val intent=Intent(this,StaffPortalActivity::class.java)
            startActivity(intent)

        }
        binding.studentEmail.setOnClickListener {
            val intent=Intent(this,StudentEmailActivity::class.java)
            startActivity(intent)

        }
        binding.teachingTimetable.setOnClickListener {
            val intent=Intent(this,TimetableActivity::class.java)
            startActivity(intent)

        }
    }
}