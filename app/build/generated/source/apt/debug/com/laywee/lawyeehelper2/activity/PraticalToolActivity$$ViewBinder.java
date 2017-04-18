// Generated code from Butter Knife. Do not modify!
package com.laywee.lawyeehelper2.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PraticalToolActivity$$ViewBinder<T extends com.laywee.lawyeehelper2.activity.PraticalToolActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689661, "field 'mToolbarTitle'");
    target.mToolbarTitle = finder.castView(view, 2131689661, "field 'mToolbarTitle'");
    view = finder.findRequiredView(source, 2131689660, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131689660, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131689615, "field 'mContainer'");
    target.mContainer = finder.castView(view, 2131689615, "field 'mContainer'");
  }

  @Override public void unbind(T target) {
    target.mToolbarTitle = null;
    target.mToolbar = null;
    target.mContainer = null;
  }
}
