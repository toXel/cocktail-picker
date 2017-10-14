package de.toxeldev.cocktailpicker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.cocktail_name
import kotlinx.android.synthetic.main.activity_main.randomize_button
import java.util.Random

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    randomize_button.setOnClickListener { setRandomCocktail() }
  }

  private fun setRandomCocktail() {
    val cocktails = listOf("007", "Ipanema", "Cherry Kiss")

    val number = Random().nextInt(cocktails.size)
    cocktail_name.text = cocktails[number]
  }
}
