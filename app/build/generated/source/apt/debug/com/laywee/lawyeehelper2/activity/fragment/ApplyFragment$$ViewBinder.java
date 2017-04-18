// Generated code from Butter Knife. Do not modify!
package com.laywee.lawyeehelper2.activity.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ApplyFragment$$ViewBinder<T extends com.laywee.lawyeehelper2.activity.fragment.ApplyFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689641, "field 'tvCaseApply' and method 'onViewClicked'");
    target.tvCaseApply = finder.castView(view, 2131689641, "field 'tvCaseApply'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689643, "field 'etPayApply' and method 'onViewClicked'");
    target.etPayApply = finder.castView(view, 2131689643, "field 'etPayApply'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689642, "field 'linePayLayout'");
    target.linePayLayout = finder.castView(view, 2131689642, "field 'linePayLayout'");
    view = finder.findRequiredView(source, 2131689644, "field 'tvChargeApply' and method 'onViewClicked'");
    target.tvChargeApply = finder.castView(view, 2131689644, "field 'tvChargeApply'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689645, "field 'tvHalveApply' and method 'onViewClicked'");
    target.tvHalveApply = finder.castView(view, 2131689645, "field 'tvHalveApply'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.tvCaseApply = null;
    target.etPayApply = null;
    target.linePayLayout = null;
    target.tvChargeApply = null;
    target.tvHalveApply = null;
  }
}
