// Generated code from Butter Knife. Do not modify!
package com.laywee.lawyeehelper2.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LitigationActivity$$ViewBinder<T extends com.laywee.lawyeehelper2.activity.LitigationActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689661, "field 'toolbarTitle' and method 'onClick'");
    target.toolbarTitle = finder.castView(view, 2131689661, "field 'toolbarTitle'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689660, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131689660, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131689607, "field 'rdoBtnCase' and method 'onClick'");
    target.rdoBtnCase = finder.castView(view, 2131689607, "field 'rdoBtnCase'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689608, "field 'rdoBtnApply' and method 'onClick'");
    target.rdoBtnApply = finder.castView(view, 2131689608, "field 'rdoBtnApply'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689609, "field 'frameLayout'");
    target.frameLayout = finder.castView(view, 2131689609, "field 'frameLayout'");
  }

  @Override public void unbind(T target) {
    target.toolbarTitle = null;
    target.toolbar = null;
    target.rdoBtnCase = null;
    target.rdoBtnApply = null;
    target.frameLayout = null;
  }
}
