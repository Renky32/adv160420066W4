package com.example.adv1606420066w4.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.adv1606420066w4.R

public class StudentListFragmentDirections private constructor() {
  public companion object {
    public fun actionStudentDetail(): NavDirections =
        ActionOnlyNavDirections(R.id.actionStudentDetail)
  }
}
