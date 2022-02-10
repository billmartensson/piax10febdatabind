package se.magictechnology.piax10febdatabind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import se.magictechnology.piax10febdatabind.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var fruit = "Banan"

    var thenumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.sometext = fruit

        binding.somenumber = thenumber

        binding.clickButton.setOnClickListener {
            fruit = "Kiwi"

            //binding.sometext = "Kiwi"

            thenumber = thenumber + 1
            binding.somenumber = thenumber
        }
    }
}