// Generated by view binder compiler. Do not edit!
package com.example.adv1606420066w4.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.adv1606420066w4.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentStudentDetailBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextInputLayout textInputLayout;

  @NonNull
  public final TextInputLayout textInputLayout2;

  @NonNull
  public final TextInputLayout textInputLayout3;

  @NonNull
  public final TextInputLayout textInputLayout4;

  @NonNull
  public final TextInputEditText txtBOD;

  @NonNull
  public final TextInputEditText txtID;

  @NonNull
  public final TextInputEditText txtName;

  @NonNull
  public final TextInputEditText txtNumber;

  private FragmentStudentDetailBinding(@NonNull FrameLayout rootView, @NonNull Button button,
      @NonNull ImageView imageView2, @NonNull TextInputLayout textInputLayout,
      @NonNull TextInputLayout textInputLayout2, @NonNull TextInputLayout textInputLayout3,
      @NonNull TextInputLayout textInputLayout4, @NonNull TextInputEditText txtBOD,
      @NonNull TextInputEditText txtID, @NonNull TextInputEditText txtName,
      @NonNull TextInputEditText txtNumber) {
    this.rootView = rootView;
    this.button = button;
    this.imageView2 = imageView2;
    this.textInputLayout = textInputLayout;
    this.textInputLayout2 = textInputLayout2;
    this.textInputLayout3 = textInputLayout3;
    this.textInputLayout4 = textInputLayout4;
    this.txtBOD = txtBOD;
    this.txtID = txtID;
    this.txtName = txtName;
    this.txtNumber = txtNumber;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentStudentDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentStudentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_student_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentStudentDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.textInputLayout;
      TextInputLayout textInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout == null) {
        break missingId;
      }

      id = R.id.textInputLayout2;
      TextInputLayout textInputLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout2 == null) {
        break missingId;
      }

      id = R.id.textInputLayout3;
      TextInputLayout textInputLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout3 == null) {
        break missingId;
      }

      id = R.id.textInputLayout4;
      TextInputLayout textInputLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout4 == null) {
        break missingId;
      }

      id = R.id.txtBOD;
      TextInputEditText txtBOD = ViewBindings.findChildViewById(rootView, id);
      if (txtBOD == null) {
        break missingId;
      }

      id = R.id.txtID;
      TextInputEditText txtID = ViewBindings.findChildViewById(rootView, id);
      if (txtID == null) {
        break missingId;
      }

      id = R.id.txtName;
      TextInputEditText txtName = ViewBindings.findChildViewById(rootView, id);
      if (txtName == null) {
        break missingId;
      }

      id = R.id.txtNumber;
      TextInputEditText txtNumber = ViewBindings.findChildViewById(rootView, id);
      if (txtNumber == null) {
        break missingId;
      }

      return new FragmentStudentDetailBinding((FrameLayout) rootView, button, imageView2,
          textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, txtBOD, txtID,
          txtName, txtNumber);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}