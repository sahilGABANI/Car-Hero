package com.carhero.carherov2.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.Toast
import com.carhero.carherov2.R
import com.carhero.carherov2.databinding.ActivityLoginBinding
import com.carhero.carherov2.ui.home.HomeActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    private fun initUI() {
        setupLinkView()
        binding.btnFacebook.setOnClickListener {
            startActivity(HomeActivity.getIntent(this))
        }
        binding.btnGoogle.setOnClickListener {
            startActivity(HomeActivity.getIntent(this))
        }
    }

    private fun setupLinkView() {
        val text = "By logging in, you agree to CarHero's terms of service and privacy policy."
        val spannableString = SpannableString(text)

        // Set blue color for "terms of service"
        val termsStartIndex = text.indexOf("terms of service")
        val termsEndIndex = termsStartIndex + "terms of service".length
        spannableString.setSpan(
            ForegroundColorSpan(resources.getColor(R.color.colorOnPrimary,null)),
            termsStartIndex,
            termsEndIndex,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        // Set blue color for "privacy policy"
        val privacyStartIndex = text.indexOf("privacy policy")
        val privacyEndIndex = privacyStartIndex + "privacy policy".length
        spannableString.setSpan(
            ForegroundColorSpan(resources.getColor(R.color.colorOnPrimary,null)),
            privacyStartIndex,
            privacyEndIndex,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        // Optionally, make the terms and policy clickable
        spannableString.setSpan(object : ClickableSpan() {
            override fun onClick(widget: View) {
                Toast.makeText(applicationContext, "Terms of Service Clicked", Toast.LENGTH_SHORT).show()
            }
            override fun updateDrawState(ds: android.text.TextPaint) {
                ds.isUnderlineText = false // Remove underline
            }
        }, termsStartIndex, termsEndIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        spannableString.setSpan(object : ClickableSpan() {
            override fun onClick(widget: View) {
                Toast.makeText(applicationContext, "Privacy Policy Clicked", Toast.LENGTH_SHORT).show()
            }
            override fun updateDrawState(ds: android.text.TextPaint) {
                ds.isUnderlineText = false // Remove underline
            }
        }, privacyStartIndex, privacyEndIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.tvTerms.text = spannableString
        binding.tvTerms.movementMethod = LinkMovementMethod.getInstance()
    }
}