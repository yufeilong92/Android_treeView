// Generated code from Butter Knife. Do not modify!
package com.laywee.lawyeehelper2.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CalcuPeriodActivity$$ViewBinder<T extends com.laywee.lawyeehelper2.activity.CalcuPeriodActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689592, "field 'mRbNormal'");
    target.mRbNormal = finder.castView(view, 2131689592, "field 'mRbNormal'");
    view = finder.findRequiredView(source, 2131689593, "field 'mRbWorkday'");
    target.mRbWorkday = finder.castView(view, 2131689593, "field 'mRbWorkday'");
    view = finder.findRequiredView(source, 2131689591, "field 'mRgConvert'");
    target.mRgConvert = finder.castView(view, 2131689591, "field 'mRgConvert'");
    view = finder.findRequiredView(source, 2131689594, "field 'mTvStart' and method 'onClick'");
    target.mTvStart = finder.castView(view, 2131689594, "field 'mTvStart'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689601, "field 'mTvEnd' and method 'onClick'");
    target.mTvEnd = finder.castView(view, 2131689601, "field 'mTvEnd'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689606, "field 'mTvValue'");
    target.mTvValue = finder.castView(view, 2131689606, "field 'mTvValue'");
    view = finder.findRequiredView(source, 2131689661, "field 'mToolbarTitle'");
    target.mToolbarTitle = finder.castView(view, 2131689661, "field 'mToolbarTitle'");
    view = finder.findRequiredView(source, 2131689660, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131689660, "field 'mToolbar'");
  }

  @Override public void unbind(T target) {
    target.mRbNormal = null;
    target.mRbWorkday = null;
    target.mRgConvert = null;
    target.mTvStart = null;
    target.mTvEnd = null;
    target.mTvValue = null;
    target.mToolbarTitle = null;
    target.mToolbar = null;
  }
}
