// Generated by view binder compiler. Do not edit!
package com.example.adv1606420066w4.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.adv1606420066w4.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentStudentListBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ProgressBar progressLoad;

  @NonNull
  public final RecyclerView recView;

  @NonNull
  public final SwipeRefreshLayout refreshLayout;

  @NonNull
  public final TextView txtError;

  private FragmentStudentListBinding(@NonNull FrameLayout rootView,
      @NonNull ProgressBar progressLoad, @NonNull RecyclerView recView,
      @NonNull SwipeRefreshLayout refreshLayout, @NonNull TextView txtError) {
    this.rootView = rootView;
    this.progressLoad = progressLoad;
    this.recView = recView;
    this.refreshLayout = refreshLayout;
    this.txtError = txtError;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentStudentListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentStudentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_student_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentStudentListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.progressLoad;
      ProgressBar progressLoad = ViewBindings.findChildViewById(rootView, id);
      if (progressLoad == null) {
        break missingId;
      }

      id = R.id.recView;
      RecyclerView recView = ViewBindings.findChildViewById(rootView, id);
      if (recView == null) {
        break missingId;
      }

      id = R.id.refreshLayout;
      SwipeRefreshLayout refreshLayout = ViewBindings.findChildViewById(rootView, id);
      if (refreshLayout == null) {
        break missingId;
      }

      id = R.id.txtError;
      TextView txtError = ViewBindings.findChildViewById(rootView, id);
      if (txtError == null) {
        break missingId;
      }

      return new FragmentStudentListBinding((FrameLayout) rootView, progressLoad, recView,
          refreshLayout, txtError);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
