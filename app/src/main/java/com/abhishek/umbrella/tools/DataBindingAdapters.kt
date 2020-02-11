package com.abhishek.umbrella.tools

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("android:visibility")
fun setVisibility(view: View, isVisible: Boolean) {
    view.visibility = if (isVisible) View.VISIBLE else View.GONE
}

@BindingAdapter("webUri")
fun ImageView.setImageWebUrl(webUri: String?) {
    webUri?.let {
        Glide.with(this)
            .load(webUri)
            .centerCrop()
            .into(this)
    }
}
