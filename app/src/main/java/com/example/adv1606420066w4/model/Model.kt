package com.example.adv1606420066w4.model

import androidx.recyclerview.widget.RecyclerView
import com.example.adv1606420066w4.databinding.StudentListItemBinding
import com.google.gson.annotations.SerializedName

data class Student(
    val id:String?,
    @SerializedName("student_name")
    val name:String?,
    @SerializedName("birth_of_date")
    val bod:String?,
    val phone:String?,
    @SerializedName("photo_url")
    val photoUrl:String

)

