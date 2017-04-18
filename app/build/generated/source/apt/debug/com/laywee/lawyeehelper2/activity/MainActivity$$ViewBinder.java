// Generated code from Butter Knife. Do not modify!
package com.laywee.lawyeehelper2.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.laywee.lawyeehelper2.activity.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689661, "field 'mToolbarTitle'");
    target.mToolbarTitle = finder.castView(view, 2131689661, "field 'mToolbarTitle'");
    view = finder.findRequiredView(source, 2131689660, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131689660, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131689609, "field 'mFrameLayout'");
    target.mFrameLayout = finder.castView(view, 2131689609, "field 'mFrameLayout'");
    view = finder.findRequiredView(source, 2131689611, "field 'mRbHome'");
    target.mRbHome = finder.castView(view, 2131689611, "field 'mRbHome'");
    view = finder.findRequiredView(source, 2131689612, "field 'mRbSeting'");
    target.mRbSeting = finder.castView(view, 2131689612, "field 'mRbSeting'");
    view = finder.findRequiredView(source, 2131689613, "field 'mRbHelp'");
    target.mRbHelp = finder.castView(view, 2131689613, "field 'mRbHelp'");
    view = finder.findRequiredView(source, 2131689614, "field 'mRbUpdate'");
    target.mRbUpdate = finder.castView(view, 2131689614, "field 'mRbUpdate'");
    view = finder.findRequiredView(source, 2131689610, "field 'mRgMain'");
    target.mRgMain = finder.castView(view, 2131689610, "field 'mRgMain'");
  }

  @Override public void unbind(T target) {
    target.mToolbarTitle = null;
    target.mToolbar = null;
    target.mFrameLayout = null;
    target.mRbHome = null;
    target.mRbSeting = null;
    target.mRbHelp = null;
    target.mRbUpdate = null;
    target.mRgMain = null;
  }
}
