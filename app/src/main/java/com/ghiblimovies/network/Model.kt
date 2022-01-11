package com.ghiblimovies

import android.media.Image
import com.google.gson.annotations.SerializedName

data class Movies(
    @SerializedName("id")
    var id : String,
    @SerializedName("description")
    var description : String,
    @SerializedName("title")
    var title : String,
    @SerializedName("image")
    var image : String
)