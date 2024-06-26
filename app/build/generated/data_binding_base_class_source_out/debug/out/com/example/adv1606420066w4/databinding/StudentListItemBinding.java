// Generated by view binder compiler. Do not edit!
package com.example.adv1606420066w4.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.adv1606420066w4.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class StudentListItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnDetail;

  @NonNull
  public final Button btnUpdate;

  @NonNull
  public final ImageView imgStudent;

  @NonNull
  public final ProgressBar progressImage;

  @NonNull
  public final TextView txtID;

  @NonNull
  public final TextView txtName;

  private StudentListItemBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnDetail,
      @NonNull Button btnUpdate, @NonNull ImageView imgStudent, @NonNull ProgressBar progressImage,
      @NonNull TextView txtID, @NonNull TextView txtName) {
    this.rootView = rootView;
    this.btnDetail = btnDetail;
    this.btnUpdate = btnUpdate;
    this.imgStudent = imgStudent;
    this.progressImage = progressImage;
    this.txtID = txtID;
    this.txtName = txtName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StudentListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StudentListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.student_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StudentListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDetail;
      Button btnDetail = ViewBindings.findChildViewById(rootView, id);
      if (btnDetail == null) {
        break missingId;
      }

      id = R.id.btnUpdate;
      Button btnUpdate = ViewBindings.findChildViewById(rootView, id);
      if (btnUpdate == null) {
        break missingId;
      }

      id = R.id.imgStudent;
      ImageView imgStudent = ViewBindings.findChildViewById(rootView, id);
      if (imgStudent == null) {
        break missingId;
      }

      id = R.id.progressImage;
      ProgressBar progressImage = ViewBindings.findChildViewById(rootView, id);
      if (progressImage == null) {
        break missingId;
      }

      id = R.id.txtID;
      TextView txtID = ViewBindings.findChildViewById(rootView, id);
      if (txtID == null) {
        break missingId;
      }

      id = R.id.txtName;
      TextView txtName = ViewBindings.findChildViewById(rootView, id);
      if (txtName == null) {
        break missingId;
      }

      return new StudentListItemBinding((ConstraintLayout) rootView, btnDetail, btnUpdate,
          imgStudent, progressImage, txtID, txtName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
