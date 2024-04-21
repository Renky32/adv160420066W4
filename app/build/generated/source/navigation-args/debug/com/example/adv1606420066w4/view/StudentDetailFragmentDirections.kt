package com.example.adv1606420066w4.view

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.adv1606420066w4.R
import kotlin.Int
import kotlin.String

public class StudentDetailFragmentDirections private constructor() {
  private data class ActionStudentList(
    public val studentID: String
  ) : NavDirections {
    public override val actionId: Int = R.id.actionStudentList

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("studentID", this.studentID)
        return result
      }
  }

  public companion object {
    public fun actionStudentList(studentID: String): NavDirections = ActionStudentList(studentID)
  }
}
