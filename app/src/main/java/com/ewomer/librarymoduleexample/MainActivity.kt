package com.ewomer.librarymoduleexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ewomer.imagepicker.ImagePicker
import com.ewomer.librarymoduleexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var imagePicker: ImagePicker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ivPhoto = binding.ivPhoto
        imagePicker = ImagePicker(this, BuildConfig.APPLICATION_ID) { uri ->
            ivPhoto.setImageURI(uri)
        }

        val btChoosePhoto = binding.btChoosePhoto
        btChoosePhoto.setOnClickListener {
            imagePicker.show()
        }
    }


}