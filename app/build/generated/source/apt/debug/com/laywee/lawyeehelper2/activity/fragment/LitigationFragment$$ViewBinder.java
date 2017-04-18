// Generated code from Butter Knife. Do not modify!
package com.laywee.lawyeehelper2.activity.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LitigationFragment$$ViewBinder<T extends com.laywee.lawyeehelper2.activity.fragment.LitigationFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689646, "field 'tvCaseType' and method 'onClick'");
    target.tvCaseType = finder.castView(view, 2131689646, "field 'tvCaseType'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689648, "field 'tvelementtype' and method 'onClick'");
    target.tvelementtype = finder.castView(view, 2131689648, "field 'tvelementtype'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689651, "field 'tvChargeCase' and method 'onClick'");
    target.tvChargeCase = finder.castView(view, 2131689651, "field 'tvChargeCase'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689652, "field 'tvHalveCase' and method 'onClick'");
    target.tvHalveCase = finder.castView(view, 2131689652, "field 'tvHalveCase'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689647, "field 'lineElementView'");
    target.lineElementView = finder.castView(view, 2131689647, "field 'lineElementView'");
    view = finder.findRequiredView(source, 2131689650, "field 'etPayCase'");
    target.etPayCase = finder.castView(view, 2131689650, "field 'etPayCase'");
    view = finder.findRequiredView(source, 2131689649, "field 'linearPayCase'");
    target.linearPayCase = finder.castView(view, 2131689649, "field 'linearPayCase'");
  }

  @Override public void unbind(T target) {
    target.tvCaseType = null;
    target.tvelementtype = null;
    target.tvChargeCase = null;
    target.tvHalveCase = null;
    target.lineElementView = null;
    target.etPayCase = null;
    target.linearPayCase = null;
  }
}
