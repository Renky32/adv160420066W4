package com.example.adv1606420066w4.view

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class StudentListFragmentArgs(
  public val studentID: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("studentID", this.studentID)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("studentID", this.studentID)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): StudentListFragmentArgs {
      bundle.setClassLoader(StudentListFragmentArgs::class.java.classLoader)
      val __studentID : String?
      if (bundle.containsKey("studentID")) {
        __studentID = bundle.getString("studentID")
        if (__studentID == null) {
          throw IllegalArgumentException("Argument \"studentID\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"studentID\" is missing and does not have an android:defaultValue")
      }
      return StudentListFragmentArgs(__studentID)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): StudentListFragmentArgs {
      val __studentID : String?
      if (savedStateHandle.contains("studentID")) {
        __studentID = savedStateHandle["studentID"]
        if (__studentID == null) {
          throw IllegalArgumentException("Argument \"studentID\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"studentID\" is missing and does not have an android:defaultValue")
      }
      return StudentListFragmentArgs(__studentID)
    }
  }
}
